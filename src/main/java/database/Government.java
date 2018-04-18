package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Government {

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @OneToOne(cascade = {CascadeType.ALL})
    private Country_name country_name;
    @Column(length = 50000)
    private String government_type;
    @OneToOne(cascade = {CascadeType.ALL})
    private Capital capital;
    @OneToOne(cascade = {CascadeType.ALL})
    private Independence independence;
    @ElementCollection
    private List<National_holiday> national_holidays;
    @OneToOne(cascade = {CascadeType.ALL})
    private Constitution constitution;
    @Column(length = 5000)
    private String legal_system;
    @ElementCollection
    private List<String> international_law_organization_participation;
    @OneToOne(cascade = {CascadeType.ALL})
    private Citizenship citizenship;
    @OneToOne(cascade = {CascadeType.ALL})
    private Suffrage suffrage;
    @OneToOne(cascade = {CascadeType.ALL})
    private Executive_branch executive_branch;
    @OneToOne(cascade = {CascadeType.ALL})
    private Legislative_branch legislative_branch;
    @OneToOne(cascade = {CascadeType.ALL})
    private Judicial_branch judicial_branch;
    @OneToOne(cascade = {CascadeType.ALL})
    private Political_parties_and_leaders political_parties_and_leaders;
    @OneToOne(cascade = {CascadeType.ALL})
    private Political_pressure_groups_and_leaders political_pressure_groups_and_leaders;
    @ElementCollection
    private List<Organization> international_organization_participation;
    @OneToOne(cascade = {CascadeType.ALL})
    private Diplomatic_representation diplomatic_representation;
    @OneToOne(cascade = {CascadeType.ALL})
    private Flag_description flag_description;
    @OneToOne(cascade = {CascadeType.ALL})
    private National_symbol national_symbol;
    @OneToOne(cascade = {CascadeType.ALL})
    private National_anthem national_anthem;

    public int getId() {
        return id;
    }

    public Country_name getCountry_name() {
        return country_name;
    }

    public String getGovernment_type() {
        return government_type;
    }

    public Capital getCapital() {
        return capital;
    }

    public Independence getIndependence() {
        return independence;
    }

    public List<National_holiday> getNational_holidays() {
        return national_holidays;
    }

    public Constitution getConstitution() {
        return constitution;
    }

    public String getLegal_system() {
        return legal_system;
    }

    public List<String> getInternational_law_organization_participation() {
        return international_law_organization_participation;
    }

    public Citizenship getCitizenship() {
        return citizenship;
    }

    public Suffrage getSuffrage() {
        return suffrage;
    }

    public Executive_branch getExecutive_branch() {
        return executive_branch;
    }

    public Legislative_branch getLegislative_branch() {
        return legislative_branch;
    }

    public Judicial_branch getJudicial_branch() {
        return judicial_branch;
    }

    public Political_parties_and_leaders getPolitical_parties_and_leaders() {
        return political_parties_and_leaders;
    }

    public Political_pressure_groups_and_leaders getPolitical_pressure_groups_and_leaders() {
        return political_pressure_groups_and_leaders;
    }

    public List<Organization> getInternational_organization_participation() {
        return international_organization_participation;
    }

    public Diplomatic_representation getDiplomatic_representation() {
        return diplomatic_representation;
    }

    public Flag_description getFlag_description() {
        return flag_description;
    }

    public National_symbol getNational_symbol() {
        return national_symbol;
    }

    public National_anthem getNational_anthem() {
        return national_anthem;
    }
}
