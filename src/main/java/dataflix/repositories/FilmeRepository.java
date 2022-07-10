package dataflix.repositories;

import dataflix.entities.Filme;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FilmeRepository extends CrudRepository<Filme, Long> {
    @Query("FROM Filme WHERE nomeGenero = :nomeGenero")
    List<Filme> getFilmesByGenero(@Param("nomeGenero") String nomeGenero);
}
