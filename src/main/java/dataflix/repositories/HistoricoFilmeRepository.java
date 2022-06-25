package dataflix.repositories;

import dataflix.entities.HistoricoFilme;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface HistoricoFilmeRepository extends CrudRepository<HistoricoFilme, Long> {

    @Query("SELECT h FROM HistoricoFilme h WHERE h.idUsuario = :id")
    HistoricoFilme getHistoricoByUserId(@Param("id") Long userId);
}
