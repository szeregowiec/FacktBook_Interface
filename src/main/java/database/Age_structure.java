package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Age_structure{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private MalesAndFemales age_0_to_14;
    @OneToOne(cascade = {CascadeType.ALL})
    private MalesAndFemales age_15_to_24;
    @OneToOne(cascade = {CascadeType.ALL})
    private MalesAndFemales age_25_to_54;
    @OneToOne(cascade = {CascadeType.ALL})
    private MalesAndFemales age_55_to_64;
    @OneToOne(cascade = {CascadeType.ALL})
    private MalesAndFemales age_65_and_over;

    public MalesAndFemales getAge_0_to_14() {
        return age_0_to_14;
    }

    public MalesAndFemales getAge_15_to_24() {
        return age_15_to_24;
    }

    public MalesAndFemales getAge_25_to_54() {
        return age_25_to_54;
    }

    public MalesAndFemales getAge_55_to_64() {
        return age_55_to_64;
    }

    public MalesAndFemales getAge_65_and_over() {
        return age_65_and_over;
    }



}