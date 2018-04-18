package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table (name="FFrom")
public class From{

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @Column(length = 5000)
    private String chief_of_mission;
    @Column(length = 5000)
    private String embassy;
    @Column(length = 5000)
    private String mailing_address;
    @Column(length = 5000)
    private String telephone;
    @Column(length = 5000)
    private String fax;
    @Column(length = 5000)
    private String consulates_general;

    public String getChief_of_mission() {
        return chief_of_mission;
    }

    public String getEmbassy() {
        return embassy;
    }

    public String getMailing_address() {
        return mailing_address;
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