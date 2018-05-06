package testing.utilitiesTesting;

import org.junit.Before;
import org.junit.Test;
import utilities.Riddle;
import utilities.RiddlePuzzle;

import static org.junit.Assert.*;

public class RiddlePuzzleTest {

  RiddlePuzzle rp;

  @Before
  public void setUp() {
    Riddle r = new Riddle("This is a riddle?", "Yes");
    rp = new RiddlePuzzle("A RiddlePuzzle", r);
  }

  @Test
  public void testAttempt() {
  }

  @Test
  public void testGiveUp() {
  }
}