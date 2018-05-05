package environments;

import items.Item;
import characters.Character;

public class BossRoom extends Room {

  public BossRoom(String description, Character[] mobs, Item[] items, Door[] doors){
    super(description, mobs, items, doors);
  }

}
