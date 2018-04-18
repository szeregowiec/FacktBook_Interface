package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Refined_petroleum_products {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private Bbl production;
    @OneToOne(cascade = {CascadeType.ALL})
    private Bbl consumption;
    @OneToOne(cascade = {CascadeType.ALL})
    private Bbl exports;
    @OneToOne(cascade = {CascadeType.ALL})
    private Bbl imports;

    public Bbl getProduction() {
        return production;
    }

    public Bbl getConsumption() {
        return consumption;
    }

    public Bbl getExports() {
        return exports;
    }

    public Bbl getImports() {
        return imports;
    }
}