package basePackage.services;

import basePackage.entities.Usuario;
import org.springframework.http.ResponseEntity;

public interface LoginService {

    ResponseEntity<Usuario> validateLogin(String usuario, String senha);

}
