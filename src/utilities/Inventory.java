package utilities;

import items.Item;

import java.util.Iterator;

//utilities.Inventory Class
public class Inventory implements Iterable<Item> {
  private Item[] inventory;
  private int size;
  
  public Inventory(int size){
    inventory = new Item[size];
    this.size = size;
  }
  
  public int size(){
    return this.size;
  }
  
  public void addItem(Item item){
    if (!isFull()) {
      int index = -1;
      for (int i = 0; i < inventory.length; i++) {
        if (inventory[i] == null) {
          index = i;
          break;
        }
      }
      inventory[index] = item;
    } else {
      System.out.println("Your inventory is full!");
    }
  }
  
  //Returns item to room for possible later pickup
  public Item dropItem(int index){
    Item out = inventory[index];
    inventory[index] = null;
    return out;
  }
  
  public boolean isFull(){
    if (inventory != null) {
      int count = 0;
      for(int i = 0; i < inventory.length; i++)
        if(inventory[i] != null){ count++; }
      if(count == size)
        return true;
      else
        return false;
    } else {
      return false;
    }
  }
  
  public Item[] contents(){
    return inventory;
  }

  @Override
  public Iterator<Item> iterator() {
    return new Iterator<Item>() {
      int index = -1;

      @Override
      public boolean hasNext() {
        return (index + 1) < inventory.length;
      }

      @Override
      public Item next() {
        return inventory[++index];
      }
    };
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    if (inventory != null) {
      for (Item curItem : inventory) {
        if (curItem != null) {
          sb.append(curItem.toString());
          sb.append(", ");
        }
      }
      if (sb.toString().contains(",")) {
        sb.replace(sb.lastIndexOf(","), sb.length(), "\n");
        sb.replace(sb.lastIndexOf(","), (sb.lastIndexOf("A") + 1), " and a");
      }
    }

    if (sb.length() == 0) {
      sb.append("Empty!\n");
    }

    return sb.toString();
  }
}
  
  