package br.fiap.andreaxavier.recrutador.entities;
import lombok.*;
import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_CANDIDATO_SKILLS")
public class CandidatoSkillEntity {
    @Id
    @Column(name = "ID_CANDIDATO_SKILL", nullable = false, unique = true, columnDefinition = "int")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CANDIDATO_SKILL")
    @SequenceGenerator(name = "SEQ_CANDIDATO_SKILL", sequenceName = "SEQ_CANDIDATO_SKILL", allocationSize = 1)
    private int id;
    @Column(name = "ID_CANDIDATO", nullable = false, columnDefinition = "int")
    private int CandidatoId;
    @Column(name = "ID_SKILL", nullable = false, columnDefinition = "int")
    private int SkillId;
}
