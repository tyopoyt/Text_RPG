package environments;

import items.Item;
import characters.Character;

import java.io.Serializable;

public class NormalRoom extends Room implements Serializable {

  public NormalRoom(String description, Character[] mobs, Item[] items, Door[] doors){
    super(description, mobs, items, doors);
  }
}
