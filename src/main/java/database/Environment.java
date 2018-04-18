package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Environment {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @ElementCollection
    private List<String> current_issues;
    @OneToOne(cascade = {CascadeType.ALL})
    private International_agreements international_agreements;

    public List<String> getCurrent_issues() {
        return current_issues;
    }

    public International_agreements getInternational_agreements() {
        return international_agreements;
    }


}