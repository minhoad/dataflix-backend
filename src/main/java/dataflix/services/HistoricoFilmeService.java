package dataflix.services;

import dataflix.entities.HistoricoFilme;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface HistoricoFilmeService {

    ResponseEntity<List<HistoricoFilme>> getHistoricoByUserId(String userId);

}
