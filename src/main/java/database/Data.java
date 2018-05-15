package database;

import javax.persistence.*;


@Entity
public class Data {

    @Id
    private String name;

    @Transient
    //@OneToOne(cascade = {CascadeType.ALL})
    private Introduction introduction;


    @OneToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "id")
    private Geography geography;


    @OneToOne(cascade = {CascadeType.ALL})
    private People people;

//    @OneToOne(cascade = {CascadeType.ALL})
//    private Government government;
//
//
//   @OneToOne(cascade = {CascadeType.ALL})
//    private Economy economy;
//
//    @OneToOne(cascade = {CascadeType.ALL})
//    private Energy energy;
//
//    @OneToOne(cascade = {CascadeType.ALL})
//    private Communications communications;
//
//    @OneToOne(cascade = {CascadeType.ALL})
//    private Transportation transportation;
//
//    @OneToOne(cascade = {CascadeType.ALL})
//    private Military_and_security military_and_security;
//
//    @OneToOne(cascade = {CascadeType.ALL})
//    private Transnational_issues transnational_issues;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

        public Introduction getIntroduction() {
        return introduction;
    }

    public Geography getGeography() {
        return geography;
    }

    public People getPeople() {
        return people;
    }

//    public Government getGovernment() {
//        return government;
//    }
//
//    public Economy getEconomy() {
//        return economy;
//    }
//
//    public Energy getEnergy() {
//        return energy;
//    }
//
//    public Communications getCommunications() {
//        return communications;
//    }
//
//    public Transportation getTransportation() {
//        return transportation;
//    }
//
//   public Military_and_security getMilitary_and_security() {
//        return military_and_security;
//    }
//
//    public Transnational_issues getTransnational_issues() {
//        return transnational_issues;
//    }
}
