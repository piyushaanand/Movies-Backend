package com.aanand.Movies;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movie")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Movie {

    @Id
    private ObjectId id;

    private String imdbId;

    private String title;

    private String releaseDate;

    private String trailerLink;

    private String poster;

    private List<String> genres;

    private List<String>backdrops;

    @DocumentReference
    private List<Reviews> reviewIds;


    public String getImdbId() {
        return imdbId;
    }

    public ObjectId getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getTrailerLink() {
        return trailerLink;
    }

    public String getPoster() {
        return poster;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setTrailerLink(String trailerLink) {
        this.trailerLink = trailerLink;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public void setBackdrops(List<String> backdrops) {
        this.backdrops = backdrops;
    }

    public void setReviewIds(List<Reviews> reviewIds) {
        this.reviewIds = reviewIds;
    }

    public List<String> getBackdrops() {
        return backdrops;
    }

    public List<Reviews> getReviewIds() {
        return reviewIds;
    }


}
