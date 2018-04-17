package mum.edu.ea.extracredit2.domain;

import javax.persistence.*;
import java.util.*;

@Entity
public class Episode {

    @Id
    @GeneratedValue
    private long id;
    private int episodeNumber;
    private String description;
    private Date dateAired;

    @ManyToOne
    @JoinColumn(name = "season_id")
    private Season season;

    @ManyToMany
    private Map<String, Artist> cast = new HashMap<String, Artist>();

    @OneToMany(mappedBy = "episode")
    private List<Comment> comments = new ArrayList<Comment>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateAired() {
        return dateAired;
    }

    public void setDateAired(Date dateAired) {
        this.dateAired = dateAired;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Map<String, Artist> getCast() {
        return cast;
    }

    public void setCast(Map<String, Artist> cast) {
        this.cast = cast;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
