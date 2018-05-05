package testing.characterTesting;

import characters.Skeleton;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * A class to test the Skeleton class.
 */
public class SkeletonTest {

  private Skeleton skeleton;

  @Before
  public void setUp() {
    skeleton = new Skeleton();
  }

  @Test
  public void testConstructor() {
    assertNotNull(skeleton);
  }

}