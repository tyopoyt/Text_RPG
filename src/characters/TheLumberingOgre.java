package characters;

import items.Item;
import items.Shield;
import items.Sword;

public class TheLumberingOgre extends Character{
  private static final Item OGRE_SWORD = new Sword(50,0,5, 70, "a massive weapon, caked in the blood of previous adventurers... or other monsters!");
  private static final Item OGRE_SHIELD = new Shield(10,0,20,5,"a shield larger than the door you just walked through, dented and blemished, yet solid as metal.");

  public TheLumberingOgre(){
    super("TheLumberingOgre", 150, 150, 6, 12, 15, OGRE_SWORD, OGRE_SHIELD);
  }
}
