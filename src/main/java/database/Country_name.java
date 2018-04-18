package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Country_name {

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @Column(length = 5000)
    private String conventional_long_form;
    @Column(length = 5000)
    private String conventional_short_form;
    @Column(length = 5000)
    private String local_long_form;
    @Column(length = 5000)
    private String local_short_form;
    @Column(length = 5000)
    private String etymology;

    public String getConventional_long_form() {
        return conventional_long_form;
    }

    public String getConventional_short_form() {
        return conventional_short_form;
    }

    public String getLocal_long_form() {
        return local_long_form;
    }

    public String getLocal_short_form() {
        return local_short_form;
    }

    public String getEtymology() {
        return etymology;
    }
}