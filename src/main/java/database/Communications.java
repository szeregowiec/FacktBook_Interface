package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Communications {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @OneToOne(cascade = {CascadeType.ALL})
    private Telephones telephones;
    @Column(length = 5000)
    private String broadcast_media;
    @OneToOne(cascade = {CascadeType.ALL})
    private Internet internet;

    public Telephones getTelephones() {
        return telephones;
    }

    public String getBroadcast_media() {
        return broadcast_media;
    }

    public Internet getInternet() {
        return internet;
    }





}
