package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Birth_rate{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private float births_per_1000_population;
    private int global_rank;

    public float getBirths_per_1000_population() {
        return births_per_1000_population;
    }

    public int getGlobal_rank() {
        return global_rank;
    }
}