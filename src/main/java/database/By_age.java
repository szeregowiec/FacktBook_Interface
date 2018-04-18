package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class By_age{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits at_birth;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits age_0_to_14_years;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits age_15_to_24_years;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits age_25_to_54_years;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits age_55_to_64_years;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits age_65_years_and_over;

    public ValueAndUnits getAt_birth() {
        return at_birth;
    }

    public ValueAndUnits getAge_0_to_14_years() {
        return age_0_to_14_years;
    }

    public ValueAndUnits getAge_15_to_24_years() {
        return age_15_to_24_years;
    }

    public ValueAndUnits getAge_25_to_54_years() {
        return age_25_to_54_years;
    }

    public ValueAndUnits getAge_55_to_64_years() {
        return age_55_to_64_years;
    }

    public ValueAndUnits getAge_65_years_and_over() {
        return age_65_years_and_over;
    }
}