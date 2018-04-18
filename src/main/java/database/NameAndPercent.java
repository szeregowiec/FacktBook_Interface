package database;

import javax.persistence.Embeddable;

@Embeddable
public class NameAndPercent{


    private String name;
    private float percent;

    public String getName() {
        return name;
    }

    public float getPercent() {
        return percent;
    }
}