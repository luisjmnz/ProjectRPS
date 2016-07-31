package com.ljmnz.dto;

import com.ljmnz.dto.interfaces.Player;
import com.ljmnz.dto.interfaces.Weapon;

public class User implements Player {

	public Weapon choseUserAttack(int weaponCode) {
		return attack(weaponCode);
	}

}
