package characters;

import environments.Room;
import items.BattleAxe;
import items.HealthPotion;
import items.Item;

import java.io.Serializable;
import java.util.Random;

public class TheLostBarbarian extends Character implements Serializable {
  private final static Item THE_VIKING = new BattleAxe(40,20,10,75,"An old viking battleaxe, sturdy but slow/inaccurate!", "The Viking");
  private final static Item THE_VIKING_BETA = new BattleAxe(25,15,10,65,"Battleaxe dropped by the Lost Barbarian, when its master died, it reverted to its earthly form.", "The Vikings Curse");
  private final static Item HEALTH_POTION = new HealthPotion(30, "A dark red liquid rolls around in the glass vial, this potion will heal for 30 points.");

  public TheLostBarbarian(){
    super("The Lost Barbarian", 175, 175, 10, 2, 90, THE_VIKING, null);
  }

  public void dropLoot(Room fightRoom){
    if(new Random().nextInt(3) == 1){
      fightRoom.addItem(THE_VIKING_BETA);
    } else {
      fightRoom.addItem(HEALTH_POTION);
    }
  }
}
