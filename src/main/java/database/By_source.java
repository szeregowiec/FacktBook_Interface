package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class By_source{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private Percent fossil_fuels;
    @OneToOne(cascade = {CascadeType.ALL})
    private Percent nuclear_fuels;
    @OneToOne(cascade = {CascadeType.ALL})
    private Percent hydroelectric_plants;
    @OneToOne(cascade = {CascadeType.ALL})
    private Percent other_renewable_sources;

    public Percent getFossil_fuels() {
        return fossil_fuels;
    }

    public Percent getNuclear_fuels() {
        return nuclear_fuels;
    }

    public Percent getHydroelectric_plants() {
        return hydroelectric_plants;
    }

    public Percent getOther_renewable_sources() {
        return other_renewable_sources;
    }



}
