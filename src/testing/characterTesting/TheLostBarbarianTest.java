package testing.characterTesting;

import characters.TheLostBarbarian;
import environments.BossRoom;
import environments.Door;
import environments.Room;
import items.Item;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TheLostBarbarianTest {
  private TheLostBarbarian boss1;
  private BossRoom room1;
  private characters.Character[] boss;

  @Before
  public void setUp(){
    boss = new characters.Character[1];
    boss1 = new TheLostBarbarian();
    boss[0] = boss1;
    Item[] items = new Item[0];
    Door[] doors = new Door[1];
    room1 = new BossRoom("Boss room test", boss, items, doors);
  }

  /**
   * This will also test the Item's examine properties.
   */
  @Test
  public void testLootDrop() {
    TheLostBarbarian boss1v2 = ((TheLostBarbarian)boss[0]);
    boss1v2.dropLoot(room1);
    for (Item curItem : room1.getItems()) {
      System.out.println(curItem);
      System.out.println(curItem.examine());
    }
    assertNotEquals(new ArrayList<Item>(), room1.getItems());
  }
}