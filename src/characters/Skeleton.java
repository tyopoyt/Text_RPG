package characters;

import items.Item;
import items.Shield;
import items.Sword;

/**
 * A class representing a Skeleton
 */
public class Skeleton extends Character
{
  private static final Item BONE_SWORD = new Sword(7, 0, 0, 56);
  private static final Item SKIN_SHIELD = new Shield(0, 0, 10, 0);

  /**
   * Default constructor for the Skeleton class.
   */
  public Skeleton(){
    super("Skeleton", 75, 75, 3, 2, 50, BONE_SWORD,
            SKIN_SHIELD);
  }
}