package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BblOnly{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private float bbl;
    private int global_rank;

    public float getBbl() {
        return bbl;
    }

    public int getGlobal_rank() {
        return global_rank;
    }
}