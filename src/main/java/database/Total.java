package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Total{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private int airports;
    private int global_rank;

    public int getAirports() {
        return airports;
    }

    public int getGlobal_rank() {
        return global_rank;
    }
}