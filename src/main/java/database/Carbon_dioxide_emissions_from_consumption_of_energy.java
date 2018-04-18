package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Carbon_dioxide_emissions_from_consumption_of_energy {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private float megatonnes;
    private int global_rank;

    public float getMegatonnes() {
        return megatonnes;
    }

    public int getGlobal_rank() {
        return global_rank;
    }
}
