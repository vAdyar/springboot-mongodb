package com.example.springbootmongodb.service;

import com.example.springbootmongodb.dao.MovieRepositiory;
import com.example.springbootmongodb.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepositiory movieRepositiory;

    public Movie createMovie(Movie movie) {
        return movieRepositiory.save(movie);
    }

    public List<Movie> listMovie() {
        return movieRepositiory.findAll();
    }

    public Movie getMovie(String id) {
        return movieRepositiory.findById(id);
    }

    public Movie updateMovie(Movie movie) {
        return movieRepositiory.save(movie);
    }
}
