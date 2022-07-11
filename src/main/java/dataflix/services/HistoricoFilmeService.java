package dataflix.services;

import dataflix.models.dto.RetornoHistoricoDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface HistoricoFilmeService {

    ResponseEntity<List<RetornoHistoricoDTO>> getHistoricoByUserId(String userId);

    ResponseEntity<String> insereHistorico(String usuarioId, String filmeId);

}
