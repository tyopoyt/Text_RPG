package utilities;

import characters.Character;

import java.util.Scanner;

/**
 * A puzzle involving a riddle.
 */
public class RiddlePuzzle extends Puzzle{
  private Riddle riddle;
  private String input;

  /**
   * 2-arg constructor.
   *
   * @param description a description of the RiddlePuzzle
   * @param riddle the riddle
   */
  public RiddlePuzzle(String description, Riddle riddle){
    super(description);
    this.riddle = riddle;
  }

  /**
   * Mutator for input.
   *
   * @param input the user's input
   */
  public void setInput(String input) {
    this.input = input;
  }

  @Override
  public boolean attempt(){
    Scanner inputScanner = new Scanner(input);
    while (inputScanner.hasNext()) {
      if (riddle.answer().toLowerCase().contains(inputScanner.next().toLowerCase())) {
        return true;
      }
    }
    return false;
  }

  @Override
  public void giveUp(Character actor){
    actor.takeDamage(30);
  }
}
