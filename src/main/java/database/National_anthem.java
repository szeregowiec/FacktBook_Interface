package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class National_anthem {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;
    @Column(length = 5000)
    private String name;
    @Column(length = 5000)
    private String lyrics_music;
    @Column(length = 5000)
    private String note;
    @Column(length = 5000)
    private String audio_url;

    public String getName() {
        return name;
    }

    public String getLyrics_music() {
        return lyrics_music;
    }

    public String getNote() {
        return note;
    }

    public String getAudio_url() {
        return audio_url;
    }
}