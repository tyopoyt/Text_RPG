package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
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
      System.out.println(System.getProperty("user.dir"));
      FileInputStream inputStream = new FileInputStream(new File(System.getProperty("user.dir") + "\\src\\utilities\\riddles.txt"));
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
