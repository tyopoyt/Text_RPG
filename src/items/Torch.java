package items;

public class Torch extends Tool {

  private int life;
  private boolean alight;

  /**
   * Torch constructor.
   *
   * @param weight      the weight of the torch
   * @param description the description of the torch
   * @param life        the number of rooms the torch can be lit in before it goes out
   */
  public Torch(int weight, String description, int life) {
    super(weight, description, "A torch");
    this.life = life;
    alight = false;
  }


  @Override
  public void use(){light();}
  /**
   * Method to light the torch.
   */
  private void light() {
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

  @Override
  public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString()).append(" and a remaining lifetime of ").append(getLifeRemaining()).append(" rooms remaining.");
    return sb.toString();
  }
}
