package dataflix.controllers;

import dataflix.entities.Usuario;
import dataflix.exceptions.ServiceException;
import dataflix.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/")
    public ResponseEntity<Usuario> saveUpdateUser(@RequestBody Usuario user) {
        try  {
            var usuario = usuarioService.cadastroUser(user);
            return new ResponseEntity<>(usuario, HttpStatus.OK);
        } catch (ServiceException e) {
            return new ResponseEntity<>(null, e.getHttpStatus());
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUserById(@PathVariable("id") String id) {
            return usuarioService.getUserById(id);
    }

}
