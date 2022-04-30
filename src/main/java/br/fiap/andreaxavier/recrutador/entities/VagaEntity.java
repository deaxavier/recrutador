package br.fiap.andreaxavier.recrutador.entities;
import lombok.*;
import javax.persistence.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_VAGAS")
public class VagaEntity {
    @Id
    @Column(name = "ID_VAGA", nullable = false, unique = true, columnDefinition = "int")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VAGA")
    @SequenceGenerator(name = "SEQ_VAGA", sequenceName = "SEQ_VAGA", allocationSize = 1)
    private int Id;
    @Column(name = "DS_NOME", nullable = false, columnDefinition = "varchar(100)")
    private String Nome;
    @Column(name = "DS_DESCRICAO", nullable = false, columnDefinition = "varchar(500)")
    private String Descricao;
}
