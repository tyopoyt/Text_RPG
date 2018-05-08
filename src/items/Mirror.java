package items;

import characters.Player;

public class Mirror extends Item {

  public Mirror(String name, String description){
    super(name, 100, description, false, false, false);
  }

  public String lookAt(){
    return "It's you.";
  }
}
