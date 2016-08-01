package com.ljmnz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Game game = new Game();
		char continuee = 'Y';
		
		while(continuee == 'Y'){
			game.startGame();
			game.displayBattleResults();
			try {
				continuee = scanner.nextLine().toUpperCase().charAt(0);
			} catch (StringIndexOutOfBoundsException  e) {
				continuee = 'N';
			}
		}
		System.out.println("Thank you for participating in the game.");
		scanner.close();
	}

}