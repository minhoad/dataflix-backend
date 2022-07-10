package dataflix.services.impl;

import dataflix.entities.HistoricoFilme;
import dataflix.exceptions.ServiceException;
import dataflix.repositories.HistoricoFilmeRepository;
import dataflix.services.HistoricoFilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HistoricoFilmeServiceImpl implements HistoricoFilmeService {

    @Autowired
    private HistoricoFilmeRepository historicoFilmeRepository;

    @Override
    public ResponseEntity<List<HistoricoFilme>> getHistoricoByUserId(String userId) {
        try  {
            var entity = historicoFilmeRepository.getHistoricoByUserId(Long.parseLong(userId));
            return new ResponseEntity<>(entity, HttpStatus.OK);
        } catch (ServiceException e) {
            return new ResponseEntity<>(new ArrayList<>(), e.getHttpStatus());
        }

    }
}
