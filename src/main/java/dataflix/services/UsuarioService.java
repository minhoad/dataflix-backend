package dataflix.services;

import dataflix.entities.Usuario;
import org.springframework.http.ResponseEntity;

public interface UsuarioService {

    Usuario cadastroUser(Usuario user);

    ResponseEntity<Usuario> getUserById(String id);

}
