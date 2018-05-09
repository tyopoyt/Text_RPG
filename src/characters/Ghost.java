package characters;

import items.Item;
import items.Sword;

import java.io.Serializable;

/**
 * A class representing a Ghost.
 */
public class Ghost extends Character implements Serializable {
  private static final Item EVIL_HAND = new Sword(5, 0, 0,  30, "a spectral claw", "its evil hand");

  /**
   * Default constructor for the Ghost class.
   */
  public Ghost(){
    super("Ghost", 20, 20, 1, 2, 80, EVIL_HAND, null);
  }
}