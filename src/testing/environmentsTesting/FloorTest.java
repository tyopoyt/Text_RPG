package testing.environmentsTesting;

import environments.Floor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for Floor.
 */
public class FloorTest {

  Floor floor;

  @Before
  public void setUp() {
    floor = new Floor();
  }

  @Test
  public void testConstructors() {
    assertNotNull(floor);
  }
}