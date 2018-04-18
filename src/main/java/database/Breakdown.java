package database;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Breakdown{
    @Column(length = 5000)
    private String name;
    private float percent;

    public String getName() {
        return name;
    }

    public float getPercent() {
        return percent;
    }
}