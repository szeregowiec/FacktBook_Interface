package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Citizenship {

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @Column(length = 5000)
    private String citizenship_by_birth;
    @Column(length = 5000)
    private String citizenship_by_descent_only;
    @Column(length = 5000)
    private String dual_citizenship_recognized;
    @Column(length = 5000)
    private String residency_requirement_for_naturalization;

    public String getCitizenship_by_birth() {
        return citizenship_by_birth;
    }

    public String getCitizenship_by_descent_only() {
        return citizenship_by_descent_only;
    }

    public String getDual_citizenship_recognized() {
        return dual_citizenship_recognized;
    }

    public String getResidency_requirement_for_naturalization() {
        return residency_requirement_for_naturalization;
    }
}