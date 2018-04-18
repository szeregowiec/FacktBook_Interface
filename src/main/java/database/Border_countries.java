package database;

import javax.persistence.*;

@Embeddable
public class Border_countries {


    @Column(length = 5000)
    private String country;
    private float border;
    private String units;

    @Transient
    private ValueAndUnits border_length;



    public float getBorder() {
        return border;
    }

    public void setBorder(float border) {
        this.border = border;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getCountry() {
        return country;
    }

    public ValueAndUnits getBorder_length() {
        return border_length;
    }
}