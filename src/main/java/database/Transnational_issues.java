package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;


@Entity
public class Transnational_issues {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @ElementCollection
    @Column(length = 5000)
    private List<String> disputes;
    @OneToOne(cascade = {CascadeType.ALL})
    private Refugees_and_iternally_displaced_persons refugees_and_iternally_displaced_persons;
    @OneToOne(cascade = {CascadeType.ALL})
    private Illicit_drugs illicit_drugs;

    public int getId() {
        return id;
    }

    public List<String> getDisputes() {
        return disputes;
    }

    public Refugees_and_iternally_displaced_persons getRefugees_and_iternally_displaced_persons() {
        return refugees_and_iternally_displaced_persons;
    }

    public Illicit_drugs getIllicit_drugs() {
        return illicit_drugs;
    }
}
