package br.fiap.andreaxavier.recrutador.entities;
import lombok.*;
import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_CANDIDATOS")
public class CandidatoEntity {
    @Id
    @Column(name = "ID_CANDIDATO", nullable = false, unique = true, columnDefinition = "int")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CANDIDATO")
    @SequenceGenerator(name = "SEQ_CANDIDATO", sequenceName = "SEQ_CANDIDATO", allocationSize = 1)
    private int Id;
    @Column(name = "NM_CANDIDATO", nullable = false, length = 255)
    private String Nome;
    @Column(name = "DS_EMAIL", nullable = false, length = 100)
    private String Email;
    @Column(name = "DS_CPF", nullable = false, length = 11)
    private String CPF;
    @Column(name = "DS_TELEFONE", nullable = false, length = 15)
    private String Telefone;
    @Column(name = "DS_CELULAR", nullable = false, length = 15)
    private String Celular;
}
