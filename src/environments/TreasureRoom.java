package environments;

import items.Item;
import characters.Character;

import java.io.Serializable;

/**
 * Treasure rooms should contain much more items or better items.
 */
public class TreasureRoom extends Room implements Serializable {

  /**
   * 4-arg constructor for a Treasure room.
   *
   * @param description a description of this room
   * @param mobs        the mobs in this room
   * @param items       the items in this room
   * @param doors       the doors in this room
   */
  public TreasureRoom(String description, Character[] mobs, Item[] items, Door[] doors) {
    super(description, mobs, items, doors);
  }
}
