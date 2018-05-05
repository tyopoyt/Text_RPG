package testing;

import characters.Slime;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * A class to test the Slime class.
 */
public class SlimeTest {

  private Slime slime;

  @Before
  public void setUp() {
    slime = new Slime();
  }

  @Test
  public void testConstructor() {
    assertNotNull(slime);
  }

}