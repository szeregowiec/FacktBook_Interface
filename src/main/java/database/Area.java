package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Area {

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits total;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits land;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits water;
    private int global_rank;
    @Column(length = 5000)
    private String comparative;

    public ValueAndUnits getTotal() {
        return total;
    }

    public ValueAndUnits getLand() {
        return land;
    }

    public ValueAndUnits getWater() {
        return water;
    }

    public int getGlobal_rank() {
        return global_rank;
    }

    public String getComparative() {
        return comparative;
    }
}