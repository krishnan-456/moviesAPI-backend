package com.example.moviesAPIbackend;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/movies")
public class moviesController {
    @Autowired
    private moviesService movieService;
    @CrossOrigin(origins = "*")
    @GetMapping
    public ResponseEntity<List<movies>> getAllMovies()
    {
        return new ResponseEntity<List<movies>>(movieService.allMovies(), HttpStatus.OK);
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<movies>> getSingleMovie(@PathVariable String imdbId)
    {
        return new ResponseEntity<Optional<movies>>(movieService.getSingleMovie(imdbId), HttpStatus.OK);
    }
}
