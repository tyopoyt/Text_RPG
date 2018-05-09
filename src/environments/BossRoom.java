package environments;

import items.Item;
import characters.Character;

import java.io.Serializable;

public class BossRoom extends Room implements Serializable {

  /**
   * Constructor for TheLumberingOgre Room. NOTE: THE BOSS ROOM SHOULD ONLY HAVE ONE ENEMY, UNLESS THE BOSS IS CAPABLE OF SUMMONING ADS
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
