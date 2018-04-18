package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Merchant_marine {

    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    private int total;
    @Transient
    private List<Type> by_type;
    private int global_rank;

    public int getTotal() {
        return total;
    }

    public List<Type> getBy_type() {
        return by_type;
    }

    public int getGlobal_rank() {
        return global_rank;
    }

    @Entity
    public class Type{
        @Id
        @GeneratedValue(generator = "incrementator")
        @GenericGenerator(name="incrementator", strategy ="increment")
        private int id;

        private String type;
        private int count;

        public String getType() {
            return type;
        }

        public int getCount() {
            return count;
        }
    }

}