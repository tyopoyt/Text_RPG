package items;

/**
 * An class representing some item that the player may obtain.
 */
public class Item{
  private int weight;
  private boolean isWeapon;

  /**
   * 2-arg constructor for an Item.
   *
   * @param weight the item's weight
   * @param isWeapon is the item a weapon?
   */
  public Item(int weight, boolean isWeapon){
    this.weight = weight;
    this.isWeapon = isWeapon;
  }
  
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

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    if (!isWeapon) {
      sb.append("Item weighing: ").append(weight);
    }
    return sb.toString();
  }


}