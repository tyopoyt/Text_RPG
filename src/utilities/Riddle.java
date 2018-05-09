package utilities;

import java.io.Serializable;

/**
 * A riddle.
 */
public class Riddle implements Serializable {
  private String text;
  private String answer;

  /**
   * 2-arg constructor.
   *
   * @param text   the riddle
   * @param answer the answer
   */
  public Riddle(String text, String answer) {
    this.text = text;
    this.answer = answer;
  }

  /**
   * Accessor for text.
   *
   * @return text of the riddle
   */
  public String text(){
    return text;
  }

  /**
   * Accessor for answer.
   *
   * @return nswer to the riddle.
   */
  public String answer() {
    return answer;
  }

  @Override
  public String toString() {
    return text + " Answer: " + answer;
  }

}
