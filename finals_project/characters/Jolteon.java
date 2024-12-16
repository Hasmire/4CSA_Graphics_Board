package finals_project.characters;

import finals_project.AnimatedImage;

import java.awt.Point;

public class Jolteon extends AnimatedImage {
  private long startTime;

  public Jolteon(Point initialPosition) {
    super("finals_project/images/jolteon.gif", initialPosition, 0.80);
    this.startTime = System.currentTimeMillis();
  }

  @Override
  public void updatePosition() {
    long elapsedTime = System.currentTimeMillis() - startTime;

    if (elapsedTime < 2000) {
      position.translate(-3, -3);
    } else if (elapsedTime < 4000) {
      position.translate(-3, 3);
    } else {
      startTime = System.currentTimeMillis();
    }
  }
}
