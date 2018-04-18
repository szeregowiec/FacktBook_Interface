package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Roadways {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits total;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits paved;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits unpaved;
    private int global_rank;

    public ValueAndUnits getTotal() {
        return total;
    }

    public ValueAndUnits getPaved() {
        return paved;
    }

    public ValueAndUnits getUnpaved() {
        return unpaved;
    }

    public int getGlobal_rank() {
        return global_rank;
    }
}