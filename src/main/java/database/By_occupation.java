package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class By_occupation{

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private Occupation occupation;

    public Occupation getOccupation() {
        return occupation;
    }
}