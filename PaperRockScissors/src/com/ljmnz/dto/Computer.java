package com.ljmnz.dto;

import java.util.Random;

import com.ljmnz.dto.interfaces.Player;
import com.ljmnz.dto.interfaces.Weapon;

public class Computer implements Player {

	public Weapon choseComputerAttack() {
		Random weaponCodeGenerator = new Random();
		int weaponCode = weaponCodeGenerator.nextInt(3) + 1;

		return attack(weaponCode);
	}

}
