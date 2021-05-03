package Concrete;

import Abstract.CampaignService;
import Entity.Game;
import Service.PlayerCheckService;
import Entity.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Game game, Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ " kampanyasý baþarýlý bir þekilde UYGULANDI!");	
		System.out.println("Kampanya sonrasý toplam fiyat : "+(game.getPrice()-(game.getPrice()*campaign.getCampaignRate()/100))+"TL");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya baþarýlý bir þekilde SÝLÝNDÝ!");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya baþarýlý bir þekilde GÜNCELLENDÝ!");
		
	}

	
}
