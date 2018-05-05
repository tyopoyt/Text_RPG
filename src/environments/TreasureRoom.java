package environments;

import items.Item;

public class TreasureRoom extends Room {
  /**
   * Treasure rooms should contain much more items or better items.
   */
  public TreasureRoom(String description, Character[] mobs, Item[] items){
    super(description, mobs, items);
  }
}
