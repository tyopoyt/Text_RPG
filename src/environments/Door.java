package environments;

import items.Key;

import java.io.Serializable;

public class Door implements Serializable {
  private Key key;
  private boolean isLocked;
  private final String DESCRIPTION;

  /**
   * 1-arg constructor for a Door.
   *
   * @param key the key that unlocks this door
   * @param description the description of the door
   */
  public Door(Key key, String description) {
    this.key = key;
    isLocked = true;
    DESCRIPTION = description;
  }

  /**
   * Attempt to unlock the door.
   *
   * @param key the key we are attempting to unlock with
   * @return whether the door was successfully unlocked
   */
  public boolean unlock(Key key) {
    boolean success = this.key == key;

    isLocked = !success;

    return success;
  }

  /**
   * Check if the door is locked.
   *
   * @return isLocked
   */
  public boolean isLocked() {
    return isLocked;
  }

  /**
   * Method to examine the door (serves as an accessor).
   *
   * @return description of the door
   */
  public String examine(){
    StringBuilder sb = new StringBuilder();
    sb.append(DESCRIPTION);
    if(isLocked()){
      sb.append(" The door is currently locked.");
    }else{
      sb.append(" The door is currently unlocked.");
    }
    return sb.toString();
  }
}
