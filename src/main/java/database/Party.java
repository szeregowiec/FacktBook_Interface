package database;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;
import java.util.List;

@Embeddable
public class Party{
    @Column(length = 5000)
    private String name;
    @Column(length = 5000)
    private String name_alternative;
    @Transient
    private List<String> leaders;

    public String getName() {
        return name;
    }

    public String getName_alternative() {
        return name_alternative;
    }

    public List<String> getLeaders() {
        return leaders;
    }
}