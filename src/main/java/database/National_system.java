package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class National_system{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private int number_of_registered_air_carriers;
    private int inventory_of_registered_aircraft_operated_by_air_carriers;
    private int annual_passenger_traffic_on_registered_air_carriers;
    @Column(length = 5000)
    private String annual_freight_traffic_on_registered_air_carriers;

    public int getNumber_of_registered_air_carriers() {
        return number_of_registered_air_carriers;
    }

    public int getInventory_of_registered_aircraft_operated_by_air_carriers() {
        return inventory_of_registered_aircraft_operated_by_air_carriers;
    }

    public int getAnnual_passenger_traffic_on_registered_air_carriers() {
        return annual_passenger_traffic_on_registered_air_carriers;
    }

    public String getAnnual_freight_traffic_on_registered_air_carriers() {
        return annual_freight_traffic_on_registered_air_carriers;
    }
}
