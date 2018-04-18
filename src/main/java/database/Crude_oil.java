package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Crude_oil {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @OneToOne(cascade = {CascadeType.ALL})
    private Bbl production;
    @OneToOne(cascade = {CascadeType.ALL})
    private Bbl exports;
    @OneToOne(cascade = {CascadeType.ALL})
    private Bbl imports;
    @OneToOne(cascade = {CascadeType.ALL})
    private BblOnly proved_reserves;

    public BblOnly getProved_reserves() {
        return proved_reserves;
    }

    public Bbl getProduction() {
        return production;
    }


    public Bbl getExports() {
        return exports;
    }

    public Bbl getImports() {
        return imports;
    }


}