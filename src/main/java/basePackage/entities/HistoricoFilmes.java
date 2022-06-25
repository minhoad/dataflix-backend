package basePackage.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "HistoricoFilmes")
@NoArgsConstructor
@Entity
public class HistoricoFilmes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idUsuario;

    private String nomeFilme;

    private String tempoAssistido;
}
