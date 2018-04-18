package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Airports{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @OneToOne(cascade = {CascadeType.ALL})
    private Total total;
    @OneToOne(cascade = {CascadeType.ALL})
    private Paved paved;
    @OneToOne(cascade = {CascadeType.ALL})
    private Unpaved unpaved;

    public Total getTotal() {
        return total;
    }

    public Paved getPaved() {
        return paved;
    }

    public Unpaved getUnpaved() {
        return unpaved;
    }





}