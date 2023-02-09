package shock.stan.cricket;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@Component
@RequestMapping("/api/v1/cricket")
public class CricketController {
	@Autowired
	private CricketService cricketService;
	
	@GetMapping
	public ResponseEntity<List<cricket>> getAllStats(){
		return new ResponseEntity<List<cricket>>(cricketService.allStats(),HttpStatus.OK);	
	}
	
	@GetMapping("/playerId/{playerId}")
	public ResponseEntity<Optional<cricket>> getPlayerById(@PathVariable String playerId){
		return new ResponseEntity<Optional<cricket>>(cricketService.findPlayerById(playerId), HttpStatus.OK);
	}
	
	@GetMapping("/team/{team}")
	public ResponseEntity<List<cricket>> getPlayerByteam(@PathVariable String team){
		return new ResponseEntity<List<cricket>>(cricketService.findPlayerByteam(team), HttpStatus.OK);
	}
	
}
