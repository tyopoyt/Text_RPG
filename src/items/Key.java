package items;

import environments.Door;

public class Key extends Tool {


  /**
   * 2-arg constructor for a key object.
   *
   * @param weight the weight of this Key
   * @param description Short description of the key's appearance
   */
  public Key(int weight, String description){
    super(weight, description);
  }

  // GETTERS

  @Override
  public void use() {

  }
}
