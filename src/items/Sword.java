package items;

import java.io.Serializable;

/**
 * A class representing a Sword.
 */
public class Sword extends Weapon implements Serializable {

  /**
   * 5-arg constructor for a sword.
   *
   * @param damage      this sword's damage
   * @param weight      this sword's weight
   * @param defense     this sword's defense
   * @param acc         this sword's accuracy
   * @param description a description of the sword
   * @param name        the sword's name
   */
  public Sword(int damage, int weight, int defense, int acc, String description, String name) {
    super(weight, damage, defense, acc, description, false, name);
  }
}