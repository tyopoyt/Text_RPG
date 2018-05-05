package testing;

import characters.LostSoul;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * A class to test LostSoul class.
 */
public class LostSoulTest {

  private LostSoul lostSoul;

  @Before
  public void setUp() {
    lostSoul = new LostSoul();
  }

  @Test
  public void testConstructor() {
    assertNotNull(lostSoul);
  }
}