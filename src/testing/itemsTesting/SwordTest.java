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
    accurateSword = new Sword(20,10,5,100, "Accurate Test Sword", "Sword");
    inaccurateSword = new Sword(20,10,5,0, "Inaccurate Test Sword", "Sword");
  }

  @Test
  public void testStrike(){
    assertEquals(20, accurateSword.strike());
    assertEquals(0, inaccurateSword.strike());
  }

  @Test
  public void testToString() {
    assertEquals("A sword weighing 10 lbs. with attack 20 \"Accurate Test Sword\"", accurateSword.toString());
  }
}