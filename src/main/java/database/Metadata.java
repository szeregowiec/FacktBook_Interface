package database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Metadata {

    @Id
    private String name;

    @Column(length = 5000)
    private String date;
    @Column(length = 5000)
    private String source;
    @Column(length = 5000)
    private String nearby_dates;

    public String getDate() {
        return date;
    }

    public String getSource() {
        return source;
    }

    public String getNearby_dates() {
        return nearby_dates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
