package items;

import utilities.Inventory;

/**
 * Class for a table prop in a room
 */
public class Table extends Item {

  private Inventory tableTop;

  /**
   * Constructor for a table
   *
   * @param name name of table
   * @param description description of table
   * @param invSize inventory size of table
   */
  public Table(String name, String description, int invSize){
    super(name, 100, description, false,false,false);
    tableTop = new Inventory(invSize);
  }

  public String examineTableTopItem(Item obj){
    return obj.examine();
  }




  @Override
  public String examine(){
    StringBuilder sb = new StringBuilder();
    sb.append(super.examine()).append(" Atop the table sit: \n");
    for (Item curItem: tableTop) {
      sb.append(curItem.getName()).append("\n");
    }
    return sb.toString();
  }
}
