package testing.itemsTesting;

import items.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests for Sword class.
 */
public class SwordTest {
  private Sword accurateSword;
  private Sword inaccurateSword;

  @Before
  public void setUp(){
    accurateSword = new Sword(20,10,5,100, "Accurate Test Sword");
    inaccurateSword = new Sword(20,10,5,0, "Inaccurate Test Sword");
  }

  @Test
  public void testStrike(){
    assertEquals(20, accurateSword.strike());
    assertEquals(0, inaccurateSword.strike());
  }

  @Test
  public void testBlock(){
    assertEquals(0, accurateSword.block(5));
    assertEquals(10, inaccurateSword.block(15));
  }

  @Test
  public void testToString() {
    assertEquals("Weapon weighing: 10 with a damage of: 20", accurateSword.toString());
  }
}