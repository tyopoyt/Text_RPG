package environments;

import characters.Character;
import items.Item;

public class Room{
  private String description;
  private Character[] mobs;
  private Item[] items;
  
  public Room(String desc, Character[] mobs, Item[] items){
    this.description = desc;
    this.mobs = mobs;
    this.items = items;
  }
}