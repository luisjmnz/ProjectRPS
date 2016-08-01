package com.ljmnz;

import java.util.Scanner;

import com.ljmnz.dto.Computer;
import com.ljmnz.dto.User;
import com.ljmnz.dto.interfaces.Player;
import com.ljmnz.dto.interfaces.Weapon;

public class Game {
	
	Scanner scanner;
	private int wonBattles;
	private int lostBattles;
	
	public Game(){
		scanner = new Scanner(System.in);
	}
	
	public void startGame(){
		initializeGame();
		
		while(!existWinner()){
			String gameResult = play();			
			System.out.println(gameResult);
			displayBattleStats();
		}
	}
	
	private void initializeGame(){
		System.out.println("The player who first wins 3 battles, will win the game. \n");
		wonBattles = 0;
		lostBattles = 0;
	}

	private String play() {
		Player user = new User();
		Player enemy = new Computer();
		
		int weaponCode = readWeaponCode();
		Weapon enemyWeapon = enemy.chooseAttack(null);
		Weapon userWeapon = user.chooseAttack(weaponCode);
		
		String userResult = figth(userWeapon.getWeaponName(), enemyWeapon.getWeaponName());
		String userWeaponName = userWeapon.getWeaponName();
		String enemyWeaponName = enemyWeapon.getWeaponName();
		
		switch (userResult) {
			case BattleUtils.BATTLE_RESULTS.WIN:
				wonBattles++;
				return userWeaponName + " defeats " + enemyWeaponName +	". You win the battle! \n";
				
			case BattleUtils.BATTLE_RESULTS.LOSE:
				lostBattles++;
				return userWeaponName + " loses to " + enemyWeaponName + ". Computer wins the battle! \n";
				
			case BattleUtils.BATTLE_RESULTS.TIE:
				return "Both You and Computer chose " + userWeaponName + ". The battle is a tie! \n";
		}
		return "Battle could not be finished correctly";
	}
	
	private int readWeaponCode(){
		System.out.println("Please choose the weapon you wish to use to attack the computer "
				+ "(1=Rock, 2=paper, 3=Scissors):");
		
		int input = 0;
		while (!scanner.hasNextInt()) {
		   System.out.println("Invalid weapon code, please try again!");
		   scanner.nextLine();
		}
		input = scanner.nextInt();
				
		if(input < 1 || input > 3){
			System.out.println("Invalid weapon code, please try again!");
			input = readWeaponCode();
		}
		return input;
	}
	
	private String figth(String userChoice, String pcChoice){
		if(userChoice.equals(pcChoice)){
			return BattleUtils.BATTLE_RESULTS.TIE;
		}
		switch (userChoice) {
			case BattleUtils.WEAPONS_NAME.ROCK:
				return (BattleUtils.WEAPONS_NAME.SCISSORS.equals(pcChoice) 
							? BattleUtils.BATTLE_RESULTS.WIN : BattleUtils.BATTLE_RESULTS.LOSE );
			case BattleUtils.WEAPONS_NAME.PAPER:
				return (BattleUtils.WEAPONS_NAME.ROCK.equals(pcChoice) 
							? BattleUtils.BATTLE_RESULTS.WIN : BattleUtils.BATTLE_RESULTS.LOSE );
			case BattleUtils.WEAPONS_NAME.SCISSORS:
				return (BattleUtils.WEAPONS_NAME.ROCK.equals(pcChoice) 
							? BattleUtils.BATTLE_RESULTS.LOSE : BattleUtils.BATTLE_RESULTS.WIN );
		default:
			return null;
		}
	}
	
	private boolean existWinner(){
		if(wonBattles == 3 || lostBattles == 3){
			return true;
		}
		return false;
	}
	
	private void displayBattleStats() {
		System.out.println("You have won " + wonBattles + " battles and lost " + lostBattles + " battles. \n\n");
	}
	
	public void displayBattleResults(){
		if(wonBattles == 3){
			System.out.println("You have won the war. Congratulations! Would you like to try again?\n"
					+ " Press (Y) to continue or any other caracter to quit the game.");
		}else if(lostBattles == 3){
			System.out.println("You have lost the war. Would you like to try again?\n"
					+ " Press (Y) to continue or any other caracter to quit the game.");
		}
	}

}