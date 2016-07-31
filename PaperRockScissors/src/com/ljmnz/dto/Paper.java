package com.ljmnz.dto;

import com.ljmnz.BattleUtils;
import com.ljmnz.dto.interfaces.Weapon;

public class Paper implements Weapon {
	
	public String getWeaponName(){
		return BattleUtils.WEAPONS_NAME.PAPER;
	}

}
