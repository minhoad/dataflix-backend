package dataflix.repositories;

import dataflix.entities.HistoricoFilme;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HistoricoFilmeRepository extends CrudRepository<HistoricoFilme, Long> {

    @Query("FROM HistoricoFilme WHERE idUsuario = :idUsuario")
    List<HistoricoFilme> getHistoricoByUserId(@Param("idUsuario") Long idUsuario);
}
