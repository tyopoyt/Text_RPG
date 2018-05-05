package items;

public class Key {
  private String description;


  /**
   * Constructor for a key object.
   *
   * @param description Short description of the key's appearance
   */
  public Key(String description){
    this.description = description;
  }

  // GETTERS

  /**
   * Getter for the description of the key.
   *
   * @return the description of the key
   */
  public String getDescription() {
    return description;
  }
}
