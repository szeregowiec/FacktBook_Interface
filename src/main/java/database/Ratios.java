package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Ratios{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits total_dependency_ratio;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits youth_dependency_ratio;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits elderly_dependency_ratio;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits potential_support_ratio;

    public ValueAndUnits getTotal_dependency_ratio() {
        return total_dependency_ratio;
    }

    public ValueAndUnits getYouth_dependency_ratio() {
        return youth_dependency_ratio;
    }

    public ValueAndUnits getElderly_dependency_ratio() {
        return elderly_dependency_ratio;
    }

    public ValueAndUnits getPotential_support_ratio() {
        return potential_support_ratio;
    }
}