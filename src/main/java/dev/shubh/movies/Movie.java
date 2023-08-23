package dev.shubh.movies;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> backdrops;
    private List<String> genres;
    @DocumentReference
    private List<Review> reviews;

    public Movie(String imdbId, String title, String releaseDate, String trailerLink, String poster, List<String> backdrops, List<String> genres) {
        this.imdbId = imdbId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.trailerLink = trailerLink;
        this.poster = poster;
        this.backdrops = backdrops;
        this.genres = genres;
    }
}

//Documentation
//This code defines a "Movie" class,
//which is like a blueprint for creating objects that represent movies in a computer program.
//
//        Let's break down the different parts:
//
//        Annotations:
//
//@Document(collection = "movies"): This annotation indicates that instances of the "Movie" class should
//        be stored in a database collection called "movies".
//@Data: This annotation automatically generates standard methods like getters and setters for the class's fields.
//@AllArgsConstructor: This annotation generates a constructor that accepts values for all the fields as arguments.
//@NoArgsConstructor: This annotation generates a constructor with no arguments, which can be useful
//        for creating objects without providing initial values.
//        Fields:
//
//private ObjectId id;: This field is used to store a unique identifier for each movie.
//private String imdbId;: This field stores the IMDb ID of the movie,
//        which is a unique identifier for movies on the IMDb website.
//private String title;: This field holds the title of the movie.
//private String releaseDate;: This field stores the release date of the movie.
//private String trailerLink;: This field contains a link to the trailer of the movie.
//private String poster;: This field stores a link to the movie's poster image.
//private List<String> backdrops;: This field holds a list of links to backdrop images related to the movie.
//
//private List<String> genres;: This field stores a list of genres that the movie belongs to,
//        like "Action," "Comedy," etc.
//private List<Review> reviews;: This field is intended to hold a list of "Review" objects,
//        which are not defined in this code snippet.
//
//        Constructors:
//        There are two constructors. The first one (without arguments) is generated automatically by
//@NoArgsConstructor. The second one (with arguments) is a custom constructor that takes in various
//        values and sets the corresponding fields of a "Movie" object.
//        Overall, this code defines a class called "Movie" that represents movie information.
//        It includes fields for various attributes of a movie, such as its title, release date, and more.
//        This class can be used to create instances representing different movies in a program,
//        and these instances can then be stored in a database collection for further use.