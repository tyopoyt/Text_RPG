package testing;

import utilities.Utils;
import java.util.Random;

public class TestingDriver {
  public static void main(String[] args) {
    Utils.Race race;

    switch (new Random().nextInt(4)) {
      case 0: race = Utils.Race.OGRE; break;
      case 1: race = Utils.Race.HUMAN; break;
      case 2: race = Utils.Race.ELF; break;
      case 3: race = Utils.Race.HALFLING; break;
      default:
        race = Utils.Race.INVALID;
        System.err.println("Oopsie.");
    }

    switch (race) {
      case ELF:
        System.out.println("elf"); break;
      case HUMAN:
        System.out.println("human"); break;
      case OGRE:
        System.out.println("ogre"); break;
      case HALFLING:
        System.out.println("halfling"); break;
      default:
        System.err.println("Oopsie 2");
    }
  }
}
