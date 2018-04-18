package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Improved{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits urban;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits rural;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits total;

    public ValueAndUnits getUrban() {
        return urban;
    }

    public ValueAndUnits getRural() {
        return rural;
    }

    public ValueAndUnits getTotal() {
        return total;
    }
}