package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Internet{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @Column(length = 5000)

    private String country_code;
    @OneToOne(cascade = {CascadeType.ALL})
    private Users users;

    public String getCountry_code() {
        return country_code;
    }

    public Users getUsers() {
        return users;
    }


}