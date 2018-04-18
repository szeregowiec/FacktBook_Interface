package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Labor_force {

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @OneToOne(cascade = {CascadeType.ALL})
    private Total_size total_size;
    @OneToOne(cascade = {CascadeType.ALL})
    private By_occupation by_occupation;

    public Total_size getTotal_size() {
        return total_size;
    }

    public By_occupation getBy_occupation() {
        return by_occupation;
    }





}