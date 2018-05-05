package items;

public class Key {
  private final String KEYCODE;
  private String description;


  /**
   * Constructor for a key object.
   *
   * @param CODE Code that will correspond with the door it unlocks
   * @param description Short description of the key's appearance
   */
  public Key(String CODE, String description){
    KEYCODE = CODE;
    this.description = description;
  }

  // GETTERS

  /**
   * Getter method for KEYCODE.
   *
   * @return the KEYCODE corresponding to this instance of key
   */
  public String getCode(){
    return KEYCODE;
  }

  /**
   * Getter for the description of the key.
   *
   * @return the description of the key
   */
  public String getDescription(){
    return description;
  }
}
