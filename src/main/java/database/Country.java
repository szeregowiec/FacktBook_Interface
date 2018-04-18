package database;

import javax.persistence.Embeddable;

@Embeddable
public class Country{

    private String name;
    private double percent;

    public String getName() {
        return name;
    }

    public double getPercent() {
        return percent;
    }
}