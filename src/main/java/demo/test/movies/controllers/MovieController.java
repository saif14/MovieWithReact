package demo.test.movies.controllers;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.test.movies.serivices.MovieService;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping
	public ResponseEntity<?> allMovies() {
		return new ResponseEntity<>(movieService.getAllMovies(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getMovie(@PathVariable ObjectId id){
		return new ResponseEntity<>(movieService.getMovie(id), HttpStatus.OK);
		
	}
	
	@GetMapping("imdb/{imdbId}")
	public ResponseEntity<?> getMoviebyImdbId(@PathVariable String imdbId){
		return new ResponseEntity<>(movieService.getMovieByImdb(imdbId), HttpStatus.OK);
		
	}
	
	
}
