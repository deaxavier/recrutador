package br.fiap.andreaxavier.recrutador.repositories;

import br.fiap.andreaxavier.recrutador.dto.response.CandidatosVaga;
import br.fiap.andreaxavier.recrutador.entities.VagaEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VagaRepository extends CrudRepository<VagaEntity, Integer> {
    @Query(value = "SELECT\n" +
            "    TC.NM_CANDIDATO AS Candidato,\n" +
            "    TV.DS_NOME AS Vaga,\n" +
            "   TC.DS_CPF AS Cpf,\n" +
            "   TC.DS_CELULAR AS Celular,\n" +
            "    SUM(TVS.NIVEL_SKILL) AS Classificacao\n" +
            "FROM TB_VAGAS TV\n" +
            "INNER JOIN TB_VAGA_CANDIDATOS TVC ON TV.ID_VAGA = TVC.ID_VAGA\n" +
            "INNER JOIN TB_CANDIDATOS TC ON TVC.ID_CANDIDATO = TC.ID_CANDIDATO\n" +
            "INNER JOIN TB_VAGA_SKILLS TVS ON TV.ID_VAGA = TVS.ID_VAGA\n" +
            "INNER JOIN TB_CANDIDATO_SKILLS TCS\n" +
            "    ON  TCS.ID_CANDIDATO = TC.ID_CANDIDATO\n" +
            "    AND TCS.ID_SKILL = TVS.ID_SKILL\n" +
            "INNER JOIN TB_SKILLS TS ON TVS.ID_SKILL = TS.ID_SKILL\n" +
            "WHERE TV.ID_VAGA = ?\n" +
            "GROUP BY TC.NM_CANDIDATO, TV.DS_NOME, TC.DS_CPF, TC.DS_CELULAR ORDER BY TV.DS_NOME, CLASSIFICACAO DESC, TC.NM_CANDIDATO", nativeQuery = true)
    Iterable<CandidatosVaga> getCandidatosByVagaId(int vagaId);
}
