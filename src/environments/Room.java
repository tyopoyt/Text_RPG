package environments;

import characters.Character;
import items.Item;
import java.util.ArrayList;
import java.util.Collections;

/**
 * A class representing a room on a floor.
 */
public abstract class Room {
  private String description;
  private ArrayList<Character> mobs;
  private ArrayList<Item> items;
  private Door[] doors;

  /**
   * 3-arg constructor for room.
   *
   * @param description description of this room
   * @param mobs mobs in this room
   * @param items items in this room
   * @param doors doors in this room
   */
  public Room(String description, Character[] mobs, Item[] items, Door[] doors) {
    this.description = description;
    Collections.addAll(this.mobs, mobs);
    Collections.addAll(this.items, items);
    this.doors = doors;
  }
}