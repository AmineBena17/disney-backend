package com.project.disney.entities;

import javax.persistence.*;

@Entity
@Table(name = "disney_movies_total")
public class DisneyMovieEntity {
    @Id
    private Long id;

    @Column(name = "movie_title")
    private String movieTitle;

    @Column(name = "release_date")
    private String releaseDate;

    @Column(name = "genre")
    private String genre;

    @Column(name = "mpaa_rating")
    private String mpaaRating;

    @Column(name = "total_gross")
    private String totalGross;

    @Column(name = "inflation_adjusted_gross")
    private String inflationAdjustedGross;

    public DisneyMovieEntity(Long id, String movieTitle, String releaseDate, String genre, String mpaaRating, String totalGross, String inflationAdjustedGross) {
        this.id = id;
        this.movieTitle = movieTitle;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.mpaaRating = mpaaRating;
        this.totalGross = totalGross;
        this.inflationAdjustedGross = inflationAdjustedGross;
    }

    public DisneyMovieEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    public String getTotalGross() {
        return totalGross;
    }

    public void setTotalGross(String totalGross) {
        this.totalGross = totalGross;
    }

    public String getInflationAdjustedGross() {
        return inflationAdjustedGross;
    }

    public void setInflationAdjustedGross(String inflationAdjustedGross) {
        this.inflationAdjustedGross = inflationAdjustedGross;
    }

    @Override
    public String toString() {
        return "DisneyMovieEntity{" +
                "id=" + id +
                ", movieTitle='" + movieTitle + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", genre='" + genre + '\'' +
                ", mpaaRating='" + mpaaRating + '\'' +
                ", totalGross='" + totalGross + '\'' +
                ", inflationAdjustedGross='" + inflationAdjustedGross + '\'' +
                '}';
    }
}
