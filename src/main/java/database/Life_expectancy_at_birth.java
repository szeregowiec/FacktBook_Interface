package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Life_expectancy_at_birth{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits total_population;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits male;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits female;
    private int global_rank;

    public ValueAndUnits getTotal_population() {
        return total_population;
    }

    public ValueAndUnits getMale() {
        return male;
    }

    public ValueAndUnits getFemale() {
        return female;
    }

    public int getGlobal_rank() {
        return global_rank;
    }
}