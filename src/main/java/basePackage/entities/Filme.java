package basePackage.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "Filme")
@Entity
public class Filme {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeFilme;

    private String duracao;

    private String nomeGenero;

    private String tipoPlanoId;

    private String idImagem;

    private String descricao;

    private String classificacao;
}
