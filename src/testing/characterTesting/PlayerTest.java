package testing.characterTesting;

import characters.Player;
import items.*;
import org.junit.Before;
import org.junit.Test;
import utilities.Utils;

import static org.junit.Assert.*;

public class PlayerTest {

  private static final Item BROKEN_OGRE_SWORD = new Sword(30,15, 0, 80, "a weapon dropped by The Lumbering Ogre, it shattered when he dropped it, yet it still packs quite a punch!", "Broken Ogre Sword");
  private static Shield test2;
  private static HealthPotion HP1;
  private static Torch item1;
  private static Player p1;

  @Before
  public void setUp(){
    test2 = new Shield(5,5,15,80,"Shield 1", "Test Shield 1");
    HP1 = new HealthPotion(35, "Health Test 1");
    item1 = new Torch(5, "Test Torch 1", 10);
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
    System.out.println("----------AFTER EQUIPPING HEALTH POTION:");
    p1.pickUp(HP1);
    System.out.println(p1.checkInventory());
    System.out.println("----------AFTER EQUIPPING TORCH:");
    p1.pickUp(item1);
    System.out.println(p1.checkInventory());
    System.out.println("----------AFTER EQUIPPING SWORD AND SHIELD:");
    p1.equipMain(BROKEN_OGRE_SWORD);
    p1.equipSecondary(test2);
    System.out.println(p1.checkInventory());
    System.out.println("----------BELOW IS PLAYER TOSTRING:");
    System.out.println(p1.toString());
    System.out.println("----------SEARCHING INVENTORY FOR ITEM TO EXAMINE (ITEM THERE):");
    System.out.println(p1.examineInventoryItem("Ogre"));
    System.out.println("----------SEARCHING INVENTORY FOR ITEM TO EXAMINE (ITEM NOT THERE):");
    System.out.println(p1.examineInventoryItem("Pixie dUsT"));
  }
}