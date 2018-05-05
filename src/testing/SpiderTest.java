package testing;

import characters.Spider;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * A class to test the Spider class.
 */
public class SpiderTest {

  private Spider spider;

  @Before
  public void setUp() {
    spider = new Spider();
  }

  @Test
  public void testConstructor() {
    assertNotNull(spider);
  }
}