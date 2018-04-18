package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Political_pressure_groups_and_leaders {

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @ElementCollection
    private List<Party> pressure_groups;

    public List<Party> getPressure_groups() {
        return pressure_groups;
    }
}