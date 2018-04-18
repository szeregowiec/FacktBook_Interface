package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Fixed_lines{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private float total_subscriptions;
    private float subscriptions_per_one_hundred_inhabitants;
    private int global_rank;

    public float getTotal_subscriptions() {
        return total_subscriptions;
    }

    public float getSubscriptions_per_one_hundred_inhabitants() {
        return subscriptions_per_one_hundred_inhabitants;
    }

    public int getGlobal_rank() {
        return global_rank;
    }
}
