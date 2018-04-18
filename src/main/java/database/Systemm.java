package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Systemm{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @Column(length = 5000)
    private String general_assessment;
    @Column(length = 5000)
    private String domestic;
    @Column(length = 5000)
    private String international;

    public String getGeneral_assessment() {
        return general_assessment;
    }

    public String getDomestic() {
        return domestic;
    }

    public String getInternational() {
        return international;
    }
}