package characters;

import items.Item;
import items.Sword;

import java.io.Serializable;

/**
 * A class representing a Spider.
 */
public class Spider extends Character implements Serializable {
  private static final Item BITE = new Sword(10, 0, 0, 90, "venomous fangs", "venomous Fangs");

  /**
   * Default constructor for the Spider class.
   */
  public Spider() {
    super("Spider", 50, 50, 2, 2, 75, BITE, null);
  }
}