package characters;

import items.Item;
import items.Shield;
import items.Sword;

/**
 * A class representing a bandit.
 */
public class Bandit extends Character{
  private static final Item BROKEN_SWORD = new Sword(30, 0, 0, 75, "a broken sword, obviously a last resort");
  private static final Item WOODEN_SHIELD = new Shield(0, 0, 5, 0, "a wooden shield");

  /**
   * Default constructor for the Bandit class.
   */
  public Bandit() {
    super("Bandit", 80, 80, 2, 2, 75, BROKEN_SWORD, WOODEN_SHIELD);
  }
}