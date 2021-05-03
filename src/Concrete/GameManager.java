package Concrete;

import Abstract.GameService;
import Entity.Game;
import Entity.Player;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun baþarýlý bir þekilde EKLENDÝ!");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun baþarýlý bir þekilde SÝLÝNDÝ!");
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun baþarýlý bir þekilde GÜNCELLENDÝ!");
		
	}

	@Override
	public void sell(Game game, Player player) {
		System.out.println(player.getFirstName()+" "+player.getLastName()+" oyuncusu "+game.getName()+" oyununu satýn aldý!");
	}

	@Override
	public void select(Game game, Player player) {
		System.out.println(player.getFirstName()+" "+player.getLastName()+" oyuncusu "+game.getName()+" oyununu sepete ekledi!");
		System.out.println("Sepete eklenen oyun fiyatý : "+game.getPrice()+"TL");
	}

}
