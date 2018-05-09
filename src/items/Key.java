package items;

import java.io.Serializable;

public class Key extends Tool implements Serializable {


  /**
   * 2-arg constructor for a key object.
   *
   * @param weight the weight of this Key
   * @param description Short description of the key's appearance
   * @param name the key's name
   */
  public Key(int weight, String description, String name){
    super(weight, description, name);
  }

  // GETTERS

  @Override
  public void use() {

  }
}
