package testing;

import items.Key;

public class TestingDriver {
  public static void main(String[] args) {
    Key key0 = new Key("A key.");
    Key key1 = key0;

    System.out.println(key0 == key1);
  }
}
