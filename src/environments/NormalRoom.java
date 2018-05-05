package environments;

import items.Item;
import characters.Character;

public class NormalRoom extends Room {

  public NormalRoom(String description, Character[] mobs, Item[] items, Door[] doors){
    super(description, mobs, items, doors);
  }
}
