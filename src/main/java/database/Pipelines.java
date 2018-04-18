package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Pipelines {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @ElementCollection
    private List<Type> by_type;

    public List<Type> getBy_type() {
        return by_type;
    }


}