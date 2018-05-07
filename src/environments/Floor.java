package environments;

/**
 * A class representing a floor in a dungeon.
 */
public class Floor{
  private BeginningRoom [] beginningRoomsList;
  private NormalRoom[] normalRoomsList;
  private BossRoom[] bossRoomsList;
  private TreasureRoom[] treasureRoomsList;
  private Room[][] level;

  /**
   * Default constructor for a floor.
   */
  public Floor(){
    populateRooms();
    level = new Room[5][5];
  }

  public void generateFloor(){

  }
  /**
   * Add enemies and items to the room.
   */
  public void populateRooms(){
  }

  /**
   * Advance to the next floor.
   */
  public void advanceFloor(){
    //TODO: write method to move onto next floor
  }
}