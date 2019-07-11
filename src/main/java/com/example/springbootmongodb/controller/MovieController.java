package com.example.springbootmongodb.controller;

import com.example.springbootmongodb.model.Movie;
import com.example.springbootmongodb.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping()
    public Movie createMovie(Movie movie) {
        return movieService.createMovie(movie);
    }

    @GetMapping()
    public List<Movie> listMovies() {
        return movieService.listMovie();
    }

    @GetMapping("/{id}")
    public Movie getMovie(@PathVariable String id) {
        return movieService.getMovie(id);
    }

    @PutMapping("/{id}")
    public Movie updateMovie(Movie movie) {
        return movieService.updateMovie(movie);
    }
}
