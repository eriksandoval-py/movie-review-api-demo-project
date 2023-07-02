package com.eriksandoval.moviereviewapidemoproject;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie, ObjectId>{
    Optional<Movie> findMovieByImdbId(String imdbId);
    

    
}
