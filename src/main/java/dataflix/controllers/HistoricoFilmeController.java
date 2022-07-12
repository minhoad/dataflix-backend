package dataflix.controllers;

import dataflix.entities.HistoricoFilme;
import dataflix.models.dto.RetornoHistoricoDTO;
import dataflix.services.HistoricoFilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/historico")
public class HistoricoFilmeController {

    @Autowired
    private HistoricoFilmeService historicoFilmeService;

    @GetMapping("/{id}")
    public ResponseEntity<List<RetornoHistoricoDTO>> getHistoricoByUserId(@PathVariable("id") String userId) {
        return historicoFilmeService.getHistoricoByUserId(userId);
    }

    @PostMapping("/{usuarioId}/{filmeId}/{histId}")
    public ResponseEntity<String> insereHistorico(@PathVariable("usuarioId") String usuarioId, @PathVariable("filmeId") String filmeId, @PathVariable("histId") String histId) {
        return historicoFilmeService.insereHistorico(usuarioId, filmeId, histId);
    }
}
