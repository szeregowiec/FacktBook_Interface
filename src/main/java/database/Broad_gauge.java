package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Broad_gauge{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private float length;
    private String units;
    @Column(length = 5000)
    private String gauge;

    public float getLength() {
        return length;
    }

    public String getUnits() {
        return units;
    }

    public String getGauge() {
        return gauge;
    }
}