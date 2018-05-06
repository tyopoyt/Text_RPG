package items;

public abstract class Tool extends Item {

  /**
   * 2-arg constructor for a Tool.
   *
   * @param weight      the tool's weight
   * @param description a description of the Tool
   */
  public Tool(int weight, String description, String name) {
    super(name, weight, description, false, true);
  }

  /**
   * Use this tool.
   */
  public abstract void use();

}
