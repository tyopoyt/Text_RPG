package testing.characterTesting;

import characters.Bandit;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;


/**
 * A class to test the Bandit class.
 */
public class BanditTest {
  private Bandit bandit;

  @Before
  public void setUp() {
    bandit = new Bandit();
  }

  @Test
  public void testConstructor() {
    bandit.toString();
  }
}