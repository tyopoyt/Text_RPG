package characters;

import environments.Room;
import items.Item;
import items.Weapon;
import utilities.Inventory;

import java.io.Serializable;
import java.util.Iterator;

/**
 * Class for character, Player or NPC.
 */
public class Character implements Serializable {
  private String name;
  private int health;
  private int maxHealth;
  private int level;
  private int experience;
  private Inventory inventory;
  private Inventory equipped;
  private int speed;
  private boolean alive;

  /**
   * A constructor for a character.
   *
   * @param name          the name of the character
   * @param health        the base health
   * @param maxHealth     the maximum health
   * @param level         the level of the character
   * @param inventorySize the inventory size of the character
   * @param speed         the speed of the character
   * @param leftItem      the item to be equipped in the left hand
   * @param rightItem     the item to be equipped in the right hand
   */
  public Character(String name, int health, int maxHealth, int level, int inventorySize, int speed,
                   Item leftItem, Item rightItem) {
    this.name = name;
    this.health = health;
    this.maxHealth = maxHealth;
    this.level = level;
    this.experience = 0;
    inventory = new Inventory(inventorySize);
    equipped = new Inventory(2);
    this.speed = speed;
    alive = true;
    equipMain(leftItem);
    equipSecondary(rightItem);

  }

  //GETTERS

  /**
   * Accessor for name.
   *
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Accessor for health.
   *
   * @return health
   */
  public int getHealth() {
    return health;
  }

  /**
   * Accessor for maxHealth.
   *
   * @return maxHealth
   */
  public int getMaxHealth() {
    return maxHealth;
  }

  /**
   * Sets maxHealth, (to only be called in player constructor due to race change).
   *
   * @param maxHealth the new maxHealth of the player
   */
  public void setMaxHealth(int maxHealth){ this.maxHealth = maxHealth; }

  /**
   * Accessor for Level.
   *
   * @return level
   */
  public int getLevel() {
    return level;
  }

  /**
   * Accessor for experience.
   *
   * @return experience
   */
  public int getExperience() {
    return experience;
  }

  /**
   * Accessor for inventory.
   *
   * @return inventory
   */
  public Inventory getInventory() {
    return inventory;
  }

  /**
   * Accessor for speed.
   *
   * @return speed
   */
  public int getSpeed() {
    return speed;
  }

  /**
   * Setter for speed. (to only be called in player constructor due to race change)
   *
   * @param speed the desired speed of the character.
   */
  public void setSpeed(int speed){ this.speed = speed; }

  public boolean isAlive(){ return alive; }

  // Experience Methods

  /**
   * Player earns experience.
   *
   * @param exp the amount of experience earned
   */
  public void earnExp(int exp) {
    experience += exp;
  }

  //TODO: implement level cap and Experience system

  /**
   * Level of character increases.
   */
  public void levelUp() {
    level += 1;
    experience = 0;
  }

  /**
   * Player takes damage.
   *
   * @param damage the amount of damage the player takes
   */
  public void takeDamage(int damage) {
    health -= damage;
    if (health <= 0) {
      die();
    }
  }

  /**
   * Die.
   */
  private void die() {
    alive = false;
  }

  /**
   * Player heals.
   *
   * @param points the amount of healing
   */
  public void heal(int points) {
    health += points;
    if (health > maxHealth)
      health = maxHealth;
  }

  // CHARACTER PICKUP AND DROP METHODS

  /**
   * Adds item to player's inventory.
   *
   * @param obj item added
   */
  public void pickUp(Item obj) {
    //TODO: return boolean
    if(obj.isStoreable()) {
      inventory.addItem(obj);
    } else {
      //TODO: ERROR MESSAGE???
    }
  }

  /**
   * Removes item from player's inventory.
   *
   * @param index index of the item to be dropped
   * @param curRoom the current room
   */
  public void drop(int index, Room curRoom) {
    inventory.dropItem(index, curRoom);
  }

  // EQUPPING WEAPONS OR SHIELDS

  /**
   * Equips item to players hands.
   *
   * @param item item to be equipped
   */
  public void equipMain(Item item) {
    equipped.addItem(item);
  }

  /**
   * Returns the item that is equipped.
   *
   * @param hand the hand whose item we are querying
   * @return item in hand
   */
  public Item getEquippedItem(int hand) {
    return equipped.contents()[hand];
  }

  /**
   * Equips item to player's offhand.
   *
   * @param item item to be equipped
   */
  public void equipSecondary(Item item) {
    equipped.addItem(item);
  }

  /**
   * Checks what is equipped.
   *
   * @return list of items equipped
   */
  public Item[] checkEquipped() {
    return equipped.contents();
  }

  // DODGE

  /**
   * Character moves to dodge attack.
   *
   * @param player player doing the dodging
   * @return the success of the dodge
   */
  public boolean dodge(Character player) {
    boolean success = false;
    if (player.getEquippedItem(1).isWeapon()) {
      Weapon current = (Weapon) (player.getEquippedItem(1));
      if (((int)(Math.random()*101)) <= current.getAccuracy() && current.getAccuracy() >= getSpeed()) {
        success = false;
      } else {
        success = (int) (Math.random() * 3) < 3;
      }
    }
    return success;
  }

  // ATTACK AND BLOCK METHODS

  /**
   * Character attacks.
   *
   * @return raw damage done
   */
  public int attack() {
    int damage = 0;
    Item curItem;
    Iterator<Item> iter = equipped.iterator();
    while (iter.hasNext()) {
      curItem = iter.next();
      if (curItem.isWeapon()) {
        damage += ((Weapon) curItem).strike();
      }
    }
    return damage;
  }

  /**
   * Character Blocks.
   *
   * @param incomingDamage damage that is
   * @return damage that the character should take
   */
  public int defend(int incomingDamage) {
    int damage = incomingDamage;
    Item curItem;
    Iterator<Item> iter = equipped.iterator();
    while (iter.hasNext()) {
      curItem = iter.next();
      if (curItem.isWeapon()) {
        damage -= ((Weapon) curItem).getDefense();
      }
    }
    return Math.max(damage, 0);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("--Name: ");
    sb.append(name).append("\n------ Stats ------\n--Health: ").append(health).append("\n--Speed: ");
    sb.append(speed).append("\n--Level: ").append(level).append("\n--Inventory: \n").append(inventory.toString());
    sb.append("--Equipped: \n").append(equipped.toString());
    return sb.toString();
  }
}