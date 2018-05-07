package items;

/**
 * An class representing some item that the player may obtain.
 */
public abstract class Item{
  private int weight;
  private final String DESCRIPTION;
  private final boolean IS_WEAPON;
  private final boolean IS_TOOL;
  private final boolean IS_STOREABLE;
  private final String NAME;

  /**
   * 2-arg constructor for an Item.
   *
   * @param weight the item's weight
   * @param isWeapon is the item a weapon?
   * @param description a description of this Item
   * @param isTool is this Item a tool?
   * @param name the Item's name
   */
  public Item(String name, int weight, String description, boolean isWeapon, boolean isTool, boolean isStoreable){
    this.weight = weight;
    IS_WEAPON = isWeapon;
    IS_TOOL = isTool;
    DESCRIPTION = description;
    NAME = name;
    IS_STOREABLE = isStoreable;
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

  public String getName(){
    return NAME;
  }

  /**
   * Is this item a tool?
   *
   * @return whether or not this item is a tool
   */
  public boolean isTool() {
    return IS_TOOL;
  }

  /**
   * Is the weapon able to be picked up?
   *
   * @return weather or not the item can be stored in inventory
   */
  public boolean isStoreable(){ return IS_STOREABLE; }

  /**
   * Examine the item
   *
   * @return description of the item
   */
  public String examine(){
    return DESCRIPTION;
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    if (!IS_WEAPON) {
      sb.append(getName()).append(" - Weight: ").append(weight);
    }
    return sb.toString();
  }


}