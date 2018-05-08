package testing.itemsTesting;

import items.Item;
import items.Sword;
import items.Table;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TableTest {
  private Table table;
  private Item sword1;

  @Before
  public void setUp(){
    table = new Table("A test table", "An old decrepit test table.", 2);
    sword1 = new Sword(15,5,7,80, "DUMMY SWORD DESC.", "DUMMY SWORD");
    table.getTableTop().addItem(sword1);
  }


  @Test
  public void testExamine() {
    System.out.println(table.examine());
  }

  @Test
  public void testExamineTableTopItem() {
    System.out.println(table.examineTableTopItem("DUMMY SWORD"));
  }
}