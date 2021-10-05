package bo.edu.ucb.ingsoft.tasks;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="language")
public class Task {
    @Id
    @Column(name="language_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    @Column(name="name")
    private String name;
    @Column(name="last_update")
    private Timestamp last;
    

    public Task () {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Timestamp getLast() {
        return last;
    }

    public void setLast(Timestamp last) {
        
        this.last = last;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}