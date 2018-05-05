package testing.characterTesting;

import characters.Spartan;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;


/**
 * A class to test the Spartan class.
 */
public class SpartanTest {

  private Spartan spartan;

  @Before
  public void setUp() {
    spartan = new Spartan();
  }

  @Test
  public void testConstructor() {
    assertNotNull(spartan);
  }
}