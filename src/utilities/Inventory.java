package utilities;

import environments.Room;
import items.Item;

import java.io.Serializable;
import java.util.Iterator;

/**
 * A class that represents a character's inventory
 */
public class Inventory implements Iterable<Item>, Serializable {
  private Item[] inventory;
  private int size;

  /**
   * 1-arg constructor for inventory.
   *
   * @param size the desired size of this inventory
   */
  public Inventory(int size) {
    inventory = new Item[size];
    this.size = inventory.length;
  }

  /**
   * Accessor for size.
   *
   * @return size
   */
  public int size() {
    return this.size;
  }

  /**
   * Add an item to this inventory.
   *
   * @param item the item to add
   * @return whether the item was successfully added
   */
  public boolean addItem(Item item) {
    if (!isFull()) {
      int index = -1;
      for (int i = 0; i < inventory.length; i++) {
        if (inventory[i] == null) {
          index = i;
          break;
        }
      }
      inventory[index] = item;
      return true;
    } else {
      System.out.println("Your inventory is full!");
      return false;
    }
  }

  /**
   * Drop an item from the player's inventory.
   *
   * @param index index of the item to drop
   * @param curRoom current Room the player is in
   */
  public void dropItem(int index, Room curRoom) {
    Item out = inventory[index];
    inventory[index] = null;
    curRoom.addItem(out);
  }

  /**
   * Determine whether or not this inventory is full.
   *
   * @return whether or not it's full
   */
  private boolean isFull() {

    if (inventory != null) {
      int count = 0;
      for (Item curItem : inventory) {
        if (curItem == null) {
          return false;
        }
        count++;
      }
      return count == size;
    } else {
      return false;
    }
  }

  /**
   * Accessor for contents.
   *
   * @return the contents of this inventory
   */
  public Item[] contents() {
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
    String lastItem = "";

    if (inventory != null) {
      for (Item curItem : inventory) {
        if (curItem != null) {
          sb.append(curItem.toString());
          sb.append("\n");
          lastItem = curItem.toString();
        }
      }
      }
    if (sb.length() == 0) {
      sb.append("Empty!\n");
    }
    return sb.toString();
  }
}
  
  