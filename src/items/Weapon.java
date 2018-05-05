package items;

//Weapon Parent Class
public abstract class Weapon extends Item {
  private int damage;
  private int defense; //FOR ShieldS, SHIELD WILL COUNT AS WEAPON
  private int accuracy;

  /**
   * Constructor for Weapon class.
   *
   * @param weight weight of the weapon
   * @param damage damage the weapon deals on a successful strike
   * @param defense defense points the weapon can block
   * @param accuracy the accuracy of the weapon
   */
  public Weapon(int weight, int damage, int defense, int accuracy){
    super(weight, true);
    this.damage = damage;
    this.defense = defense;
    this.accuracy = accuracy;
  }
  
  //GETTERS
  
  public int getDamage(){
    return damage;
  }
  
  public int getDefense(){
    return defense;
  }
  
  public int getAccuracy(){
    return accuracy;
  }


  // ATTACK AND DEFEND METHODS

  /**
   * Player strikes using weapons that are equipped.
   *
   * @return damage done
   */
  public int strike(){
    boolean hit = ((int)(Math.random()*100)) <= getAccuracy();

    if(hit) {
      return getDamage();
    } else {
      return 0;
    }
  }

  /**
   * Player blocks using the weapons that are equipped.
   *
   * @param incomingDamage the damage that is incoming to the character
   * @return the damage the character should take
   */
  public int block(int incomingDamage){
    if(getDefense() >= incomingDamage)
      damage = 0;
    else
      damage = incomingDamage - getDefense();
    return damage;
  }
}