package com.ljmnz.dto;

import java.util.Random;

import com.ljmnz.dto.interfaces.Player;
import com.ljmnz.dto.interfaces.Weapon;

public class Computer implements Player {

	public Weapon chooseAttack(Integer weaponCode) {
		Random weaponCodeGenerator = new Random();
		int genWeaponCode = weaponCodeGenerator.nextInt(3) + 1;

		return attack(genWeaponCode);
	}

}