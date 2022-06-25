package dataflix.services.impl;

import dataflix.entities.Plano;
import dataflix.exceptions.ServiceException;
import dataflix.repositories.PlanoRepository;
import dataflix.services.PlanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlanoServiceImpl implements PlanoService {

    @Autowired
    private PlanoRepository planoRepository;

    @Override
    public ResponseEntity<List<Plano>> getPlanos() {
        try  {
            List<Plano> planos = new ArrayList<>();
            planoRepository.findAll().forEach(planos::add);
            return new ResponseEntity<>(planos, HttpStatus.OK);
        } catch (ServiceException e) {
            return new ResponseEntity<>(new ArrayList<>(), e.getHttpStatus());
        }
    }
}
