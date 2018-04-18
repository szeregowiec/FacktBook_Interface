package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Land_boundaries {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits total;


    public ValueAndUnits getTotal() {
        return total;
    }

    @ElementCollection
    private List<Border_countries> border_countries;


    public List<Border_countries> getBorder_countries() {
        return border_countries;
    }




}