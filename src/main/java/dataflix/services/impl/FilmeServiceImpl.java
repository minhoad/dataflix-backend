package dataflix.services.impl;

import dataflix.entities.Filme;
import dataflix.repositories.FilmeRepository;
import dataflix.services.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmeServiceImpl implements FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    @Override
    public List<Filme> getAllFilmes() {
        List<Filme> filmes = new ArrayList<>();
        filmeRepository.findAll().forEach(filmes::add);
        return filmes;
    }

    @Override
    public List<Filme> getAllFilmesByGenero(String genero) {
        return filmeRepository.getFilmesByGenero(genero);
    }
    
}
