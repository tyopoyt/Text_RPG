package items;

import characters.Character;

/**
 * A class representing a health potion.
 */
public class HealthPotion extends Tool
{
  private int heal;

  /**
   * 1-arg constructor for a HealthPotion.
   *
   * @param heal the amount of health this potion can restore
   */
  public HealthPotion(int heal, String description){
    super(0, description);
    this.heal = heal;
  }

  @Override
  public void use() {

  }
}