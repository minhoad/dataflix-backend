package basePackage.services;

import java.util.List;

import basePackage.entities.Filme;

public interface FilmeService {

    List<Filme> getAllFilmes();
    List<Filme> getAllFilmesByGenero(String genero);

}
