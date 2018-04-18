package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Youth_unemployment{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits total;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits male;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits female;
    private int global_rank;

    public ValueAndUnits getTotal() {
        return total;
    }

    public ValueAndUnits getMale() {
        return male;
    }

    public ValueAndUnits getFemale() {
        return female;
    }

    public int getGlobal_rank() {
        return global_rank;
    }
}