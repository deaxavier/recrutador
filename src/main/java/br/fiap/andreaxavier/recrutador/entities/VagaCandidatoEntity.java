package br.fiap.andreaxavier.recrutador.entities;
import lombok.*;
import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_VAGA_CANDIDATOS")
public class VagaCandidatoEntity {
    @Id
    @Column(name = "ID_VAGA_CANDIDATO", nullable = false, unique = true, columnDefinition = "int")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VAGA_CANDIDATO")
    @SequenceGenerator(name = "SEQ_VAGA_CANDIDATO", sequenceName = "SEQ_VAGA_CANDIDATO", allocationSize = 1)
    private int Id;
    @Column(name = "ID_VAGA", nullable = false, columnDefinition = "int")
    private int VagaId;
    @Column(name = "ID_CANDIDATO", nullable = false, columnDefinition = "int")
    private int CandidatoId;
}
