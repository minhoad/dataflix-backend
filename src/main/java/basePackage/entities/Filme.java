package basePackage.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "Filme")
@NoArgsConstructor
@Entity
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeFilme;

    private String duracao;

    private String nomeGenero;

    private String idImagem;

    private String descricao;

    private String tipoPlanoId;

    private String classificacao;
}
