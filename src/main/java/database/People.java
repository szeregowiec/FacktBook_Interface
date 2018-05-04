package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class People {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @OneToOne(cascade = {CascadeType.ALL})
    private Population population;

    @OneToOne(cascade = {CascadeType.ALL})
    private Nationality nationality;

    @OneToOne(cascade = {CascadeType.ALL})
    private Ethnic_groups ethnic_groups;

    @OneToOne(cascade = {CascadeType.ALL})
    private Languages languages;

    @OneToOne(cascade = {CascadeType.ALL})
    private Religions religions;

    @OneToOne(cascade = {CascadeType.ALL})
    private Age_structure age_structure;

    @OneToOne(cascade = {CascadeType.ALL})
    private Dependency_ratios dependency_ratios;

    @OneToOne(cascade = {CascadeType.ALL})
    private Median_age median_age;

    @OneToOne(cascade = {CascadeType.ALL})
    private Population_growth_rate population_growth_rate;

    @OneToOne(cascade = {CascadeType.ALL})
    private Birth_rate birth_rate;

    @OneToOne(cascade = {CascadeType.ALL})
    private Death_rate death_rate;

    @OneToOne(cascade = {CascadeType.ALL})
    private Net_migration_rate net_migration_rate;

    @Column(length = 5000)
    private String population_distribution;
    @OneToOne(cascade = {CascadeType.ALL})

    private Urbanization urbanization;
    @OneToOne(cascade = {CascadeType.ALL})

    private Major_urban_areas major_urban_areas;
    @OneToOne(cascade = {CascadeType.ALL})

    private Sex_ratio sex_ratio;
    @OneToOne(cascade = {CascadeType.ALL})

    private Mothers_mean_age_at_first_birth mothers_mean_age_at_first_birth;
    @OneToOne(cascade = {CascadeType.ALL})

    private Maternal_mortality_rate maternal_mortality_rate;
    @OneToOne(cascade = {CascadeType.ALL})

    private Infant_mortality_rate infant_mortality_rate;
    @OneToOne(cascade = {CascadeType.ALL})

    private Life_expectancy_at_birth life_expectancy_at_birth;
    @OneToOne(cascade = {CascadeType.ALL})

    private Total_fertility_rate total_fertility_rate;
    @OneToOne(cascade = {CascadeType.ALL})

    private Health_expenditures health_expenditures;
    @OneToOne(cascade = {CascadeType.ALL})

    private Physicians_density physicians_density;
    @OneToOne(cascade = {CascadeType.ALL})

    private Hospital_bed_density hospital_bed_density;
    @OneToOne(cascade = {CascadeType.ALL})
    private Drinking_water_source drinking_water_source;

    @OneToOne(cascade = {CascadeType.ALL})
    private Sanitation_facility_access sanitation_facility_access;

    @OneToOne(cascade = {CascadeType.ALL})
    private Major_infectious_diseases major_infectious_diseases;

    @OneToOne(cascade = {CascadeType.ALL})
    private Adult_obesity adult_obesity;

    @OneToOne(cascade = {CascadeType.ALL})
    private Education_expenditures education_expenditures;

    @OneToOne(cascade = {CascadeType.ALL})
    private Literacy literacy;

    @OneToOne(cascade = {CascadeType.ALL})
    private School_life_expectancy school_life_expectancy;

    @OneToOne(cascade = {CascadeType.ALL})
    private Youth_unemployment youth_unemployment;

    public Population getPopulation() {
        return population;
    }

    public Ethnic_groups getEthnic_groups() {
        return ethnic_groups;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public Languages getLanguages() {
        return languages;
    }

    public Religions getReligions() {
        return religions;
    }

    public Age_structure getAge_structure() {
        return age_structure;
    }

    public Dependency_ratios getDependency_ratios() {
        return dependency_ratios;
    }

    public Median_age getMedian_age() {
        return median_age;
    }

    public Population_growth_rate getPopulation_growth_rate() {
        return population_growth_rate;
    }

    public Birth_rate getBirth_rate() {
        return birth_rate;
    }

    public Death_rate getDeath_rate() {
        return death_rate;
    }

    public Net_migration_rate getNet_migration_rate() {
        return net_migration_rate;
    }

    public String getPopulation_distribution() {
        return population_distribution;
    }

    public Urbanization getUrbanization() {
        return urbanization;
    }

    public Major_urban_areas getMajor_urban_areas() {
        return major_urban_areas;
    }

    public Sex_ratio getSex_ratio() {
        return sex_ratio;
    }

    public Mothers_mean_age_at_first_birth getMothers_mean_age_at_first_birth() {
        return mothers_mean_age_at_first_birth;
    }

    public Maternal_mortality_rate getMaternal_mortality_rate() {
        return maternal_mortality_rate;
    }

    public Infant_mortality_rate getInfant_mortality_rate() {
        return infant_mortality_rate;
    }

    public Life_expectancy_at_birth getLife_expectancy_at_birth() {
        return life_expectancy_at_birth;
    }

    public Total_fertility_rate getTotal_fertility_rate() {
        return total_fertility_rate;
    }

    public Health_expenditures getHealth_expenditures() {
        return health_expenditures;
    }

    public Physicians_density getPhysicians_density() {
        return physicians_density;
    }

    public Hospital_bed_density getHospital_bed_density() {
        return hospital_bed_density;
    }

    public Drinking_water_source getDrinking_water_source() {
        return drinking_water_source;
    }

    public Sanitation_facility_access getSanitation_facility_access() {
        return sanitation_facility_access;
    }

    public Major_infectious_diseases getMajor_infectious_diseases() {
        return major_infectious_diseases;
    }

    public Adult_obesity getAdult_obesity() {
        return adult_obesity;
    }

    public Education_expenditures getEducation_expenditures() {
        return education_expenditures;
    }

    public Literacy getLiteracy() {
        return literacy;
    }

    public School_life_expectancy getSchool_life_expectancy() {
        return school_life_expectancy;
    }

    public Youth_unemployment getYouth_unemployment() {
        return youth_unemployment;
    }



}
