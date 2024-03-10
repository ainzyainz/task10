package entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(callSuper = false)
@Entity
@ToString
@Table(name = "work_task")
@PrimaryKeyJoinColumn(name="task_id")
public class WorkTask extends Task  {

    @Column
    private int cost;

}