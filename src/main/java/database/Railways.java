package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Railways {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @Transient
    private Total total;
    @OneToOne(cascade = {CascadeType.ALL})
    private Broad_gauge broad_gauge;
    @OneToOne(cascade = {CascadeType.ALL})
    private Standard_gauge standard_gauge;
    private int global_rank;

    public Total getTotal() {
        return total;
    }

    public Broad_gauge getBroad_gauge() {
        return broad_gauge;
    }

    public Standard_gauge getStandard_gauge() {
        return standard_gauge;
    }

    public int getGlobal_rank() {
        return global_rank;
    }


    public class Total{
        private float length;
        private String units;

        public float getLength() {
            return length;
        }

        public String getUnits() {
            return units;
        }
    }
/////////////////////////////////////////////////////////////////////////////////////////

}