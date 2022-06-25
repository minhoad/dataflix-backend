package dataflix.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "HistoricoFilme")
@NoArgsConstructor
@Entity
public class HistoricoFilme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private Long idUsuario;

    private String nomeFilme;

    private String tempoAssistido;
}
