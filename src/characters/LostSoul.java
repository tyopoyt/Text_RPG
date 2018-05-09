package characters;

import items.Item;
import items.Sword;

import java.io.Serializable;

/**
 * A class representing a Lost Soul.
 */
public class LostSoul extends Character implements Serializable {
  private static final Item EVIL_HAND = new Sword(10, 0, 0, 70, "the spectral hand of a Ghost", "its evil hand");

  /**
   * Default constructor for the LostSoul class.
   */
  public LostSoul(){
    super("Lost Soul", 100, 100, 4, 2, 30, EVIL_HAND, null);
  }
}