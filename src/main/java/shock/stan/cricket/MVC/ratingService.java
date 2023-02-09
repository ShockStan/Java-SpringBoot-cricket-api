package shock.stan.cricket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ratingService {
	@Autowired
	private ratingRepository rateRepo;
	@Autowired
	private MongoTemplate mongotemplate;
	
	public Rating rate(String ratingStar, String playerId) {
		Rating star = rateRepo.insert(new Rating(ratingStar));
		mongotemplate.update(cricket.class)
				.matching(Criteria.where("playerId").is(playerId))
				.apply(new Update().push("rating").value(star)).first();
		return star;
	}
}
