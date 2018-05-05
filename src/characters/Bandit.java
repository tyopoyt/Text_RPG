package characters;

import items.Item;
import items.Shield;
import items.Sword;

//BANDIT CHARACTER
public class Bandit extends Character{
  private static final Item brokenSword = new Sword(30, 0, 0, 30);
  private static final Item woodenShield = new Shield(0, 0, 5, 0);
  
  public Bandit() {
    super("Bandit", 80, 80, 2, 2, 75, brokenSword, woodenShield);
  }
}