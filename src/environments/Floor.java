package environments;

public class Floor{
  private Room[] roomsList;
  private Room[][] level;
  
  public Floor(){
    roomsList = new Room[40];
    populateRooms();
    level = new Room[10][10];
  }
  
  public void populateRooms(){
  }
}