package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Annual_Values{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @ElementCollection
    private List<ValueAndUnitsAndDate> annual_values;
    private int global_rank;

    public List<ValueAndUnitsAndDate> getAnnual_values() {
        return annual_values;
    }

    public int getGlobal_rank() {
        return global_rank;
    }
}
