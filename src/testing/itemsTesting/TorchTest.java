package testing.itemsTesting;

import items.Torch;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TorchTest {
  private Torch testTorch;

  @Before
  public void setUp() {
    testTorch = new Torch(100, "A bright Torch", 10);
  }

  @Test
  public void testLight() {
    testTorch.use();
    assertTrue(testTorch.isAlight());
  }

  @Test
  public void testExtinguish() {
    testTorch.extinguish();
    assertFalse(testTorch.isAlight());
  }

  @Test
  public void testDecreaseLife(){
    testTorch.decreaseLife();
    assertEquals(9, testTorch.getLifeRemaining());
  }
}