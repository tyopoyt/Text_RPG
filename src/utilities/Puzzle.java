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
   * Attempt to solve this puzzle.
   *
   * @return attempt status
   */
  public abstract boolean attempt();

  /**
   * Give up on solving this puzzle.
   */
  public abstract void giveUp(Character actor);
}
