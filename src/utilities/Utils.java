package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {

  public static ArrayList<Riddle> riddles;

  /**
   * An enum for player race
   */
  public enum Race {
    OGRE, HUMAN, ELF, HALFLING, INVALID;
  }

  public Utils() {
    riddles = new ArrayList<>();
    setUp();
  }

  private void setUp() {
    StringBuilder sb = new StringBuilder();
    try {
      FileInputStream inputStream = new FileInputStream(new File("src/utilities/riddles.txt"));
      while (inputStream.available() > 0) {
        sb.append((char)inputStream.read());
      }
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }

    Scanner scan = new Scanner(sb.toString());
    sb = new StringBuilder();
    String temp;
    while (scan.hasNext()) {
      temp = scan.nextLine();
      sb.append(temp);
      if (temp.endsWith("?")) {
        riddles.add(new Riddle(sb.toString(), scan.nextLine()));
      }
    }

    System.out.println(riddles);
  }
}
