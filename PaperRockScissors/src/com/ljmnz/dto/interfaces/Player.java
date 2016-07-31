package com.ljmnz.dto.interfaces;

import com.ljmnz.BattleUtils;
import com.ljmnz.dto.Paper;
import com.ljmnz.dto.Rock;
import com.ljmnz.dto.Scissors;

public interface Player {

	public default Weapon attack(int weaponCode){
		Weapon weapon;
		
		switch (weaponCode) {
		case BattleUtils.WEAPONS_CODE.PAPER:
			weapon = new Paper();
			break;
		case BattleUtils.WEAPONS_CODE.ROCK:
			weapon = new Rock();
			break;
		case BattleUtils.WEAPONS_CODE.SCISSORS:
			weapon = new Scissors();
			break;
		default:
			System.out.println("Weapon not valid!");
			return null;
		}
		return weapon;
	}
	
}