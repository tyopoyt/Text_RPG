package characters;

import items.Item;
import items.Sword;

//LOSTSOUL CHARACTER
public class LostSoul extends Character{
  private static final Item evilHand = new Sword(10, 0, 0, 30);
  
  public LostSoul(){
    super("Lost Soul", 100, 100, 4, 2, 30, evilHand, null);
  }
}