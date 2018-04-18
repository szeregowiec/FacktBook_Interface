package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Population_growth_rate{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    private float growth_rate;
    private int global_rank;

    public float getGrowth_rate() {
        return growth_rate;
    }

    public int getGlobal_rank() {
        return global_rank;
    }
}