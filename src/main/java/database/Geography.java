package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Geography {

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    @Column(unique = true)
    private int id;


    @Column(length = 5000)
    private String location;
    @Column(length = 5000)
    private String map_references;
    @Column(length = 5000)
    private String climate;
    @Column(length = 5000)
    private String terrain;
    @Column(length = 5000)
    private String population_distribution;
    @Column(length = 5000)
    private String note;

    @OneToOne(cascade = {CascadeType.ALL})
    private Geographic_coordinates geographic_coordinates;
    @OneToOne(cascade = {CascadeType.ALL})
    private Area area;
    @OneToOne(cascade = {CascadeType.ALL})
    private Land_boundaries land_boundaries;
    @OneToOne(cascade = {CascadeType.ALL})
    private Elevation elevation;
    @OneToOne(cascade = {CascadeType.ALL})
    private Land_use land_use;

    @Transient
    @ElementCollection
    private List<Natural_hazard> natural_hazards;

    @OneToOne(cascade = {CascadeType.ALL})
    private Environment environment;

    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits coastline;

    @Transient
    @ElementCollection
    private List<String> resources;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits irrigated_land;
//    private Maritime_claims maritime_claims;




    public String getLocation() {
        return location;
    }

    public Geographic_coordinates getGeographic_coordinates() {
        return geographic_coordinates;
    }

    public String getMap_references() {
        return map_references;
    }

    public Area getArea() {
        return area;
    }

    public Land_boundaries getLand_boundaries() {
        return land_boundaries;
    }

    public ValueAndUnits getCoastline() {
        return coastline;
    }

    public String getClimate() {
        return climate;
    }

    public String getTerrain() {
        return terrain;
    }

    public Elevation getElevation() {
        return elevation;
    }

    public List<String> getResources() {
        return resources;
    }

    public Land_use getLand_use() {
        return land_use;
    }

    public ValueAndUnits getIrrigated_land() {
        return irrigated_land;
    }

    public String getPopulation_distribution() {
        return population_distribution;
    }

    public List<Natural_hazard> getNatural_hazards() {
        return natural_hazards;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public String getNote() {
        return note;
    }

}
