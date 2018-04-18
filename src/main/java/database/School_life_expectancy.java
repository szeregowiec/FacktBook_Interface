package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class School_life_expectancy{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits total;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits male;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits female;

    public ValueAndUnits getTotal() {
        return total;
    }

    public ValueAndUnits getMale() {
        return male;
    }

    public ValueAndUnits getFemale() {
        return female;
    }
}