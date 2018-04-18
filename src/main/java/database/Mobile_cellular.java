package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Mobile_cellular{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private int total;
    private float subscriptions_per_one_hundred_inhabitants;
    private int global_rank;

    public int getTotal() {
        return total;
    }

    public float getSubscriptions_per_one_hundred_inhabitants() {
        return subscriptions_per_one_hundred_inhabitants;
    }

    public int getGlobal_rank() {
        return global_rank;
    }
}