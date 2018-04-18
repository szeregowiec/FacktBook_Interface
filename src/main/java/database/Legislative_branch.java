package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Legislative_branch {

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @Column(length = 5000)
    private String description;
    @Column(length = 5000)
    private String note;
    @Column(length = 5000)
    private String elections;
    @Column(length = 5000)
    private String election_results;

    public String getDescription() {
        return description;
    }

    public String getNote() {
        return note;
    }

    public String getElections() {
        return elections;
    }

    public String getElection_results() {
        return election_results;
    }
}