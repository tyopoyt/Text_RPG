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

  /**
   * Examines an item on the table.
   *
   * @param name the object in question
   * @return description of the object
   */
  public String examineTableTopItem(String name){
    StringBuilder sb = new StringBuilder();
    for(Item curItem: tableTop.contents()){
      if(curItem != null && name.equalsIgnoreCase(curItem.getName())){
        sb.append(curItem.getName()).append(" - ").append(curItem.examine());
      }
    }
    if(sb.length() <= 0){
      sb.append("Item not found.");
    }
    return sb.toString();
  }

  /**
   * Accessor method for the table's inventory
   *
   * @return the table's inventory
   */
  public Inventory getTableTop(){ return tableTop; }

  @Override
  public String examine() {
    StringBuilder sb = new StringBuilder();
    if(tableTop.size() > 1){
      sb.append(" Atop the table sits a ");
    } else {
      sb.append(super.examine()).append(" Atop the table sit: \n");
    }
    for (Item curItem : tableTop) {
      if (curItem != null) {
        sb.append(curItem.getName()).append("\n");
      }
      }
      return sb.toString();
  }
}
