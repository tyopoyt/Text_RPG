package testing.characterTesting;

import characters.Bandit;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;


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
    assertTrue(bandit.dodge(enemyBandit));
  }

  @Test
  public void testAttack(){
    assertEquals(30 , bandit.attack());
  }

  @Test
  public void testInteraction(){
    enemyBandit.takeDamage(enemyBandit.defend(bandit.attack()));
    assertEquals(55, enemyBandit.getHealth());
  }

}