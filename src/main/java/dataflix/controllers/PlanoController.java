package dataflix.controllers;

import dataflix.entities.Plano;
import dataflix.services.PlanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/plano")
public class PlanoController {

    @Autowired
    private PlanoService planoService;

    @GetMapping()
    public ResponseEntity<List<Plano>> getPlanos() {
        return planoService.getPlanos();
    }
}
