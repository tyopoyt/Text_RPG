package characters;

import items.Item;
import items.Sword;

/**
 * A class representing a Spider.
 */
public class Spider extends Character{
  private static final Item BITE = new Sword(10, 0, 0, 90);

  /**
   * Default constructor for the Spider class.
   */
  public Spider() {
    super("Spider", 50, 50, 2, 2, 75, BITE, null);
  }
}