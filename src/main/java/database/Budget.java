package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Budget {

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits revenues;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits expenditures;

    public ValueAndUnits getRevenues() {
        return revenues;
    }

    public ValueAndUnits getExpenditures() {
        return expenditures;
    }
}