package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Electricity {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

//    @OneToOne(cascade = {CascadeType.ALL})
//    private Access access;
    @OneToOne(cascade = {CascadeType.ALL})
    private KWh production;
    @OneToOne(cascade = {CascadeType.ALL})
    private KWh consumption;
    @OneToOne(cascade = {CascadeType.ALL})
    private KWh exports;
    @OneToOne(cascade = {CascadeType.ALL})
    private KWh imports;
    @OneToOne(cascade = {CascadeType.ALL})
    private Kw installed_generating_capacity;
    @OneToOne(cascade = {CascadeType.ALL})
    private By_source by_source;

//    public Access getAccess() {
//        return access;
//    }

    public KWh getProduction() {
        return production;
    }

    public KWh getConsumption() {
        return consumption;
    }

    public KWh getExports() {
        return exports;
    }

    public KWh getImports() {
        return imports;
    }

    public Kw getInstalled_generating_capacity() {
        return installed_generating_capacity;
    }

    public By_source getBy_source() {
        return by_source;
    }






}