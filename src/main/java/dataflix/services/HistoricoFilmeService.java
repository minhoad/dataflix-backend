package dataflix.services;

import dataflix.entities.HistoricoFilme;
import org.springframework.http.ResponseEntity;

public interface HistoricoFilmeService {

    ResponseEntity<HistoricoFilme> getHistoricoByUserId(String userId);

}
