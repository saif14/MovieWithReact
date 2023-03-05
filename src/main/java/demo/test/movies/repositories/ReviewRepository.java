package demo.test.movies.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import demo.test.movies.models.Reviews;

public interface ReviewRepository extends MongoRepository<Reviews, ObjectId>{

}
