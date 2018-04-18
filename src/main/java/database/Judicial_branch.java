package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Judicial_branch {

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @Column(length = 5000)
    private String highest_courts;
    @Column(length = 5000)
    private String judge_selection_and_term_of_office;
    @Column(length = 5000)
    private String subordinate_courts;

    public String getHighest_courts() {
        return highest_courts;
    }

    public String getJudge_selection_and_term_of_office() {
        return judge_selection_and_term_of_office;
    }

    public String getSubordinate_courts() {
        return subordinate_courts;
    }
}