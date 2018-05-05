package characters;

import items.Item;
import items.Sword;

// SLIME CLASS
public class Slime extends Character
{
  private static final Item punch = new Sword(5, 0, 0, 70);
  
  public Slime(){
    super("characters.Slime", 25, 50, 1, 2, 20, punch, null);
  }
}