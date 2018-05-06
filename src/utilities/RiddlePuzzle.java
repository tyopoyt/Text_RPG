package utilities;

public class RiddlePuzzle extends Puzzle{
  private Riddle riddle;
  private String[] answers;

  public RiddlePuzzle(String description, Riddle riddle){
    super(description);
  }

  @Override
  public boolean attempt(){
    return false;
  }

  @Override
  public void giveUp(){

  }
}
