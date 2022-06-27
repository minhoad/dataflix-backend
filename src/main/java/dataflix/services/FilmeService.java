package dataflix.services;

import dataflix.entities.Filme;

import java.util.List;

public interface FilmeService {

    List<Filme> getAllFilmes();
    List<Filme> getAllFilmesByGenero(String genero);

}
