package items;

/**
 * An abstract class representing some sort of weapon.
 */
public abstract class Weapon extends Item {
  private final boolean IS_TWO_HANDED;
  private int damage;
  private int defense;
  private int accuracy;

  /**
   * 6-arg constructor for Weapon class.
   *
   * @param weight      weight of the weapon
   * @param damage      damage the weapon deals on a successful strike
   * @param defense     defense points the weapon can block
   * @param accuracy    the accuracy of the weapon
   * @param description a description of the weapon
   * @param isTwoHanded is the weapon two-handed?
   */
  public Weapon(int weight, int damage, int defense, int accuracy, String description,
                boolean isTwoHanded) {
    super(weight, description, true, false);
    this.damage = damage;
    this.defense = defense;
    this.accuracy = accuracy;
    IS_TWO_HANDED = isTwoHanded;
  }

  //GETTERS

  /**
   * Accessor for damage.
   *
   * @return damage
   */
  public int getDamage() {
    return damage;
  }

  /**
   * Accessor for defense.
   *
   * @return defense
   */
  public int getDefense() {
    return defense;
  }

  /**
   * Accessor for accuracy.
   *
   * @return accuracy
   */
  public int getAccuracy() {
    return accuracy;
  }

  /**
   * Is the weapon two-handed?
   *
   * @return whether the weapon is two-handed
   */
  public boolean isTwoHanded() {
    return IS_TWO_HANDED;
  }


  // ATTACK AND DEFEND METHODS

  /**
   * Player strikes using weapons that are equipped.
   *
   * @return damage done
   */
  public int strike() {
    boolean hit = ((int) (Math.random() * 100)) <= getAccuracy();

    if (hit) {
      return getDamage();
    } else {
      return 0;
    }
  }

  /**
   * Player blocks using the weapons that are equipped.
   *
   * @param incomingDamage the damage that is incoming to the character
   * @return the damage the character should take
   */
  public int block(int incomingDamage) {
    if (getDefense() >= incomingDamage)
      damage = 0;
    else
      damage = incomingDamage - getDefense();
    return damage;
  }
}