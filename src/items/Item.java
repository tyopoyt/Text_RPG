package items;

//ITEM PARENT CLASS
public class Item{
  private int weight;
  private boolean isWeapon;
  
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