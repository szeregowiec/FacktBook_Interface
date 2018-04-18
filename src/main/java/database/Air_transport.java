package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Air_transport {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @OneToOne(cascade = {CascadeType.ALL})
    private National_system national_system;
    @OneToOne(cascade = {CascadeType.ALL})
    private Civil_aircraft_registration_country_code_prefix civil_aircraft_registration_country_code_prefix;
    @OneToOne(cascade = {CascadeType.ALL})
    private Airports airports;
    @OneToOne(cascade = {CascadeType.ALL})
    private Heliports heliports;

    public National_system getNational_system() {
        return national_system;
    }

    public Civil_aircraft_registration_country_code_prefix getCivil_aircraft_registration_country_code_prefix() {
        return civil_aircraft_registration_country_code_prefix;
    }

    public Airports getAirports() {
        return airports;
    }

    public Heliports getHeliports() {
        return heliports;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////






}