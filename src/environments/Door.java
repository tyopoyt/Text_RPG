package environments;

import items.Key;

public class Door {
  private Key key;
  private boolean isLocked;

  /**
   * 1-arg constructor for a Door.
   *
   * @param key the key that unlocks this door
   */
  public Door(Key key) {
    this.key = key;
    isLocked = true;
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
}
