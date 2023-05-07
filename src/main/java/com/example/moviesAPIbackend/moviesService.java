package com.example.moviesAPIbackend;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class moviesService {
    @Autowired
    private moviesRepository movieRepository;
    public List<movies> allMovies()
    {
        return movieRepository.findAll();
    }
    public Optional<movies> getSingleMovie(String imdbId)
    {
        return movieRepository.findMoviesByImdbId(imdbId);
    }
}
