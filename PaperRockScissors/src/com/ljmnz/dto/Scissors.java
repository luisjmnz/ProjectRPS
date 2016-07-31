package com.ljmnz.dto;

import com.ljmnz.BattleUtils;
import com.ljmnz.dto.interfaces.Weapon;

public class Scissors implements Weapon {

	public String getWeaponName(){
		return BattleUtils.WEAPONS_NAME.SCISSORS;
	}
	
}