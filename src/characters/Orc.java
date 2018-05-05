package characters;

import items.Item;
import items.Shield;
import items.Sword;

//ORC CHARACTER
public class Orc extends Character{
  private static final Item orcishSword = new Sword(15, 0, 0, 80);
  private static final Item woodenShield = new Shield(0, 0, 5, 0);
  
  public Orc(){
    super("characters.Orc", 100, 100, 5, 5, 50, orcishSword, woodenShield);
  }
}