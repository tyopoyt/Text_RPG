package items;

/**
 * A class representing a Sword.
 */
public class Sword extends Weapon{

  /**
   * 4-arg constructor for a sword.
   *
   * @param damage this shield's damage
   * @param weight this shield's weight
   * @param defense this shield's defense
   * @param acc this shield's accuracy
   */
  public Sword(int damage, int weight, int defense, int acc){
    super(weight, damage, defense, acc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("A ").append(getDamage()).append("-damage sword");
    return sb.toString();
  }
}