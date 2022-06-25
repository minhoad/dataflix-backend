package dataflix.services.impl;

import dataflix.entities.Usuario;
import dataflix.repositories.UsuarioRepository;
import dataflix.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void cadastroUser(Usuario user) {
        usuarioRepository.save(user);
    }

}
