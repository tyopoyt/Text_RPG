package testing.itemsTesting;

import items.Shield;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests for Shield class.
 */
public class ShieldTest {
  private Shield accurateShield;
  private Shield inaccurateShield;

  @Before
  public void setUp(){
    accurateShield = new Shield(5,7,15,100,"Accurate Test Shield","Shield");
    inaccurateShield = new Shield(5,7,15,0,"Inaccurate Test Shield", "Shield");
  }

  @Test
  public void testStrike(){
    assertEquals(5, accurateShield.strike());
    assertEquals(0, inaccurateShield.strike());
  }

  @Test
  public void testToString() {
    assertEquals("A shield weighing 7 lbs. with attack 5 \"Accurate Test Shield\"", accurateShield.toString());
  }
}