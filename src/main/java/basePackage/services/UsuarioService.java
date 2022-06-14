package basePackage.services;

import basePackage.entities.Usuario;

public interface UsuarioService {
    Usuario validateLogin(String usuario, String senha);
    void cadastroUser(Usuario user);
}
