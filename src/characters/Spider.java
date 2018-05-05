package characters;

import items.Item;
import items.Sword;

//SPIDER CLASS
public class Spider extends Character{
  private static final Item bite = new Sword(10, 0, 0, 90);
  
  public Spider() {
    super("Spider", 50, 50, 2, 2, 75, bite, null);
  }
}