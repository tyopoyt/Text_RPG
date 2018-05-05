package testing.characterTesting;

import characters.Bandit;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;


/**
 * A class to test the Bandit class.
 */
public class BanditTest {
  private Bandit bandit;
  private Bandit enemyBandit;

  @Before
  public void setUp() {
    bandit = new Bandit();
    enemyBandit = new Bandit();
  }

  @Test
  public void testConstructor() {
    assertNotNull(bandit);
  }

  @Test
  public void testDodge(){
    assertNotNull(bandit.dodge(enemyBandit));
  }

  @Test
  public void testAttack(){
    enemyBandit.takeDamage(enemyBandit.block(bandit.attack()));
    assertEquals(55 , enemyBandit.getHealth());
  }

}