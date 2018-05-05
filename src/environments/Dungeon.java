package environments;

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
