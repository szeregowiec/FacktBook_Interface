package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Standard_gauge{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private float length;
    private float electrified;
    private String units;

    public float getLength() {
        return length;
    }

    public float getElectrified() {
        return electrified;
    }

    public String getUnits() {
        return units;
    }

    public String getGauge() {
        return gauge;
    }

    private String gauge;
}