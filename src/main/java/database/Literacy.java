package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Literacy{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @Column(length = 5000)
    private String definition;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits total_population;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits male;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits female;

    public String getDefinition() {
        return definition;
    }

    public ValueAndUnits getTotal_population() {
        return total_population;
    }

    public ValueAndUnits getMale() {
        return male;
    }

    public ValueAndUnits getFemale() {
        return female;
    }
}