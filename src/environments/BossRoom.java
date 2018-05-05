package environments;

import items.Item;
import characters.Character;

public class BossRoom extends Room {

  /**
   * Constructor for Boss Room. NOTE: THE BOSS ROOM SHOULD ONLY HAVE ONE ENEMY, UNLESS THE BOSS IS CAPABLE OF SUMMONING ADS
   *
   * @param description SEE SUPER
   * @param mobs SEE SUPER
   * @param items SEE SUPER
   * @param doors SEE SUPER
   */
  public BossRoom(String description, Character[] mobs, Item[] items, Door[] doors){
    super(description, mobs, items, doors);
  }

}
