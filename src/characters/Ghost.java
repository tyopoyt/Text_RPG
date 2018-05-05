package characters;

import items.Item;
import items.Sword;

/**
 * A class representing a Ghost.
 */
public class Ghost extends Character{
  private static final Item EVIL_HAND = new Sword(5, 0, 0,  30, "a spectral claw");

  /**
   * Default constructor for the Ghost class.
   */
  public Ghost(){
    super("Ghost", 20, 20, 1, 2, 80, EVIL_HAND, null);
  }
}