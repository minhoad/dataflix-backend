package dataflix.models.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RetornoHistoricoDTO {

    private String nomeFilme;

    private String idFilme;

    private String tempoAssistido;

    private String idImagem;

}
