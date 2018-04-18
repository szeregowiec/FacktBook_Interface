package database;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PeopleOrigin{
    @Column(length = 5000)
    private String people;
    @Column(length = 5000)
    private String country_of_origin;

    public String getPeople() {
        return people;
    }

    public String getCountry_of_origin() {
        return country_of_origin;
    }
}