package environments;

import characters.Character;
import items.Item;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/**
 * A class representing a room on a floor.
 */
public abstract class Room implements Serializable {
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
    this.mobs = new ArrayList<>();
    this.items = new ArrayList<>();
    this.description = description;
    Collections.addAll(this.mobs, mobs);
    Collections.addAll(this.items, items);
    this.doors = doors;
  }

  public void addItem(Item obj){
    items.add(obj);
  }

  /**
   * Accessor for items.
   *
   * @return items
   */
  public ArrayList<Item> getItems(){
    return items;
  }

  public String getDescription(){
    return description;
  }
}