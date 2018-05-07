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
   * @param name        The name of the Weapon
   */
  public Weapon(int weight, int damage, int defense, int accuracy, String description,
                boolean isTwoHanded, String name) {
    super(name, weight, description, true, false);
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

  @Override
  public String examine() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.examine()).append("\n\tDamage: ").append(getDamage()).append("\n\tDefense: ").append(getDefense());
    sb.append("\n\tAccuracy: ").append(getAccuracy());
    return sb.toString();
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    StringBuilder sb2 = new StringBuilder(this.getClass().toString());
    sb2.replace(0, sb2.toString().lastIndexOf(".") + 1, "");
    sb.append(getName()).append(" - A ").append(sb2.toString().toLowerCase()).append(" weighing ")
            .append(super.getWeight()).append(" lbs. with attack ").append(damage).append(".");
    return sb.toString();
  }
}