package com.example.moviesAPIbackend;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "movies")
@Data //Take care of all getter and setter method
@AllArgsConstructor //Take care of parameterized constructor
@NoArgsConstructor //Take care of No parameterized constructor
public class movies {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List <String> genres;
    private List <String> backdrops;
    private List<reviews> reviewIds;

}
