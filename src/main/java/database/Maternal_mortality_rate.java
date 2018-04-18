package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Maternal_mortality_rate{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private float deaths_per_100k_live_births;
    private int global_rank;

    public float getDeaths_per_100k_live_births() {
        return deaths_per_100k_live_births;
    }

    public int getGlobal_rank() {
        return global_rank;
    }
}