package characters;

import items.Item;
import items.Shield;
import items.Sword;

/**
 * A class representing a Spartan.
 */
public class Spartan extends Character{
  private static final Item romanSword = new Sword(20, 0, 0, 97);
  private static final Item romanShield = new Shield(0, 0, 15, 0);

  /**
   * Default constructor for the Spartan class.
   */
  public Spartan(){
    super("Spartan", 100, 100, 3, 2, 70, romanSword, romanShield);
  }
}