package database;

import javax.persistence.Embeddable;

@Embeddable
public class ValueAndUnitsAndDate{


    private float value;
    private String units;
    private String date;

    public float getValue() {
        return value;
    }

    public String getUnits() {
        return units;
    }

    public String getDate() {
        return date;
    }
}