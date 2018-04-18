package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Elevation {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits mean_elevation;
    @OneToOne(cascade = {CascadeType.ALL})
    private Point lowest_point;
    @OneToOne(cascade = {CascadeType.ALL})
    private Point highest_point;

    public ValueAndUnits getMean_elevation() {
        return mean_elevation;
    }

    public Point getLowest_point() {
        return lowest_point;
    }

    public Point getHighest_point() {
        return highest_point;
    }




}