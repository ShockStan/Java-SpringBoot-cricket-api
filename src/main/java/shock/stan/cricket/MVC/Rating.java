package shock.stan.cricket;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Document(collection = "Rating")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
	@Id
	private ObjectId _id;
	private String body;
	
	public Rating(String body) {
		this.body = body;
	}
	
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
}
