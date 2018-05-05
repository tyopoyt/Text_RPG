package utilities;

public class RiddlePuzzle extends Puzzle{
  private String riddle;
  private String[] answers;

  public RiddlePuzzle(String description,String riddle, String[] answers){
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
