package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Military_and_security {

   // @Id
   // //@Column(nullable = false)
   // private String name;

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @OneToOne(cascade = {CascadeType.ALL})
    private Branches branches;
    @OneToOne(cascade = {CascadeType.ALL})
    private Service_age_and_obligation service_age_and_obligation;

    // private Economy.Annual_Values expenditures;
    //public Economy.Annual_Values getExpenditures() {
   //     return expenditures;
   // }

    public Branches getBranches() {
        return branches;
    }

    public Service_age_and_obligation getService_age_and_obligation() {
        return service_age_and_obligation;
    }


    public void setBranches(Branches branches) {
        this.branches = branches;
    }

    public void setService_age_and_obligation(Service_age_and_obligation service_age_and_obligation) {
        this.service_age_and_obligation = service_age_and_obligation;
    }

    public int getName() {
        return id;
    }

    public void setName(int name) {
        this.id = id;
    }
}
