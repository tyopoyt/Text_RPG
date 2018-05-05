package environments;

/**
 * A class representing a dungeon through which the player will explore.
 */
public class Dungeon {
  private Floor[] floors;

  /**
   * 1-arg constructor for a Dungeon.
   *
   * @param numFloors the number of floors in this dungeon
   */
  public Dungeon(int numFloors) {
    floors = new Floor[numFloors];
  }
}
