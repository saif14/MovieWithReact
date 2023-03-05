package demo.test.movies.models;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reviews {
	
	private ObjectId id;
	private String body;
	public Reviews(String body) {
		super();
		this.body = body;
	}
	
	

}
