package database;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Organization{
    @Column(length = 5000)
    private String organization;

    public String getOrganization() {
        return organization;
    }
}