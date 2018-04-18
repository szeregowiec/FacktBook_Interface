package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class By_end_use{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private End_uses end_uses;
    @Column(length = 5000)
    private String date;

    public End_uses getEnd_uses() {
        return end_uses;
    }

    public String getDate() {
        return date;
    }


}