package basePackage.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
