package testing.characterTesting;

import characters.Zombie;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

/**
 * A class to test the Zombie class.
 */
public class ZombieTest {

  private Zombie zombie;

  @Before
  public void setUp() {
    zombie = new Zombie();
  }

  @Test
  public void testConstructor() {
    assertNotNull(zombie);
  }
}