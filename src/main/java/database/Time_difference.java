package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Time_difference{

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private float timezone;
    @Column(length = 5000)
    private String note;

    public float getTimezone() {
        return timezone;
    }

    public String getNote() {
        return note;
    }
}