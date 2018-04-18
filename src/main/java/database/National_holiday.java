package database;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class National_holiday {
    @Column(length = 5000)
    private String name;
    @Column(length = 5000)
    private String day;
    @Column(length = 5000)
    private String original_year;

    public String getName() {
        return name;
    }

    public String getDay() {
        return day;
    }

    public String getOriginal_year() {
        return original_year;
    }
}