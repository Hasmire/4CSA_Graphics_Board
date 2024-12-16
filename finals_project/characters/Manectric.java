package finals_project.characters;

import finals_project.AnimatedImage;

import java.awt.Point;

public class Manectric extends AnimatedImage {
  private long startTime;
  private int speed = 2;

  public Manectric(Point initialPosition) {
    super("finals_project/images/manectric.gif", initialPosition, 0.40);
    this.startTime = System.currentTimeMillis();
  }

  @Override
  public void updatePosition() {
    long elapsedTime = System.currentTimeMillis() - startTime;
    speed = Math.min(10, 2 + (int) (elapsedTime / 1000));
    position.x -= speed;
  }
}