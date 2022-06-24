package basePackage.controllers;

import basePackage.entities.Usuario;
import basePackage.exceptions.ServiceException;
import basePackage.services.LoginService;
import basePackage.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/validate/{usuario}/{senha}")
    public ResponseEntity<Usuario> validateLogin(@PathVariable("usuario") String usuario, @PathVariable("senha") String senha) {
        return loginService.validateLogin(usuario, senha);
    }
}
