package com.example.moviesAPIbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
@RestController
@RequestMapping("/api/reviews")
public class reviewController {
    @Autowired
    private reviewsService reviewService;
    @CrossOrigin(origins = "*")
    @PostMapping
    public ResponseEntity<reviews> createReviews(@RequestBody Map<String,String> payload)
    {
        return new ResponseEntity<reviews>(reviewService.createReviews(payload.get("reviewBody"),payload.get("imdbId")), HttpStatus.CREATED);
    }
}
