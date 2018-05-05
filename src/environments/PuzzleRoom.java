package environments;

import characters.Character;
import items.Item;
import utilities.Puzzle;

public class PuzzleRoom extends Room {

  private final Puzzle PUZZLE;

  /**
   * 5-arg constructor for room.
   *
   * @param description description of this room
   * @param mobs        mobs in this room
   * @param items       items in this room
   * @param doors       doors in this room
   */
  public PuzzleRoom(String description, Character[] mobs, Item[] items, Door[] doors, Puzzle puzzle) {
    super(description, mobs, items, doors);
    PUZZLE = puzzle;
  }
}
