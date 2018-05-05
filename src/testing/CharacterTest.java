package testing;

import characters.Character;
import items.Shield;
import items.Sword;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.fail;

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
  public void testToString() {
    System.out.println(character);
    fail();
  }
}
