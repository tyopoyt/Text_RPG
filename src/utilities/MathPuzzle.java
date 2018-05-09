package utilities;

import characters.Character;

import java.io.Serializable;

/**
 * Class for representing a math puzzle
 */
public class MathPuzzle extends Puzzle implements Serializable {
  private String mathPuzzle;
  private int answer;

  /**
   * 3-arg Constructor for Math Puzzle.
   *
   * @param description the description of the puzzle
   * @param mathPuzzle the math puzzle itself
   * @param answer the answer to the math puzzle
   */
  public MathPuzzle(String description, String mathPuzzle, int answer){
    super(description);
  }

  @Override
  public boolean attempt(Character actor) {
    return false;
  }

  @Override
  public void giveUp(Character actor) {

  }
}
