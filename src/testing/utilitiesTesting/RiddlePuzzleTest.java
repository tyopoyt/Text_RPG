package testing.utilitiesTesting;

import characters.Bandit;
import org.junit.Before;
import org.junit.Test;
import utilities.Riddle;
import utilities.RiddlePuzzle;

import static org.junit.Assert.*;

public class RiddlePuzzleTest {

  RiddlePuzzle rp;
  Bandit bandit;

  @Before
  public void setUp() {
    Riddle r = new Riddle("This is a riddle?", "Yes that's correct");
    rp = new RiddlePuzzle("A RiddlePuzzle", r);
    bandit = new Bandit();
  }

  @Test
  public void testAttempt() {
    rp.setInput("incorrect");
    assertFalse(rp.attempt());
    rp.setInput("yes");
    assertTrue(rp.attempt());
    rp.setInput("correct");
    assertTrue(rp.attempt());
    rp.setInput("yes 987865765 correct");
    assertTrue(rp.attempt());
  }

  @Test
  public void testGiveUp() {
    rp.giveUp(bandit);
    assertNotEquals(80, bandit.getHealth());
  }
}