package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Composition{

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private By_end_use by_end_use;
    @OneToOne(cascade = {CascadeType.ALL})
    private By_sector_of_origin by_sector_of_origin;

    public By_end_use getBy_end_use() {
        return by_end_use;
    }

    public By_sector_of_origin getBy_sector_of_origin() {
        return by_sector_of_origin;
    }





}