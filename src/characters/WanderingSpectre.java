package characters;

import items.Item;
import items.Sword;

/**
 * A class representing a Wandering Spectre.
 */
public class WanderingSpectre extends Character
{
  private static final Item wail = new Sword(6, 0, 0, 70);

  /**
   * Default constructor for the WanderingSpectre class.
   */
  public WanderingSpectre(){
    super("Wandering Spectre", 100, 100, 4, 2, 30, wail, null);
  }
}