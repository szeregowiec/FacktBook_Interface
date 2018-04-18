package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DegressAndMinutes {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private int degrees;
    private int minutes;
    @Column(length = 5000)
    private String hemisphere;

    public int getDegrees() {
        return degrees;
    }
    public int getMinutes() {
        return minutes;
    }
    public String getHemisphere() {
        return hemisphere;
    }
}