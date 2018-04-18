package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bbl{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private float bbl_per_day;
    private int global_rank;

    public float getBbl_per_day() {
        return bbl_per_day;
    }

    public int getGlobal_rank() {
        return global_rank;
    }
}