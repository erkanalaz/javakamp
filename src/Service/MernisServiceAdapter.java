package Service;

import Entity.Player;

public class MernisServiceAdapter implements PlayerCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {
		return player.getNationalityId().length()==11;
	}

}
