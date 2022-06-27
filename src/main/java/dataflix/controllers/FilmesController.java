package dataflix.controllers;

import dataflix.entities.Filme;
import dataflix.services.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/filmes")
public class FilmesController {

    @Autowired
    private FilmeService filmeService;

    @GetMapping
    public List<Filme> getAllFilmes() {
        return filmeService.getAllFilmes();
    }

    @GetMapping("/{genero}")
    public List<Filme> getAllFilmesByGenero(@PathVariable("genero") String genero) {
        return filmeService.getAllFilmesByGenero(genero);
    }
}
