package utilities;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils implements Serializable {

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
      /*String dir = System.getProperty("user.dir");
      File file;

      file = new File(dir + "\\src\\utilities\\riddles.txt");

      if (!file.canRead()) {
        file = new File(dir + "\\TextRPG_git.jar\\utilities\\riddles.txt");
      }*/
      InputStream inputStream = getClass().getResourceAsStream("/resources/riddles.txt");


      while (inputStream.available() > 0) {
        sb.append((char)inputStream.read());
      }
    } catch (IOException  e) {
      System.err.println(e.getMessage());
    }
    Scanner scan = new Scanner(sb.toString());
    sb = new StringBuilder();
    String temp;
    while (scan.hasNext()) {
      temp = scan.next();
      sb.append(temp).append(" ");
      if (temp.endsWith("?")) {
        scan.nextLine();
        riddles.add(new Riddle(sb.toString(), scan.nextLine()));
        sb = new StringBuilder();
      }
    }
  }
}
