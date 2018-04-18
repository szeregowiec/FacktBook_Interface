package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class By_sector_of_origin{

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private Sectors sectors;
    @Column(length = 5000)
    private String date;

    public Sectors getSectors() {
        return sectors;
    }

    public String getDate() {
        return date;
    }



}