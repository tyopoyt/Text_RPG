package testing.itemsTesting;

import items.BattleAxe;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BattleAxeTest {
  private BattleAxe accurateAxe;
  private BattleAxe inaccurateAxe;

  @Before
  public void setUp() {
    accurateAxe = new BattleAxe(10,1,5,100, "Test BattleAxe");
    inaccurateAxe = new BattleAxe(10,1,5,0, "Test BattleAxe");
  }

  @Test
  public void testBattleAxeStrike(){
    int out = accurateAxe.strike();
    assertEquals(10, out);
    out = inaccurateAxe.strike();
    assertEquals(0, out);
  }

  @Test
  public void testBattleAxeBlock(){
    int out = accurateAxe.block(5);
    assertEquals(0, out);
  }

  @Test
  public void testBattleAxeIsTwoHanded(){
    assertTrue(accurateAxe.isTwoHanded());
  }
}