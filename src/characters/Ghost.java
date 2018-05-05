package characters;

import items.Item;
import items.Sword;

/**
 * A class representing a Ghost.
 */
public class Ghost extends Character{
  private static final Item evilHand = new Sword(5, 0, 0,  30);

  /**
   * Default constructor for the Ghost class.
   */
  public Ghost(){
    super("Ghost", 20, 20, 1, 2, 80, evilHand, null);
  }
}