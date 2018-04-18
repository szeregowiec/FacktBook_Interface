package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Stock_of_direct_foreign_investment {

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private Annual_Values at_home;
    @OneToOne(cascade = {CascadeType.ALL})
    private Annual_Values abroad;

    public Annual_Values getAt_home() {
        return at_home;
    }

    public Annual_Values getAbroad() {
        return abroad;
    }
}
