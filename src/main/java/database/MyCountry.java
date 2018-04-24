package database;

import javax.persistence.*;

@Entity
public class MyCountry {


    @Id
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @OneToOne(cascade = {CascadeType.ALL})
    private Data data;
    @Transient
    private Metadata metadata;


    public Data getData() {
        return data;
    }

    public Metadata getMetadata() {
        return metadata;
    }

}
