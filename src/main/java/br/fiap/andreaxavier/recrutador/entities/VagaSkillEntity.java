package br.fiap.andreaxavier.recrutador.entities;
import lombok.*;
import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_VAGA_SKILLS")
public class VagaSkillEntity {
    @Id
    @Column(name = "ID_VAGA_SKILL", nullable = false, unique = true, columnDefinition = "int")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VAGA_SKILL")
    @SequenceGenerator(name = "SEQ_VAGA_SKILL", sequenceName = "SEQ_VAGA_SKILL", allocationSize = 1)
    private int Id;
    @Column(name = "ID_VAGA", nullable = false, columnDefinition = "int")
    private int VagaId;
    @Column(name = "ID_SKILL", nullable = false, columnDefinition = "int")
    private int SkillId;
    @Column(name = "NIVEL_SKILL", nullable = false, columnDefinition = "int")
    private int SkillPeso;
}