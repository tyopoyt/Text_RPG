package items;

public class BattleAxe extends Weapon {

  /**
   * 5-arg BattleAxe Constuctor.
   *
   * @param damage      the damage the battleaxe does
   * @param weight      the weight of the battleaxe
   * @param defense     the defense of the battleaxe
   * @param accuracy    the accuracy of hte battleaxe
   * @param description the description of the battleaxe
   * @param name the battleaxe's name
   */
  public BattleAxe(int damage, int weight, int defense, int accuracy, String description, String name) {
    super(weight, damage, defense, accuracy, description, true, name);
  }
}
