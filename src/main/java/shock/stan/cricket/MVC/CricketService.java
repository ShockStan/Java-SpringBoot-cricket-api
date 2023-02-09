package shock.stan.cricket;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CricketService {
	@Autowired
	private CricketRepository cricketRepository;
	
	public List<cricket> allStats() {
		return cricketRepository.findAll();
	}
	
	public Optional<cricket> findPlayerById(String playerId) {
		return cricketRepository.findByplayerId(playerId);
	}
	public List<cricket> findPlayerByteam(String team){
		List<cricket> z = new ArrayList<cricket>();
		for(cricket a: cricketRepository.findAll()) {
			if(a.getTeam().equalsIgnoreCase(team))
				z.add(a);
		}
		if(z.isEmpty()) {
			return null;
		}		
		return z;
	}
}
