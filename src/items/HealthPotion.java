package items;

import characters.Character;

/**
 * A class representing a health potion.
 */
public class HealthPotion extends Item
{
  private int heal;

  /**
   * 1-arg constructor for a HealthPotion.
   *
   * @param heal the amount of health this potion can restore
   */
  public HealthPotion(int heal){
    super(0, false, true);
    this.heal = heal;
  }
  
  public void use(Character c){
    c.heal(heal);
  }
}