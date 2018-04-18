package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Natural_gas {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private Cubic production;
    @OneToOne(cascade = {CascadeType.ALL})
    private Cubic consumption;
    @OneToOne(cascade = {CascadeType.ALL})
    private Cubic exports;
    @OneToOne(cascade = {CascadeType.ALL})
    private Cubic imports;
    @OneToOne(cascade = {CascadeType.ALL})
    private Cubic proved_reserves;

    public Cubic getProduction() {
        return production;
    }

    public Cubic getConsumption() {
        return consumption;
    }

    public Cubic getExports() {
        return exports;
    }

    public Cubic getImports() {
        return imports;
    }

    public Cubic getProved_reserves() {
        return proved_reserves;
    }
}