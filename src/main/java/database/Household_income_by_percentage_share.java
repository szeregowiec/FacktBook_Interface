package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Household_income_by_percentage_share {

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits lowest_ten_percent;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits highest_ten_percent;

    public ValueAndUnits getLowest_ten_percent() {
        return lowest_ten_percent;
    }

    public ValueAndUnits getHighest_ten_percent() {
        return highest_ten_percent;
    }
}
