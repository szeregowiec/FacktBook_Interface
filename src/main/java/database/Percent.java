package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Percent{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private float percent;
    private int global_rank;

    public float getPercent() {
        return percent;
    }

    public int getGlobal_rank() {
        return global_rank;
    }
}