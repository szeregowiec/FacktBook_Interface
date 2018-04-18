package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Sex_ratio{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private By_age by_age;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits total_population;

    public By_age getBy_age() {
        return by_age;
    }

    public ValueAndUnits getTotal_population() {
        return total_population;
    }


}