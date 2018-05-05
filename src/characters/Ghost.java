package characters;

import items.Item;
import items.Sword;

//BANDIT CHARACTER
public class Ghost extends Character{
  private static final Item evilHand = new Sword(5, 0, 0,  30);
  
  public Ghost(){
    super("Ghost", 20, 20, 1, 2, 80, evilHand, null);
  }
}