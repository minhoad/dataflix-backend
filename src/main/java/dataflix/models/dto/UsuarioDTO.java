package dataflix.models.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioDTO {

    private String nome;

    private String email;

    private String senha;

    private boolean planoIsAtivo;

    private String tipoPlanoId;

}
