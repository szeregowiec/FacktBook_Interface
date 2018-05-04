package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Ethnic_groups{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @ElementCollection
    private List<NameAndPercent> ethnicity;

    @Transient
    @Column( length=50000)
    private String note;


    public List<NameAndPercent> getEthnicity() {
        return ethnicity;
    }

    public String getNote() {
        return note;
    }
}