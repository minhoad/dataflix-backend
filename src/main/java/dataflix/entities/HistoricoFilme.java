package dataflix.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "Historico_Filme")
@NoArgsConstructor
@Entity
public class HistoricoFilme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idUsuario;

    private Long idFilme;

    private String tempoAssistido;
}
