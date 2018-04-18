package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MalesAndFemales{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private float percent;
    private float males;
    private float females;

    public float getPercent() {
        return percent;
    }

    public float getMales() {
        return males;
    }

    public float getFemales() {
        return females;
    }
}