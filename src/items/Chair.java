package items;

public class Chair extends Item {

  public Chair(String name, String description){
    super( name, 100, description,false, false, false);
  }

  public Torch breakDown(){
    return new Torch(5, "A torch made from dismantling a chair, not of good quality.", 2);
  }
}
