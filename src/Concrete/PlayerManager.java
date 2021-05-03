package Concrete;

import Abstract.PlayerService;
import Entity.Player;

public class PlayerManager implements PlayerService{

	@Override
	public void add(Player player) {
		System.out.println(player.getFirstName()+" "+player.getLastName()+" oyuncusu baþarýlý bir þekilde EKLENDÝ!");
		
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
