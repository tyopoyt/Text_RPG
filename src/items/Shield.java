package items;

import java.io.Serializable;

/**
 * A class representing a shield.
 */
public class Shield extends Weapon implements Serializable {
  /**
   * 5-arg constructor for a shield.
   *
   * @param damage      this shield's damage
   * @param weight      this shield's weight
   * @param defense     this shield's defense
   * @param acc         this shield's accuracy
   * @param description a description of this Shield
   * @param name        the shield's name
   */
  public Shield(int damage, int weight, int defense, int acc, String description, String name) {
    super(weight, damage, defense, acc, description, false, name);
  }
}