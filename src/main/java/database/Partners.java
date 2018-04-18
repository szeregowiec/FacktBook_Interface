package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Partners{

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @ElementCollection
    private List<Country> by_country;


    public List<Country> getBy_country() {
        return by_country;
    }



}