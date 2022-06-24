package basePackage.services.impl;

import basePackage.entities.Usuario;
import basePackage.exceptions.ServiceException;
import basePackage.models.dto.UsuarioDTO;
import basePackage.repositories.UsuarioRepository;
import basePackage.services.UsuarioService;
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
