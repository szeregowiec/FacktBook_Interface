package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Unpaved{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private int total;
    private int n1524_to_2437_metres;
    private int n914_to_1523_metres;
    private int under_914_metres;

    public int getTotal() {
        return total;
    }

    public int getN1524_to_2437_metres() {
        return n1524_to_2437_metres;
    }

    public int getN914_to_1523_metres() {
        return n914_to_1523_metres;
    }

    public int getUnder_914_metres() {
        return under_914_metres;
    }
}
