package basePackage.controllers;

import basePackage.entities.Usuario;
import basePackage.exceptions.ServiceException;
import basePackage.models.dto.UsuarioDTO;
import basePackage.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
