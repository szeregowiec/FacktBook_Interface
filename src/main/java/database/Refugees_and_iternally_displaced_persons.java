package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
public class Refugees_and_iternally_displaced_persons{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @OneToOne(cascade = {CascadeType.ALL})
    private Refugees refugees;
    @OneToOne(cascade = {CascadeType.ALL})
    private Stateless_persons stateless_persons;

    public Refugees getRefugees() {
        return refugees;
    }

    public Stateless_persons getStateless_persons() {
        return stateless_persons;
    }




}