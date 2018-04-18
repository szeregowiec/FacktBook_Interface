package database;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class Natural_hazard implements Serializable {


//    @Id
//    @GeneratedValue(generator = "incrementator")
//    @GenericGenerator(name="incrementator", strategy ="increment")
//    private int id;


//    @ManyToOne
//    private Geography geographyID;
@Column(length = 5000)
    private String description;
    @Column(length = 5000)
    private String type;

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }
}