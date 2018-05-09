package characters;

import environments.Room;
import items.Item;
import items.Shield;
import items.Sword;

import java.io.Serializable;
import java.util.Random;

/**
 * Class for representing a boss: The Lumbering Ogre!
 */
public class TheLumberingOgre extends Character implements Serializable {
  private static final Item OGRE_SWORD = new Sword(50,0,5, 70, "a massive weapon, caked in the blood of previous adventurers... or other monsters!", "Ogre Sword");
  private static final Item OGRE_SHIELD = new Shield(10,0,20,5,"a shield larger than the door you just walked through, dented and blemished, yet solid as metal.", "Ogre Shield");
  private static final Item BROKEN_OGRE_SWORD = new Sword(30,15, 0, 80, "a weapon dropped by The Lumbering Ogre, it shattered when he dropped it, yet it still packs quite a punch!", "Broken Ogre Sword");

  public TheLumberingOgre(){
    super("The Lumbering Ogre", 150, 150, 6, 12, 15, OGRE_SWORD, OGRE_SHIELD);
  }

  public void testLootDrop(Room fightRoom){
    if(new Random().nextInt(3) == 1){
      dropLoot(fightRoom);
    }
  }

  private void dropLoot(Room fightRoom){
    fightRoom.addItem(BROKEN_OGRE_SWORD);
  }
}
