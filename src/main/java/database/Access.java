package database;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Access{
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits total_electrification;

    public ValueAndUnits getTotal_electrification() {
        return total_electrification;
    }
}
