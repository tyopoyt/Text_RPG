package items;

public abstract class Tool extends Item {

  /**
   * 1-arg constructor for a Tool.
   *
   * @param weight the tool's weight
   */
  public Tool(int weight) {
    super(weight, false, true);
  }

  /**
   * Use this tool.
   */
  public abstract void use();

}