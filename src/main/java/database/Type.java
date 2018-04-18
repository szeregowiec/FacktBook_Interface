package database;

import javax.persistence.Embeddable;

@Embeddable
public class Type{


    private String type;
    private int length;
    private String units;

    public String getType() {
        return type;
    }

    public int getLength() {
        return length;
    }

    public String getUnits() {
        return units;
    }
}