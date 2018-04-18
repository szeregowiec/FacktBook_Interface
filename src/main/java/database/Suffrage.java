package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Suffrage {

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private int age;
    private boolean universal;
    private boolean compulsory;

    public int getAge() {
        return age;
    }

    public boolean isUniversal() {
        return universal;
    }

    public boolean isCompulsory() {
        return compulsory;
    }
}