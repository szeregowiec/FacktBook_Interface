package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Nationality{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @Column(length = 5000)
    private String noun;
    @Column(length = 5000)
    private String adjective;

    public String getNoun() {
        return noun;
    }

    public String getAdjective() {
        return adjective;
    }
}
