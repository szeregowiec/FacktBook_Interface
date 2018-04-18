package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class KWh{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private float kWh;
    private int global_rank;

    public float getkWh() {
        return kWh;
    }

    public int getGlobal_rank() {
        return global_rank;
    }
}