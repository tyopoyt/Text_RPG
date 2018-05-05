package environments;

import characters.Character;
import items.Item;
import utilities.Puzzle;

/**
 * A room with a puzzle that must be solved before advancing.
 */
public class PuzzleRoom extends Room {

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
}
