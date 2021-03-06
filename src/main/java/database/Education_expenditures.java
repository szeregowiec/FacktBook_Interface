package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Education_expenditures{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private float percent_of_gdp;
    private int global_rank;

    public float getPercent_of_gdp() {
        return percent_of_gdp;
    }

    public int getGlobal_rank() {
        return global_rank;
    }
}