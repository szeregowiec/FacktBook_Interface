package database;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Color{
    @Column(length = 5000)
    private String color;

    public String getColor() {
        return color;
    }
}