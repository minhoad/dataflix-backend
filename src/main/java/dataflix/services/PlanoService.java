package dataflix.services;

import dataflix.entities.Plano;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PlanoService {

    ResponseEntity<List<Plano>> getPlanos();

}
