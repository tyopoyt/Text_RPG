package environments;

/**
 * A class representing a floor in a dungeon.
 */
public class Floor{
  private Room[] roomsList;
  private Room[][] level;

  /**
   * Default constructor for a floor.
   */
  public Floor(){
    roomsList = new Room[40];
    populateRooms();
    level = new Room[10][10];
  }

  /**
   * Add enemies and items to the room.
   */
  public void populateRooms(){
  }

  public void nextFloor(){
    //TODO: write method to move onto next floor
  }
}