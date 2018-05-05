package items;

//SHIELD CLASS
public class Shield extends Weapon
{
  
  public Shield(int damage, int weight, int defense, int acc){
    super(weight, damage, defense, acc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("A ").append(getDefense()).append("-defense shield");
    return sb.toString();
  }
}