package characters;

import items.Item;
import utilities.Utils;

/**
 * The player character.
 */
public class Player extends Character {

  private Utils.Race race;

  /**
   * Constructor for player character
   */
  public Player(String name, Utils.Race race) {
    super(name, 100, 100, 0, 10, 60, null, null);
    this.race = race;
    switch(race){
      case OGRE: {
        setMaxHealth(150);
        heal(getMaxHealth() - getHealth());
        setSpeed(50);
        break;
      } case ELF: {
        setMaxHealth(125);
        heal(getMaxHealth() - getHealth());
        setSpeed(75);
      } case HUMAN: {
        break;
      } case HALFLING: {
        setMaxHealth(75);
        takeDamage(Math.abs(getMaxHealth() - getHealth()));
        setSpeed(90);
      }
    }
  }

  /**
   * Interact with an Item.
   *
   * @param item the Item to interact with
   */
  public void interact(Item item) {

  }

  /**
   * Move to a new room.
   *
   * @param direction the direction in which to move
   */
  public void move(int direction) {

  }

  public String checkInventory() {
    StringBuilder sb = new StringBuilder();
    sb.append("-- Equipped: \n");
    for (Item curItem : checkEquipped()) {
      if(curItem != null) {
        sb.append(curItem.toString()).append("\n");
      } else {
        sb.append("Empty \n");
      }
    }
    sb.append("-- Inventory: \n");
    sb.append(getInventory().toString());
    return sb.toString();
  }
}
