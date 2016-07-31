package com.ljmnz;

public abstract class BattleUtils {
	
	public interface WEAPONS_CODE{
		int ROCK 	 = 1;
		int PAPER 	 = 2;
		int SCISSORS = 3;
	}
	
	public interface WEAPONS_NAME{
		String ROCK 	 = "Rock";
		String PAPER 	 = "Paper";
		String SCISSORS  = "Scissors";
	}
	
	public interface BATTLE_RESULTS{
		String WIN 	= "Winner";
		String TIE 	= "Not decided";
		String LOSE = "Loser";
	}

}