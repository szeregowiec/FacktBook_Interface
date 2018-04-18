package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Sectors{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits agriculture;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits industry;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits services;

    public ValueAndUnits getAgriculture() {
        return agriculture;
    }

    public ValueAndUnits getIndustry() {
        return industry;
    }

    public ValueAndUnits getServices() {
        return services;
    }
}