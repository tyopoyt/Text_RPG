package testing;

import characters.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * A class to test Orc class.
 */
public class OrcTest {

  private Orc orc;

  @Before
  public void setUp() {
    orc = new Orc();
  }

  @Test
  public void testConstructor() {
    assertNotNull(orc);
  }

}