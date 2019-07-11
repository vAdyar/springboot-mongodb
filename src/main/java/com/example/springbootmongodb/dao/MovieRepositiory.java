package com.example.springbootmongodb.dao;

import com.example.springbootmongodb.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MovieRepositiory extends MongoRepository< Movie, Long> {

    List<Movie> findAllByRatingGreaterThan(Double rating);

    Movie findById(String id);
}
