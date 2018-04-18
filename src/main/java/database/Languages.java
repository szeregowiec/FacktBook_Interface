package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Languages{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @ElementCollection
    private List<NameAndPercent> language;
    @Transient
    @Column( length=50000)
    private String note;

    public List<NameAndPercent> getLanguage() {
        return language;
    }

    public String getNote() {
        return note;
    }
}