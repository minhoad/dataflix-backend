package basePackage.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import basePackage.entities.Filme;

public interface FilmeRepository extends CrudRepository<Filme, Long> {
    
    @Query("SELECT f FROM Filme f WHERE f.genero = :genero")
    List<Filme> getFilmesByGenero(@Param("genero") String genero);

}
