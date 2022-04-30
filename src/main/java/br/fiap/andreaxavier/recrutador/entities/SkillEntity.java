package br.fiap.andreaxavier.recrutador.entities;
import lombok.*;
import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_SKILLS")
public class SkillEntity {
    @Id
    @Column(name = "ID_SKILL", nullable = false, unique = true, columnDefinition = "int")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_SKILL")
    @SequenceGenerator(name = "SEQ_SKILL", sequenceName = "SEQ_SKILL", allocationSize = 1)
    private int Id;
    @Column(name = "NM_SKILL", nullable = false, columnDefinition = "varchar(100)")
    private String Nome;
}
