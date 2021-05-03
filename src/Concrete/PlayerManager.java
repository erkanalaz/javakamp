package Concrete;

import Abstract.PlayerService;
import Entity.Player;

public class PlayerManager implements PlayerService{

	@Override
	public void add(Player player) {
		System.out.println(player.getFirstName()+" "+player.getLastName()+" oyuncusu ba�ar�l� bir �ekilde EKLEND�!");
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("Oyuncu ba�ar�l� bir �ekilde S�L�ND�!");
		
	}

	@Override
	public void update(Player player) {
		System.out.println("Oyuncu ba�ar�l� bir �ekilde G�NCELLEND�!");
		
	}

}
