package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Gdp {

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private Annual_Values purchasing_power_parity;
    @OneToOne(cascade = {CascadeType.ALL})
    private Exchange official_exchange_rate;
    @OneToOne(cascade = {CascadeType.ALL})
    private Annual_Values real_growth_rate;
    @OneToOne(cascade = {CascadeType.ALL})
    private Annual_Values per_capita_purchasing_power_parity;
    @OneToOne(cascade = {CascadeType.ALL})
    private Composition composition;

    public Annual_Values getPurchasing_power_parity() {
        return purchasing_power_parity;
    }

    public Exchange getOfficial_exchange_rate() {
        return official_exchange_rate;
    }

    public Annual_Values getReal_growth_rate() {
        return real_growth_rate;
    }

    public Annual_Values getPer_capita_purchasing_power_parity() {
        return per_capita_purchasing_power_parity;
    }

    public Composition getComposition() {
        return composition;
    }

}