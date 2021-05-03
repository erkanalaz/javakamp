package Concrete;

import Abstract.GameService;
import Entity.Game;
import Entity.Player;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun ba�ar�l� bir �ekilde EKLEND�!");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun ba�ar�l� bir �ekilde S�L�ND�!");
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun ba�ar�l� bir �ekilde G�NCELLEND�!");
		
	}

	@Override
	public void sell(Game game, Player player) {
		System.out.println(player.getFirstName()+" "+player.getLastName()+" oyuncusu "+game.getName()+" oyununu sat�n ald�!");
	}

	@Override
	public void select(Game game, Player player) {
		System.out.println(player.getFirstName()+" "+player.getLastName()+" oyuncusu "+game.getName()+" oyununu sepete ekledi!");
		System.out.println("Sepete eklenen oyun fiyat� : "+game.getPrice()+"TL");
	}

}
