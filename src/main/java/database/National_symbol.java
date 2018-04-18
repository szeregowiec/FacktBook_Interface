package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class National_symbol {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @ElementCollection
    private List<Symbol> symbols;
    @ElementCollection
    private List<Color> colors;

    public List<Symbol> getSymbols() {
        return symbols;
    }

    public List<Color> getColors() {
        return colors;
    }





}
