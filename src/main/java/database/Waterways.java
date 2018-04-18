package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Waterways {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private int value;
    private String units;
    @Column(length = 5000)
    private String note;
    private int global_rank;

    public int getValue() {
        return value;
    }

    public String getUnits() {
        return units;
    }

    public String getNote() {
        return note;
    }

    public int getGlobal_rank() {
        return global_rank;
    }
}