package environments;

import characters.Character;
import items.Item;

/**
 * A class representing a room on a floor.
 */
public class Room {
  private String description;
  private Character[] mobs;
  private Item[] items;

  /**
   * 3-arg constructor for room.
   *
   * @param description description of this room
   * @param mobs mobs in this room
   * @param items items in this room
   */
  public Room(String description, Character[] mobs, Item[] items) {
    this.description = description;
    this.mobs = mobs;
    this.items = items;
  }
}