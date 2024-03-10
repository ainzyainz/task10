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
@Inheritance(strategy = InheritanceType.JOINED)
public class Task extends MultiID implements Serializable {

    @Column
    private String name;
    @Column
    private String description;
}