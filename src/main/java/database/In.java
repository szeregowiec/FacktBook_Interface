package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="IIn")
public class In{

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @Column(length = 5000)
    private String chief_of_mission;
    @Column(length = 5000)
    private String chancery;
    @Column(length = 5000)
    private String telephone;
    @Column(length = 5000)
    private String fax;
    @Column(length = 5000)
    private String consulates_general;

    public String getChief_of_mission() {
        return chief_of_mission;
    }

    public String getChancery() {
        return chancery;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getFax() {
        return fax;
    }

    public String getConsulates_general() {
        return consulates_general;
    }
}