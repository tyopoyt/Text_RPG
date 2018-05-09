package items;

/**
 * Class for the Mirror Item
 */
public class Mirror extends Item {

  /**
   * Constructor for a mirror.
   *
   * @param name the name of the mirror
   */
  public Mirror(String name) {
    super(name, 100, "It's you.", false, false, false);
  }
}
