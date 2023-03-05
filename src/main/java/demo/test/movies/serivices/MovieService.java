package demo.test.movies.serivices;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.test.movies.models.Movies;
import demo.test.movies.repositories.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	public List<Movies> getAllMovies() {
		return movieRepository.findAll();
	}
	
	public Optional<Movies> getMovie(ObjectId id) {
		return movieRepository.findById(id);
	}
	
	public Optional<Movies> getMovieByImdb(String imdbId){
		return movieRepository.findMovieByImdbId(imdbId);
	}

}
