package testing.characterTesting;

import characters.Player;
import items.*;
import org.junit.Before;
import org.junit.Test;
import utilities.Utils;

import static org.junit.Assert.*;

public class PlayerTest {

  private static Sword test1;
  private static Shield test2;
  private static HealthPotion HP1;
  private static Torch item1;
  private static Player p1;

  @Before
  public void setUp(){
    test1 = new Sword(20,5,5,80,"Sword 1", "Test Sword 1");
    test2 = new Shield(5,5,15,80,"Shield 1", "Test Shield 1");
    HP1 = new HealthPotion(35, "Health Test 1");
    item1 = new Torch(5, "Test Torch 1");
    p1 = new Player("Thomas Test", Utils.Race.OGRE);
    }

  @Test
  public void testInteract() {

  }

  @Test
  public void testMove() {

  }

  @Test
  public void testPlayerOverall() {
    System.out.println(p1.checkInventory());
    p1.pickUp(HP1);
    System.out.println(p1.checkInventory());
    p1.pickUp(item1);
    System.out.println(p1.checkInventory());
    p1.equipMain(test1);
    p1.equipSecondary(test2);
    System.out.println(p1.checkInventory());
  }
}