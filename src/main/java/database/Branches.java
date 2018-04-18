package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Branches{

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int branchesID;

    public int getbranchesID() {
        return branchesID;
    }


    @ElementCollection
    @CollectionTable(name ="by_name")
    private List<String> by_name;

   // public void setBy_name(List<String> by_name) {
  //      this.by_name = by_name;
  //  }

    public List<String> getBy_name() {
        return by_name;
    }
}