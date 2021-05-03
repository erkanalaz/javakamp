import java.util.Date;

import Abstract.GameService;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Entity.Campaign;
import Entity.Entity;
import Entity.Player;
import Service.MernisServiceAdapter;
import Entity.Game;


public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Player player1 = new Player(1, "Erkan", "Alaz", "12345678901",new Date(1989,6,19));
		
		Game game1 = new Game(1,"Tekken",100);
		
		Campaign campaign1 = new Campaign(1,"Yýlbaþý",20);
		
		GameManager gameManager=new GameManager();
		PlayerManager playerManager=new PlayerManager(new MernisServiceAdapter());
		CampaignManager campaignManager=new CampaignManager();
		
		playerManager.add(player1);
		gameManager.select(game1, player1);
		
		campaignManager.add(game1,campaign1);

		gameManager.sell(game1,player1);

		
		

		

	}

}
