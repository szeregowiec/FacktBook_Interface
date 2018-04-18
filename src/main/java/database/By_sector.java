package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class By_sector {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits agricultural_land_total;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits agricultural_land_arable_land;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits agricultural_land_permanent_crops;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits agricultural_land_permanent_pasture;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits forest;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits other;

    public ValueAndUnits getAgricultural_land_total() {
        return agricultural_land_total;
    }

    public ValueAndUnits getAgricultural_land_arable_land() {
        return agricultural_land_arable_land;
    }

    public ValueAndUnits getAgricultural_land_permanent_crops() {
        return agricultural_land_permanent_crops;
    }

    public ValueAndUnits getAgricultural_land_permanent_pasture() {
        return agricultural_land_permanent_pasture;
    }

    public ValueAndUnits getForest() {
        return forest;
    }

    public ValueAndUnits getOther() {
        return other;
    }
}
