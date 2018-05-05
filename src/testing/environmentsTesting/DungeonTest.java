package testing.environmentsTesting;

import environments.Dungeon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for Dungeon.
 */
public class DungeonTest {

  Dungeon dungeon;

  @Before
  public void setUp() {
    dungeon = new Dungeon(10);
  }

  @Test
  public void testConstructors() {
    assertNotNull(dungeon);
  }

}