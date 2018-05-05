package testing.characterTesting;

import characters.WanderingSpectre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * A class to test the Spider class.
 */
public class WanderingSpectreTest {

  private WanderingSpectre wanderingSpectre;

  @Before
  public void setUp() {
    wanderingSpectre = new WanderingSpectre();
  }

  @Test
  public void testConstructor() {
    assertNotNull(wanderingSpectre);
  }

}