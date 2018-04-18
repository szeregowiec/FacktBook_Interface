package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Industrial_production_growth_rate {

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private float annual_percentage_increase;
    private int global_rank;

    public float getAnnual_percentage_increase() {
        return annual_percentage_increase;
    }

    public int getGlobal_rank() {
        return global_rank;
    }
}