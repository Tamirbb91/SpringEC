package mum.edu.ea.extracredit2.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Season {

    @Id
    @GeneratedValue
    private long id;

    private int seasonNumber;

    @NotNull
    private String summary;

    @NotNull
    private Date date;

    @NotNull
    private Byte[] poster;

    @ManyToOne
    private Show related_show;

    @OneToMany(mappedBy = "season")
    private List<Episode> episodes = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Byte[] getPoster() {
        return poster;
    }

    public void setPoster(Byte[] poster) {
        this.poster = poster;
    }

    public Show getRelated_show() {
        return related_show;
    }

    public void setRelated_show(Show related_show) {
        this.related_show = related_show;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }
}
