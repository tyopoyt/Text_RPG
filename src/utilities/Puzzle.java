package utilities;

import characters.Character;

public abstract class Puzzle {
  private boolean isSolved;
  private String description;

  public Puzzle(String description){

  }

  /**
   * Returns status of puzzle.
   *
   * @return status of solve
   */
  public boolean isSolved(){
    return false;
  }

  /**
   * Set the puzzle as solved.
   */
  public void solve() {
    isSolved = true;
  }

  /**
   * Attempt to solve this puzzle.
   *
   * @return attempt status
   * @param actor the character attempting to solve the puzzle
   */
  public abstract boolean attempt(Character actor);

  /**
   * Give up on solving this puzzle.
   *
   * @param actor the character giving up
   */
  public abstract void giveUp(Character actor);
}
