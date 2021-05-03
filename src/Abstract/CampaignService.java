package Abstract;

import Entity.Campaign;
import Entity.Game;

public interface CampaignService {
	
	void add(Game game,Campaign campaign);
	
	void delete(Campaign campaign);
	
	void update(Campaign campaign);

}
