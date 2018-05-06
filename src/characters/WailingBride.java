package characters;

import environments.Room;
import items.*;

import java.util.Random;

public class WailingBride extends Character {
  private final static Item METAL_BOUQUET = new Sword(20,5,15,90,"a wilted bouquet of roses. Upon closer inspection, the roses are made of metal, thorny, vile, and are about a meter long!", "Metal Bouquet");
  private final static Item SHADOWY_VEIL = new Shield(5, 12,20,50,"a shield in the shape of a bride's veil, around it swirl the bride's screams of damnation.", "Shadowy Veil");
  private final static Item PILE_OF_ASHES = new Junk(2,"a pile of heavy ashes left after a grieving bride,", "Pile of ashes");

  public WailingBride() {
    super("The Wailing Bride",125,125,8, 2, 90, METAL_BOUQUET, SHADOWY_VEIL);
  }

  public void testLootDrop(Room fightRoom){
    if(new Random().nextInt(3) == 1){
      dropLoot(fightRoom);
    } else {
      fightRoom.addItem(PILE_OF_ASHES);
    }
  }

  private void dropLoot(Room fightRoom){
    fightRoom.addItem(SHADOWY_VEIL);
  }
}
