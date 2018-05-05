package characters;

import items.Item;
import items.Sword;

//characters.WanderingSpectre CHARACTER
public class WanderingSpectre extends Character
{
  private static final Item wail = new Sword(6, 0, 0, 70);
  
  public WanderingSpectre(){
    super("Wandering Spectre", 100, 100, 4, 2, 30, wail, null);
  }
}