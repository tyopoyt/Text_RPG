package items;

/**
 * Class for a chair prop in a room.
 */
public class Chair extends Item {

  /**
   * Constructor for a chair prop.
   *
   * @param name name of chair
   * @param description description of chair
   */
  public Chair(String name, String description){
    super( name, 100, description,false, false, false);
  }

  /**
   * Breaks chair into burnable pieces.
   *
   * @return the torch the chair breaks into
   */
  public Torch breakDown(){
    return new Torch(5, "A torch made from dismantling a chair, not of good quality.", 2);
  }
}
