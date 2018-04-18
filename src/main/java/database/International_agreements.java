package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class International_agreements {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @Transient
    @ElementCollection
    private List<String> party_to;
    @Transient
    @ElementCollection
    private List<String> signed_but_not_ratified;

    public List<String> getParty_to() {
        return party_to;
    }

    public List<String> getSigned_but_not_ratified() {
        return signed_but_not_ratified;
    }
}
