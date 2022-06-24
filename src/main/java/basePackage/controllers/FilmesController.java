package basePackage.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import basePackage.entities.Filme;
import basePackage.services.FilmeService;

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
