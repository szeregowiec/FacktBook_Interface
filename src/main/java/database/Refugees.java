package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;


@Entity
public class Refugees{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @ElementCollection
    private List<PeopleOrigin> by_country;
    private String date;

    public List<PeopleOrigin> getBy_country() {
        return by_country;
    }

    public String getDate() {
        return date;
    }


}