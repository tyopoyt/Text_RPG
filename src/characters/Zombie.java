package characters;

import items.Item;
import items.Shield;
import items.Sword;

//ZOMBIE CHARACTER
public class Zombie extends Character{
  private static final Item bite = new Sword(25, 0, 0, 20);
  private static final Item arms = new Shield(0, 0, 2, 0);
  
  public Zombie(){
    super("characters.Zombie", 100, 100, 4, 2, 30, bite, arms);
  }
}