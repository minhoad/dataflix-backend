package dataflix.controllers;

import dataflix.entities.Usuario;
import dataflix.exceptions.ServiceException;
import dataflix.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/create-user")
    public ResponseEntity<String> validateLogin(@RequestBody Usuario user) {
        try  {
            usuarioService.cadastroUser(user);
            return new ResponseEntity<>("Usuário criado com sucesso", HttpStatus.OK);
        } catch (ServiceException e) {
            return new ResponseEntity<>(null, e.getHttpStatus());
        }
    }
}
