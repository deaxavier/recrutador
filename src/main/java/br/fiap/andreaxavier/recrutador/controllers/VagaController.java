package br.fiap.andreaxavier.recrutador.controllers;

import br.fiap.andreaxavier.recrutador.dto.response.CandidatosVaga;
import br.fiap.andreaxavier.recrutador.entities.VagaEntity;
import br.fiap.andreaxavier.recrutador.services.interfaces.VagaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VagaController {
    private final VagaService vagaService;

    @Autowired
    public VagaController(VagaService vagaService) {
        this.vagaService = vagaService;
    }

    @GetMapping("/vagas")
    public  Iterable<VagaEntity> getAll() {
        return vagaService.getAll();
    }

    @GetMapping("/vagas/{vagaId}/candidatos")
    public Iterable<CandidatosVaga> getCandidatosPorVaga(@PathVariable int vagaId) {
        return vagaService.getCandidatosByVagaId(vagaId);
    }
}
