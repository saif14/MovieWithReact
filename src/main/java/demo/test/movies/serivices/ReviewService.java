package demo.test.movies.serivices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import demo.test.movies.models.Movies;
import demo.test.movies.models.Reviews;
import demo.test.movies.repositories.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository repository;
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	
	public Reviews createReview(String reviewBody, String imdbId) {
		Reviews review = repository.insert(new Reviews(reviewBody));
	
		mongoTemplate.update(Movies.class)
					.matching(Criteria.where("imdbId").is(imdbId))
					.apply(new Update().push("reviewIds", review))
					.first();
		
		return review;
		
	}

}
