package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Point {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @Column(length = 5000)
    private String name;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits elevation;

    public String getName() {
        return name;
    }

    public ValueAndUnits getElevation() {
        return elevation;
    }
}
