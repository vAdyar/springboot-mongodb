package com.example.springbootmongodb;

import com.example.springbootmongodb.dao.MovieRepositiory;
import com.example.springbootmongodb.model.Movie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringbootMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongodbApplication.class, args);
	}

}
