package cl.spring.record.Person;

import cl.spring.record.Tasks.TasksModel;
import jakarta.persistence.*;
import cl.spring.record.Tasks.TasksModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Entity transforms a class into a database entity
// JPA - Java Persistence API
@Entity
@Table(name = "tb_record")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private int age;
    @ManyToOne
    @JoinColumn(name = "tasks_id") // Foreigner Key
    private TasksModel tasks;
}
