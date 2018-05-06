package items;

public class Torch extends Tool {

  private int life;
  private boolean alight;

  /**
   * Torch constructor.
   *
   * @param weight      the weight of the torch
   * @param description the description of the torch
   */
  public Torch(int weight, String description) {
    super(weight, description);
    life = 10;
    alight = false;
  }

  /**
   * Method to use the torch.
   */
  public void use() {
    alight = true;
  }

  /**
   * Method to extinguish the torch.
   */
  public void extinguish() {
    alight = false;
  }

  /**
   * Decrement life.
   */
  public void decreaseLife() {
    life--;
  }

  /**
   * Is the torch alight?
   *
   * @return status of torch being alight
   */
  public boolean isAlight() {
    return alight;
  }

  /**
   * Getter for the remaining life of the torch
   *
   * @return remaining life of Torch
   */
  public int getLifeRemaining() {
    return life;
  }
}
