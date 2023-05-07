package com.example.moviesAPIbackend;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface moviesRepository extends MongoRepository<movies, ObjectId> {
    //To find the single movie using imdbIds instead of ObjectId
    Optional<movies> findMoviesByImdbId(String imdbId);
}
