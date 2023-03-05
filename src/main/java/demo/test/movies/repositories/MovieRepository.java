package demo.test.movies.repositories;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import demo.test.movies.models.Movies;

@Repository
public interface MovieRepository extends MongoRepository<Movies, ObjectId> {
	
	Optional<Movies> findMovieByImdbId(String imdbId);

}
