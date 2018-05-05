package items;

/**
 * A class representing a shield.
 */
public class Shield extends Weapon {
  /**
   * 4-arg constructor for a shield.
   *
   * @param damage  this shield's damage
   * @param weight  this shield's weight
   * @param defense this shield's defense
   * @param acc     this shield's accuracy
   */
  public Shield(int damage, int weight, int defense, int acc, String description) {
    super(weight, damage, defense, acc, description);
  }
}