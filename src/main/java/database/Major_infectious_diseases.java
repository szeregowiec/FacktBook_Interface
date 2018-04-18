package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Major_infectious_diseases{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @Column(length = 5000)
    private String degree_of_risk;
    @ElementCollection
    private List<String> vectorborne_diseases;

    public String getDegree_of_risk() {
        return degree_of_risk;
    }

    public List<String> getVectorborne_diseases() {
        return vectorborne_diseases;
    }
}