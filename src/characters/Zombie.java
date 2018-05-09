package characters;

import items.Item;
import items.Shield;
import items.Sword;

import java.io.Serializable;

/**
 * A class representing a Zombie.
 */
public class Zombie extends Character implements Serializable {
  private static final Item BITE = new Sword(25, 0, 0, 20, "the ability to devour", "the ability to devour");
  private static final Item ARMS = new Shield(0, 0, 10, 0, "arms", "arms");

  /**
   * Default constructor for the Zombie class.
   */
  public Zombie(){
    super("Zombie", 100, 100, 4, 2, 30, BITE, ARMS);
  }
}