package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Diplomatic_representation {


    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @OneToOne(cascade = {CascadeType.ALL})
    private In in_united_states;
    @OneToOne(cascade = {CascadeType.ALL})
    private From from_united_states;

    public In getIn_united_states() {
        return in_united_states;
    }

    public From getFrom_united_states() {
        return from_united_states;
    }




}