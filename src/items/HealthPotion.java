package items;

import characters.Character;

//POTION MASTER CLASS
public class HealthPotion extends Item
{
  private int heal;
  
  public HealthPotion(int h){
    super(0, false);
    heal = h;
  }
  
  public void use(Character c){
    c.heal(heal);
  }
}