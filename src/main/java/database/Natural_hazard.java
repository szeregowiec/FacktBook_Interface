package database;

import javax.persistence.*;


@Embeddable
public class Natural_hazard {



@Column(length = 50000)
    private String description;
    @Column(length = 50000)
    private String type;

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }
}