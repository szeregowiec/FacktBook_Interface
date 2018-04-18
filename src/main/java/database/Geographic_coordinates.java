package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Geographic_coordinates {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private DegressAndMinutes latitude;
    @OneToOne(cascade = {CascadeType.ALL})
    private DegressAndMinutes longitude;
    public DegressAndMinutes getLatitude() {
        return latitude;
    }

    public DegressAndMinutes getLongitude(){
        return longitude;
    }

}


