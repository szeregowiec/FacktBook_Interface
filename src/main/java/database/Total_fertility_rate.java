package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Total_fertility_rate{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private float children_born_per_woman;
    private int global_rank;

    public float getChildren_born_per_woman() {
        return children_born_per_woman;
    }

    public int getGlobal_rank() {
        return global_rank;
    }
}