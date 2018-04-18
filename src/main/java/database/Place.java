package database;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Place{
    @Column(length = 5000)
    private String place;
    private float population;
    private boolean is_capital;

    public String getPlace() {
        return place;
    }

    public float getPopulation() {
        return population;
    }

    public boolean isIs_capital() {
        return is_capital;
    }
}