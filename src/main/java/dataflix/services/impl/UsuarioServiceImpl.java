package dataflix.services.impl;

import dataflix.entities.Plano;
import dataflix.entities.Usuario;
import dataflix.exceptions.ServiceException;
import dataflix.repositories.UsuarioRepository;
import dataflix.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario cadastroUser(Usuario user) {
        return usuarioRepository.save(user);
    }

    @Override
    public ResponseEntity<Usuario> getUserById(String id) {
        try  {
            var user = usuarioRepository.findById(Long.parseLong(id)).orElseThrow();
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (ServiceException e) {
            return new ResponseEntity<>(null, e.getHttpStatus());
        }
    }

}
