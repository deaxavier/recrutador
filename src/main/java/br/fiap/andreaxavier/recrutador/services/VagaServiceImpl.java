package br.fiap.andreaxavier.recrutador.services;

import br.fiap.andreaxavier.recrutador.dto.response.CandidatosVaga;
import br.fiap.andreaxavier.recrutador.entities.VagaEntity;
import br.fiap.andreaxavier.recrutador.repositories.VagaRepository;
import br.fiap.andreaxavier.recrutador.services.interfaces.VagaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VagaServiceImpl implements VagaService {
    private final VagaRepository vagaRepository;

    @Autowired
    public VagaServiceImpl(VagaRepository vagaRepository) {
        this.vagaRepository = vagaRepository;
    }

    public Iterable<CandidatosVaga> getCandidatosByVagaId(int vagaId) {
        return this.vagaRepository.getCandidatosByVagaId(vagaId);
    }

    public Iterable<VagaEntity> getAll() {
        return this.vagaRepository.findAll();
    }
}
