package items;

//items.Sword Class
public class Sword extends Weapon{
  
  public Sword(int damage, int weight, int defense, int acc){
    super(weight, damage, defense, acc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("A ").append(getDamage()).append("-damage sword");
    return sb.toString();
  }
}