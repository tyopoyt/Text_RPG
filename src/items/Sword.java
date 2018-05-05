package items;

/**
 * A class representing a Sword.
 */
public class Sword extends Weapon {

  /**
   * 5-arg constructor for a sword.
   *
   * @param damage      this sword's damage
   * @param weight      this sword's weight
   * @param defense     this sword's defense
   * @param acc         this sword's accuracy
   * @param description a description of the sword
   */
  public Sword(int damage, int weight, int defense, int acc, String description) {
    super(weight, damage, defense, acc, description, false);
  }
}