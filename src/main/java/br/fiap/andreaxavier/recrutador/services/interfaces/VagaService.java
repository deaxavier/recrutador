package br.fiap.andreaxavier.recrutador.services.interfaces;

import br.fiap.andreaxavier.recrutador.dto.response.CandidatosVaga;
import br.fiap.andreaxavier.recrutador.entities.VagaEntity;

public interface VagaService {
    Iterable<CandidatosVaga> getCandidatosByVagaId(int vagaId);
    Iterable<VagaEntity> getAll();
}
