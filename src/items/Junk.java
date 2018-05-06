package items;

public class Junk extends Tool {

  public Junk(int weight, String description, String name){
    super(weight, description, name);
  }

  public void use(){
    System.out.println("It does nothing");
  }
}
