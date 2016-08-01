package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ljmnz.BattleUtils;
import com.ljmnz.Game;

public class GameTest {

	Game gameTest;
	
	@Before
	public void before(){
		//Test fights, we test all possible encounters.
		gameTest = new Game();
	}
	
	@Test
	public void figthPaperVsPaperTest() {
		// TIE
		String result = gameTest.figth(BattleUtils.WEAPONS_NAME.PAPER, BattleUtils.WEAPONS_NAME.PAPER); 
		Assert.assertTrue(BattleUtils.BATTLE_RESULTS.TIE.equals(result));
	}
	
	@Test
	public void figthPaperVsRockTest() {
		// WIN
		String result = gameTest.figth(BattleUtils.WEAPONS_NAME.PAPER, BattleUtils.WEAPONS_NAME.ROCK);
		Assert.assertTrue(BattleUtils.BATTLE_RESULTS.WIN.equals(result));
	}
	
	@Test
	public void figthPaperVsScissorsTest() {
		// LOSE
		String result = gameTest.figth(BattleUtils.WEAPONS_NAME.PAPER, BattleUtils.WEAPONS_NAME.SCISSORS);
		Assert.assertTrue(BattleUtils.BATTLE_RESULTS.LOSE.equals(result));
	}
	
	@Test
	public void figthRockVsRockTest() {
		// TIE
		String result = gameTest.figth(BattleUtils.WEAPONS_NAME.ROCK, BattleUtils.WEAPONS_NAME.ROCK);
		Assert.assertTrue(BattleUtils.BATTLE_RESULTS.TIE.equals(result));
	}
	
	@Test
	public void figthRockVsScissorsTest() {
		// WIN
		String result = gameTest.figth(BattleUtils.WEAPONS_NAME.ROCK, BattleUtils.WEAPONS_NAME.SCISSORS);
		Assert.assertTrue(BattleUtils.BATTLE_RESULTS.WIN.equals(result));
	}
	
	@Test
	public void figthScissorsVsScissorsTest() {
		// TIE
		String result = gameTest.figth(BattleUtils.WEAPONS_NAME.SCISSORS, BattleUtils.WEAPONS_NAME.SCISSORS);
		Assert.assertTrue(BattleUtils.BATTLE_RESULTS.TIE.equals(result));
	}

}