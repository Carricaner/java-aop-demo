package org.example;

import org.example.aop.Secured;

public class SecuredMethod {

  @Secured(isLocked = true)
  public void lockedMethod() {
    System.out.println("lockMethod");
  }

  @Secured(isLocked = false)
  public void unlockedMethod() {
    System.out.println("unlockMethod");
  }
}
