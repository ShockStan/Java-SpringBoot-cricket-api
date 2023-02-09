package shock.stan.cricket;

import java.util.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.*;

@Document(collection = "cricket")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class cricket {
	@Id
	private ObjectId _id;
	private String video;
	private String playerId;
	private String pName;
	private String pType;
	private String pBatHand;
	private String bowl_type;
	private String team;
	private String matches;
	private String inns;
	private String runs;
	private String wkts;
	private String image;
	private String bg;
	private List<String> IPL;
	@DocumentReference
	private List<Rating> rating;
	
	public cricket(String playerId, String pName, String video, String pType, String pBatHand, String bowl_type, String team, String matches, String inns, String runs, String wkts,List<String> IPL, String image, String bg, List<Rating> rating){
		this.playerId = playerId;
		this.video = video;
		this.bg = bg;
		this.IPL = IPL;
		this.pName = pName;
		this.pType = pType;
		this.pBatHand = pBatHand;
		this.bowl_type = bowl_type;
		this.team = team;
		this.matches = matches;
		this.inns = inns;
		this.runs = runs;
		this.wkts = wkts;
		this.image = image;		
		this.rating = rating;
	}
	public cricket() {}
	public String getBG() {
		return bg;
	}
	public void setBG(String bg) {
		this.bg = bg;
	}
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpType() {
		return pType;
	}
	public void setpType(String pType) {
		this.pType = pType;
	}
	public String getpBatHand() {
		return pBatHand;
	}
	public void setpBatHand(String pBatHand) {
		this.pBatHand = pBatHand;
	}
	public String getBowl_type() {
		return bowl_type;
	}
	public void setBowl_type(String bowl_type) {
		this.bowl_type = bowl_type;
	}
	public String getMatches() {
		return matches;
	}
	public void setMatches(String matches) {
		this.matches = matches;
	}
	public String getInns() {
		return inns;
	}
	public void setInns(String inns) {
		this.inns = inns;
	}
	public String getRuns() {
		return runs;
	}
	public void setRuns(String runs) {
		this.runs = runs;
	}
	public String getWkts() {
		return wkts;
	}
	public void setWkts(String wkts) {
		this.wkts = wkts;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public List<String> getIPL() {
		return IPL;
	}
	public void setIPL(List<String> iPL) {
		IPL = iPL;
	}
	public List<Rating> getRating() {
		return rating;
	}
	public void setRating(List<Rating> rating) {
		this.rating = rating;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	
}
