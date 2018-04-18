package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Taxes_and_other_revenues {

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    private double percent_of_gdp;
    private double global_rank;

    public double getPercent_of_gdp() {
        return percent_of_gdp;
    }

    public double getGlobal_rank() {
        return global_rank;
    }
}