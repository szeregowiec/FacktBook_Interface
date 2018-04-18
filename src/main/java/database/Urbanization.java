package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Urbanization{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits urban_population;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits rate_of_urbanization;

    public ValueAndUnits getUrban_population() {
        return urban_population;
    }

    public ValueAndUnits getRate_of_urbanization() {
        return rate_of_urbanization;
    }
}