package environments;

import characters.Character;
import items.Item;
import utilities.Puzzle;

import java.io.Serializable;

/**
 * A room with a puzzle that must be solved before advancing.
 */
public class PuzzleRoom extends Room implements Serializable {
  private final Puzzle PUZZLE;

  /**
   * 5-arg constructor for room.
   *
   * @param description description of this room
   * @param mobs        mobs in this room
   * @param items       items in this room
   * @param doors       doors in this room
   * @param puzzle      this room's puzzle
   */
  public PuzzleRoom(String description, Character[] mobs, Item[] items, Door[] doors, Puzzle puzzle) {
    super(description, mobs, items, doors);
    PUZZLE = puzzle;
  }


  /**
   * Checks to see if puzzle is solved.
   *
   * @return solve status
   */
  public boolean isSolved(){
    return false;
  }
}
