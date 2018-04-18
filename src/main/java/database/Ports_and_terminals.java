package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;


@Entity
public class Ports_and_terminals {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @ElementCollection
    private List<String> major_seaports;
    @ElementCollection
    private List<String> river_ports;
    @ElementCollection
    private List<String> liquid_natural_gas_terminals_import;

    public List<String> getMajor_seaports() {
        return major_seaports;
    }

    public List<String> getRiver_ports() {
        return river_ports;
    }

    public List<String> getLiquid_natural_gas_terminals_import() {
        return liquid_natural_gas_terminals_import;
    }
}