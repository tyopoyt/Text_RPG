import characters.*;
import characters.Character;
import environments.BeginningRoom;
import environments.BossRoom;
import environments.Door;
import items.*;
import utilities.Utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestingDriver {
  public static void main(String[] args) {

    Item[] items = {new Table("Torture Table", "A bloodied table.", 10)};

    BeginningRoom beginningTortureRoom = new BeginningRoom("You jolt awake, as if you had " +
            "been stabbed. Nothing around you is familiar, you sit in an uncomfortable wooden chair" +
            " and the room around you is overgrown with vines and small plants. The walls are cracked" +
            " and overgrown but under the vines you see that they are made of chisled stone. Above you " +
            "is a low ceiling with a single circular hole, directly above the chair. As you look into" +
            " the hole you see that it leads to the surface, but its extremely long... you are very " +
            "deep underground. The chair you sit upon holds you to it by old, worn leather straps. You" +
            " struggle against the leather straps until they snap, unfortunately, so does the chair. The" +
            " small room fills with sound as the chair violently snaps and crumbles, leaving you to fall" +
            " to the hard, wooden planked, ground. Thankfully, you dont sustain any serious injuries and" +
            " are able to stand and look around. In the corner of the room sits an unlit torch and a tinderbox." +
            " You take the torch and strike it alight, upon doing so the walls of the room move, you realize" +
            " that the walls were covered in roaches and biters, all of which scurry up that hole in the ceiling." +
            " You place the torch in a wall mount and turn to face the door infront of you, it is metal. You slam" +
            " yourself against it in an attempt to open it, it wont budge... Youll have to find the key! You turn" +
            " away from the door to see a small table in the back of the room, caked in dried blood and hair...",
            items, null);

    File file = new File("src\\resources\\beginningTortureRoom.rm");

    try {
      FileOutputStream out = new FileOutputStream(file);
      ObjectOutputStream objOut = new ObjectOutputStream(out);
      objOut.writeObject(beginningTortureRoom);

    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
