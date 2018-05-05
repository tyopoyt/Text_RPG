package characters;

import items.Item;
import items.Sword;

/**
 * A class representing a Slime.
 */
public class Slime extends Character
{
  private static final Item PUNCH = new Sword(5, 0, 0, 70);

  /**
   * Default constructor for the Slime class.
   */
  public Slime(){
    super("Slime", 25, 50, 1, 2, 20, PUNCH, null);
  }
}