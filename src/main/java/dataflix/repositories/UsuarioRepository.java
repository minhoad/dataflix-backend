package dataflix.repositories;

import dataflix.entities.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    @Query("SELECT u FROM Usuario u WHERE u.email = :usr and u.senha = :passw")
    Usuario validateLogin(@Param("usr") String email, @Param("passw") String senha);
}
