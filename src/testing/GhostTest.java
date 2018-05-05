package testing;

import characters.Ghost;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * A class to test the Ghost class.
 */
public class GhostTest {

  private Ghost ghost;

  @Before
  public void setUp() {
    ghost = new Ghost();
  }

  @Test
  public void testConstructor() {
    assertNotNull(ghost);
  }
}