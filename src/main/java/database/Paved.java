package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Paved{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private int total;
    private int over_3047_metres;
    private int n2438_to_3047_metres;
    private int n1524_to_2437_metres;
    private int n914_to_1523_metres;
    private int under_914_metres;

    public int getTotal() {
        return total;
    }

    public int getOver_3047_metres() {
        return over_3047_metres;
    }

    public int getN2438_to_3047_metres() {
        return n2438_to_3047_metres;
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