package utilities;

/**
 * A puzzle where the player must guess the correct answer.
 */
public class GuessPuzzle extends Puzzle {
  private String guessPuzzle;
  private String[] options;
  private int correctAns;

  /**
   * 4-arg constructor for a guess puzzle
   *
   * @param description description of puzzle
   * @param guessPuzzle puzzle text
   * @param options     puzzle answer options
   * @param correctAns  index of correct answer
   */
  public GuessPuzzle(String description, String guessPuzzle, String[] options, int correctAns) {
    super(description);
  }

  @Override
  public boolean attempt() {
    return false;
  }

  @Override
  public void giveUp() {

  }
}
