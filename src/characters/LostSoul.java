package characters;

import items.Item;
import items.Sword;

/**
 * A class representing a Lost Soul.
 */
public class LostSoul extends Character{
  private static final Item EVIL_HAND = new Sword(10, 0, 0, 70, "the spectral hand of a Ghost");

  /**
   * Default constructor for the LostSoul class.
   */
  public LostSoul(){
    super("Lost Soul", 100, 100, 4, 2, 30, EVIL_HAND, null);
  }
}