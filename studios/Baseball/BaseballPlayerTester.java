package Baseball;

import static org.junit.Assert.*;

import org.junit.Test;

public class BaseballPlayerTester {

	@Test
	public void testAddGameStats() {
		BaseballPlayer a = new BaseballPlayer("Test", 10, "L");
		assertTrue("Not initiating new player correctly.", a.getJerseyNum() == 10);
		a.addGameStats(5, 7);
		assertTrue("Not adding hits", a.getHits() == 5);
		assertTrue("Not adding RBIs", a.getRBI() == 7);
		assertTrue("Not calculating games", a.getGames() == 1);
	}

}
