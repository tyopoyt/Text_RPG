package testing.characterTesting;

import characters.Character;
import items.Shield;
import items.Sword;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

/**
 * A class to test the Character class.
 */
public class CharacterTest
{

  private Character character;

  @Before
  public void setup() {
    Sword leftItem = new Sword(12, 12, 2, 100);
    Shield rightItem = new Shield(2, 18, 30, 100);
    character = new Character("Bob", 100, 100, 1, 12, 10, leftItem, rightItem);
  }

  @Test
  public void testConstructors() {
    assertNotNull(character);
  }

  @Test
  public void testToString() {
    assertEquals("Name: Bob\n" +
            "---- Stats ----\n" +
            "Health: 100\n" +
            "Speed: 10\n" +
            "Level: 1\n" +
            "Inventory: Empty!\n" +
            "Equipped: A 12-damage sword and a 30-defense shield\n", character.toString());
  }
}
