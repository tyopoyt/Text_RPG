package items;

/**
 * Class for the Mirror Item
 */
public class Mirror extends Item {

  /**
   * Constructor for a mirror.
   *
   * @param name the name of the mirror
   * @param description the description of the mirror
   */
  public Mirror(String name, String description){
    super(name, 100, description, false, false, false);
  }

  /**
   * Method to look at the mirror.
   *
   * @return the string description of the reflection
   */
  public String lookAt(){
    return "It's you.";
  }
}
