package items;

import characters.Character;

/**
 * A class representing a health potion.
 */
public class HealthPotion extends Tool
{
  private int heal;

  /**
   * 2-arg constructor for a HealthPotion.
   *
   * @param description description of the health potion
   * @param heal the amount of health this potion can restore
   */
  public HealthPotion(int heal, String description){
    super(0, description);
    this.heal = heal;
  }

  @Override
  public void light() {

  }
}