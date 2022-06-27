package dataflix.repositories;

import dataflix.entities.Filme;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FilmeRepository extends CrudRepository<Filme, Long> {
    @Query("SELECT f FROM Filme f WHERE f.nomeGenero = :genero")
    List<Filme> getFilmesByGenero(@Param("genero") String genero);
}
