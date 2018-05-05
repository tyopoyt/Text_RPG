package characters;

import items.Item;
import items.Shield;
import items.Sword;

/**
 * A class representing a Spartan.
 */
public class Spartan extends Character{
  private static final Item ROMAN_SWORD = new Sword(20, 0, 0, 97,"a strong, well made, Roman sword");
  private static final Item ROMAN_SHIELD = new Shield(0, 0, 15, 0, "an unbreakable Roman shield");

  /**
   * Default constructor for the Spartan class.
   */
  public Spartan(){
    super("Spartan", 100, 100, 3, 2, 70, ROMAN_SWORD, ROMAN_SHIELD);
  }
}