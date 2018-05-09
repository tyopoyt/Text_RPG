package items;

import java.io.Serializable;

public class Junk extends Tool implements Serializable {

  public Junk(int weight, String description, String name){
    super(weight, description, name);
  }

  public void use(){
    System.out.println("It does nothing");
  }
}
