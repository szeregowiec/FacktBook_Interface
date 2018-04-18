package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Telephones{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private Fixed_lines fixed_lines;
    @OneToOne(cascade = {CascadeType.ALL})
    private Mobile_cellular mobile_cellular;
    @OneToOne(cascade = {CascadeType.ALL})
    private Systemm system;

    public Fixed_lines getFixed_lines() {
        return fixed_lines;
    }

    public Mobile_cellular getMobile_cellular() {
        return mobile_cellular;
    }

    public Systemm getSystem() {
        return system;
    }




}