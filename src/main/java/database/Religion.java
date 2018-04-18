package database;

import javax.persistence.*;
import java.util.List;

@Embeddable
public class Religion{
//    @Id
//    @GeneratedValue(generator = "incrementator")
//    @GenericGenerator(name="incrementator", strategy ="increment")
//    private int id;

//    @ManyToOne
//    private Religions religions;
    private String name;
    private float percent;

   // @ElementCollection
    @Transient
    @CollectionTable(name ="breakdown")
    List<Breakdown> breakdown;

    public String getName() {
        return name;
    }

    public float getPercent() {
        return percent;
    }

    public List<Breakdown> getBreakdown() {
        return breakdown;
    }


}