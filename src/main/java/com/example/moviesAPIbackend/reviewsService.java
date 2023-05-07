package com.example.moviesAPIbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class reviewsService {
    @Autowired
    private reviewsRepository reviewRepository;
    @Autowired
    private MongoTemplate mongoTemplate;
    public reviews createReviews(String reviewBody, String imdbId)
    {
        reviews review = reviewRepository.insert(new reviews(reviewBody));

        mongoTemplate.update(movies.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review))
                .first();
        return review;
    }
}
