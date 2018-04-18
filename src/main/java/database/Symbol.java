package database;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Symbol{
    @Column(length = 5000)
    private String symbol;

    public String getSymbol() {
        return symbol;
    }
}