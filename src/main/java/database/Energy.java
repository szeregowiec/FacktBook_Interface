package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Energy {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @OneToOne(cascade = {CascadeType.ALL})
    private Electricity electricity;
    @OneToOne(cascade = {CascadeType.ALL})
    private Crude_oil crude_oil;
    @OneToOne(cascade = {CascadeType.ALL})
    private Refined_petroleum_products refined_petroleum_products;
    @OneToOne(cascade = {CascadeType.ALL})
    private Natural_gas natural_gas;
    @OneToOne(cascade = {CascadeType.ALL})
    private Carbon_dioxide_emissions_from_consumption_of_energy carbon_dioxide_emissions_from_consumption_of_energy;

    public Electricity getElectricity() {
        return electricity;
    }

    public Crude_oil getCrude_oil() {
        return crude_oil;
    }

    public Refined_petroleum_products getRefined_petroleum_products() {
        return refined_petroleum_products;
    }

    public Natural_gas getNatural_gas() {
        return natural_gas;
    }

    public Carbon_dioxide_emissions_from_consumption_of_energy getCarbon_dioxide_emissions_from_consumption_of_energy() {
        return carbon_dioxide_emissions_from_consumption_of_energy;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////












}
