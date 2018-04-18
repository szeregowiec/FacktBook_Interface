package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Executive_branch {

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @Column(length = 5000)
    private String chief_of_state;
    @Column(length = 5000)
    private String head_of_government;
    @Column(length = 5000)
    private String cabinet;
    @Column(length = 5000)
    private String elections_appointments;
    @Column(length = 5000)
    private String election_results;

    public String getChief_of_state() {
        return chief_of_state;
    }

    public String getHead_of_government() {
        return head_of_government;
    }

    public String getCabinet() {
        return cabinet;
    }

    public String getElections_appointments() {
        return elections_appointments;
    }

    public String getElection_results() {
        return election_results;
    }
}