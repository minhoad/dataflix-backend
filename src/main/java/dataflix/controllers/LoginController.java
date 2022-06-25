package dataflix.controllers;

import dataflix.entities.Usuario;
import dataflix.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
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
