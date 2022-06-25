package dataflix.repositories;

import dataflix.entities.Filme;
import org.springframework.data.repository.CrudRepository;

public interface FilmeRepository extends CrudRepository<Filme, Long> {
}
