package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Total_size{

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private float total_people;
    private int global_rank;

    public float getTotal_people() {
        return total_people;
    }

    public int getGlobal_rank() {
        return global_rank;
    }
}