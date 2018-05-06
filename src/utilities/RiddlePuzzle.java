package utilities;

/**
 * A puzzle involving a riddle.
 */
public class RiddlePuzzle extends Puzzle{
  private Riddle riddle;
  private String[] answers;
  private String input;

  /**
   * 2-arg constructor.
   *
   * @param description a description of the RiddlePuzzle
   * @param riddle the riddle
   */
  public RiddlePuzzle(String description, Riddle riddle){
    super(description);
  }

  /**
   * Mutator for input.
   *
   * @param input the user's input
   */
  public void setInput(String input) {

  }

  @Override
  public boolean attempt(){
    return false;
  }

  @Override
  public void giveUp(Character actor){

  }
}
