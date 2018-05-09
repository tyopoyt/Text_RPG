package environments;

import characters.Character;
import items.Item;

import java.io.Serializable;

public class BeginningRoom extends Room implements Serializable {

  /**
   * Constructs a Beginning Room
   *
   * @param description Description of the room
   * @param items       the items in the room
   * @param doors       the doors out of the room (corresponding to cardinal direction, 0 = west)
   */
  public BeginningRoom(String description, Item[] items, Door[] doors) {
    super(description, new Character[0], items, doors);
  }
}
