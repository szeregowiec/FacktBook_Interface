package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
public class Exports {

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private Annual_Values total_value;
    @OneToOne(cascade = {CascadeType.ALL})
    private Commodities commodities;
    @OneToOne(cascade = {CascadeType.ALL})
    private Partners partners;

    public Annual_Values getTotal_value() {
        return total_value;
    }

    public Commodities getCommodities() {
        return commodities;
    }

    public Partners getPartners() {
        return partners;
    }
}
