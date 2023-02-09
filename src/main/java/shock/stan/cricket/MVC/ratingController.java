package shock.stan.cricket;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/rating")
public class ratingController {
	@Autowired
	private ratingService rateService;
	@PostMapping()
	public ResponseEntity<Rating> createRating(@RequestBody Map<String, String> payload){
		return new ResponseEntity<Rating>(rateService.rate(payload.get("ratingStar"), payload.get("playerId")),HttpStatus.CREATED);	
	}
}
