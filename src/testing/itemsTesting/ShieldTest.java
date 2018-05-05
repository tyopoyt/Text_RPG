package testing.itemsTesting;

import items.Shield;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests for Shield class.
 */
public class ShieldTest {
  Shield accurateShield;
  Shield inaccurateShield;

  @Before
  public void setUp(){
    accurateShield = new Shield(5,7,15,100,"Accurate Test Shield");
    inaccurateShield = new Shield(5,7,15,0,"Inaccurate Test Shield");
  }

  @Test
  public void testStrike(){
    assertEquals(5, accurateShield.strike());
    assertEquals(0, inaccurateShield.strike());
  }

  @Test
  public void testBlock(){
    assertEquals(0, accurateShield.block(15));
    assertEquals(5, accurateShield.block(20));
  }

  @Test
  public void testToString() {
    assertEquals("Weapon weighing: 7 with a damage of: 5", accurateShield.toString());
  }
}