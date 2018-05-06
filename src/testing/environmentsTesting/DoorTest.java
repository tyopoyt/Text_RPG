package testing.environmentsTesting;

import environments.Door;
import items.Key;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * A class to test Door.
 */
public class DoorTest {

  @Test
  public void testUnlock() {
    Key key = new Key(1, "A test key.","key");
    Key anotherKey = new Key(1, "The wrong key.","key");
    Door door = new Door(key);

    assertFalse(door.unlock(anotherKey));
    assertTrue(door.unlock(key));
  }

  @Test
  public void testIsLocked() {
    Key key = new Key(1, "A test key.","key");
    Door door = new Door(key);

    assertTrue(door.isLocked());
    door.unlock(key);
    assertFalse(door.isLocked());
  }
}