package testing.utilitiesTesting;

import org.junit.Before;
import org.junit.Test;
import utilities.Riddle;

import static org.junit.Assert.*;

public class RiddleTest {
  private Riddle riddle;

  @Before
  public void setUp() {
    riddle = new Riddle("A sample riddle?", "Yes");
  }

  @Test
  public void text() {
    assertEquals("A sample riddle?", riddle.text());
  }

  @Test
  public void answer() {
    assertEquals("Yes", riddle.answer());
  }
}