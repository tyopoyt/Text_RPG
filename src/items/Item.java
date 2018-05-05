package items;

/**
 * An class representing some item that the player may obtain.
 */
public abstract class Item{
  private int weight;
  private final String DESCRIPTION;
  private final boolean IS_WEAPON;
  private final boolean IS_TOOL;

  /**
   * 2-arg constructor for an Item.
   *
   * @param weight the item's weight
   * @param isWeapon is the item a weapon?
   */
  public Item(int weight, String description, boolean isWeapon, boolean isTool){
    this.weight = weight;
    IS_WEAPON = isWeapon;
    IS_TOOL = isTool;
    DESCRIPTION = description;
  }

  /**
   * Accessor for weight.
   *
   * @return the weight of this object
   */
  public int getWeight(){
    return weight;
  }

  /**
   * Is this item a weapon?
   *
   * @return whether or not this item is a weapon
   */
  public boolean isWeapon() {
    return IS_WEAPON;
  }

  /**
   * Is this item a tool?
   *
   * @return whether or not this item is a tool
   */
  public boolean isTool() {
    return IS_TOOL;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    if (!IS_WEAPON) {
      sb.append("Item weighing: ").append(weight);
    }
    return sb.toString();
  }


}