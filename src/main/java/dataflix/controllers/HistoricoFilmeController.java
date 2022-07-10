package dataflix.controllers;

import dataflix.entities.HistoricoFilme;
import dataflix.services.HistoricoFilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/historico")
public class HistoricoFilmeController {

    @Autowired
    private HistoricoFilmeService historicoFilmeService;

    @GetMapping("/{id}")
    public ResponseEntity<List<HistoricoFilme>> getHistoricoByUserId(@PathVariable("id") String userId) {
        return historicoFilmeService.getHistoricoByUserId(userId);
    }

}
