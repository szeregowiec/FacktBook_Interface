package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class End_uses{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits household_consumption;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits government_consumption;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits investment_in_fixed_capital;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits investment_in_inventories;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits exports_of_goods_and_services;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits imports_of_goods_and_services;

    public ValueAndUnits getHousehold_consumption() {
        return household_consumption;
    }

    public ValueAndUnits getGovernment_consumption() {
        return government_consumption;
    }

    public ValueAndUnits getInvestment_in_fixed_capital() {
        return investment_in_fixed_capital;
    }

    public ValueAndUnits getInvestment_in_inventories() {
        return investment_in_inventories;
    }

    public ValueAndUnits getExports_of_goods_and_services() {
        return exports_of_goods_and_services;
    }

    public ValueAndUnits getImports_of_goods_and_services() {
        return imports_of_goods_and_services;
    }
}