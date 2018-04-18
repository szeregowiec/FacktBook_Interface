package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private int total;
    private float percent_of_population;
    private int global_rank;

    public int getTotal() {
        return total;
    }

    public float getPercent_of_population() {
        return percent_of_population;
    }

    public int getGlobal_rank() {
        return global_rank;
    }
}