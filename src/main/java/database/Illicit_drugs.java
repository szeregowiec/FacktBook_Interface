package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class  Illicit_drugs{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @Column(length = 5000)
    private String note;

    public String getNote() {
        return note;
    }
}