package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cubic{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private float cubic_metres;
    private int global_rank;

    public float getCubic_metres() {
        return cubic_metres;
    }

    public int getGlobal_rank() {
        return global_rank;
    }
}

