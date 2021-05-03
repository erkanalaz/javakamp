package Concrete;

import Abstract.CampaignService;
import Entity.Game;
import Service.PlayerCheckService;
import Entity.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Game game, Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ " kampanyas� ba�ar�l� bir �ekilde UYGULANDI!");	
		System.out.println("Kampanya sonras� toplam fiyat : "+(game.getPrice()-(game.getPrice()*campaign.getCampaignRate()/100))+"TL");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya ba�ar�l� bir �ekilde S�L�ND�!");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya ba�ar�l� bir �ekilde G�NCELLEND�!");
		
	}

	
}
