package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Capital {

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @Column(length = 5000)
    private String name;
    @OneToOne(cascade = {CascadeType.ALL})
    private Geographic_coordinates geographic_coordinates;
    @OneToOne(cascade = {CascadeType.ALL})
    private Time_difference time_difference;
    @Column(length = 5000)
    private String daylight_saving_time;

    public String getName() {
        return name;
    }

    public Geographic_coordinates getGeographic_coordinates() {
        return geographic_coordinates;
    }

    public Time_difference getTime_difference() {
        return time_difference;
    }

    public String getDaylight_saving_time() {
        return daylight_saving_time;
    }


}
