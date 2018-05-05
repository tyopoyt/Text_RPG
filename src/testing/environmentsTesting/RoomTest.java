package testing.environmentsTesting;

import characters.Character;
import environments.Room;
import items.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test Class for Room.
 */
public class RoomTest {

  Room room;

  @Before
  public void setUp() {
    room = new Room("A room", new Character[1], new Item[1]);
  }

  @Test
  public void testConstructors() {
    assertNotNull(room);
  }

}