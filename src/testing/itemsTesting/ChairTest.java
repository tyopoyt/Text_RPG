package testing.itemsTesting;

import items.Chair;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChairTest {

  private Chair testChair;

  @Before
  public void setUp(){
    testChair  = new Chair( "A Chair", "A wooden chair");
  }

  @Test
  public void testBreakDown() {
    System.out.println(testChair.breakDown().toString());
  }
}