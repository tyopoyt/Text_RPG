package items;

/**
 * An class representing some item that the player may obtain.
 */
public abstract class Item{
  private int weight;
  private boolean isWeapon;
  private boolean isTool;

  /**
   * 2-arg constructor for an Item.
   *
   * @param weight the item's weight
   * @param isWeapon is the item a weapon?
   */
  public Item(int weight, boolean isWeapon, boolean isTool){
    this.weight = weight;
    this.isWeapon = isWeapon;
    this.isTool = isTool;
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
    return isWeapon;
  }

  /**
   * Is this item a tool?
   *
   * @return whether or not this item is a tool
   */
  public boolean isTool() {
    return isTool;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    if (!isWeapon) {
      sb.append("Item weighing: ").append(weight);
    }
    return sb.toString();
  }


}