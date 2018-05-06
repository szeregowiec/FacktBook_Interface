package database;

import javax.persistence.Embeddable;

@Embeddable
public class NameAndPercent{


    private String name;
    private float percent;

    public void setName(String name) {
        this.name = name;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }

    public String getName() {
        return name;
    }

    public float getPercent() {
        return percent;
    }
}