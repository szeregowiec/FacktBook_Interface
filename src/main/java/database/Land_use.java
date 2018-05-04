package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Land_use {

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @OneToOne(cascade = {CascadeType.ALL})
    private By_sector by_sector;

    @Column(length = 5000)
    private String date;

    public By_sector getBy_sector() {
        return by_sector;
    }

    public String getDate() {
        return date;
    }





}
