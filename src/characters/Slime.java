package characters;

import items.Item;
import items.Sword;

import java.io.Serializable;

/**
 * A class representing a Slime.
 */
public class Slime extends Character implements Serializable {
  private static final Item BASH = new Sword(5, 0, 0, 70, "the ability to bash", "ability to bash");

  /**
   * Default constructor for the Slime class.
   */
  public Slime() {
    super("Slime", 25, 50, 1, 2, 20, BASH, null);
  }
}