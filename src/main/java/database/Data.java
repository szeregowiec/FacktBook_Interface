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

//    @Transient
//   // @OneToOne(cascade = {CascadeType.ALL})
//    private People people;
//    @Transient
//   // @OneToOne(cascade = {CascadeType.ALL})
//    private Government government;
//    @Transient
//   // @OneToOne(cascade = {CascadeType.ALL})
//    private Economy economy;
//    @Transient
//    @OneToOne(cascade = {CascadeType.ALL})
//    private Energy energy;
//    @Transient
//   // @OneToOne(cascade = {CascadeType.ALL})
//    private Communications communications;
//    @Transient
//   // @OneToOne(cascade = {CascadeType.ALL})
//    private Transportation transportation;
//    @Transient
//  //  @OneToOne(cascade = {CascadeType.ALL})
//    private Military_and_security military_and_security;
//    @Transient
//  //  @OneToOne(cascade = {CascadeType.ALL})
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

//    public People getPeople() {
//        return people;
//    }
//
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
