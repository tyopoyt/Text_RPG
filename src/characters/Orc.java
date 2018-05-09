package characters;

import items.Item;
import items.Shield;
import items.Sword;

import java.io.Serializable;

/**
 * A class representing an orc.
 */
public class Orc extends Character implements Serializable {
  private static final Item ORCISH_SWORD = new Sword(15, 0, 0, 80, "an Orcish sword", "Orcish Sword");
  private static final Item WOODEN_SHIELD = new Shield(0, 0, 5, 0, "a wooden shield", "Wooden Shield");

  /**
   * Default constructor for the Orc class.
   */
  public Orc(){
    super("Orc", 100, 100, 5, 5, 50, ORCISH_SWORD, WOODEN_SHIELD);
  }
}