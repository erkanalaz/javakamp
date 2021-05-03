package Concrete;

import Abstract.PlayerService;
import Entity.Player;
import Service.PlayerCheckService;

public class PlayerManager implements PlayerService{

	private PlayerCheckService playerCheckService;
	
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		super();
		this.playerCheckService = playerCheckService;
	}
	
	
	@Override
	public void add(Player player) {
		if (playerCheckService.checkIfRealPerson(player)) {
			System.out.println(player.getFirstName()+" "+player.getLastName()+" oyuncusu baþarýlý bir þekilde EKLENDÝ!");
		}else {
			System.out.println("Oyuncu bilgileri hatalýdýr!");
		}
		
				
	}

	@Override
	public void delete(Player player) {
		System.out.println("Oyuncu baþarýlý bir þekilde SÝLÝNDÝ!");
		
	}

	@Override
	public void update(Player player) {
		System.out.println("Oyuncu baþarýlý bir þekilde GÜNCELLENDÝ!");
		
	}

}
