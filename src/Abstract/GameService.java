package Abstract;

import Entity.Game;
import Entity.Player;
import Entity.Campaign;

public interface GameService {
	
	void add(Game game);
	
	void delete(Game game);
	
	void update(Game game);
	
	void select(Game game, Player player);
	
	void sell(Game game,Player player);
	
}
