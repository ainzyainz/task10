package entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@EqualsAndHashCode(callSuper = false)
@Entity
@ToString
@Table(name = "task")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type",discriminatorType = DiscriminatorType.CHAR)
@DiscriminatorValue("T")
public class Task extends MultiID implements Serializable {

    @Column
    private String name;
    @Column
    private String description;
}