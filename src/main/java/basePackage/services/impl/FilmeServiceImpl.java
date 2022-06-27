package basePackage.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import basePackage.entities.Filme;
import basePackage.repositories.FilmeRepository;
import basePackage.services.FilmeService;

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
