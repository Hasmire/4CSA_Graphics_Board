package finals_project.characters;

import finals_project.AnimatedImage;

import java.awt.Point;

public class Pikachu extends AnimatedImage {
  private long lastJumpTime;
  private final int minY;
  private final int maxY;

  public Pikachu(Point initialPosition, int minY, int maxY) {
    super("finals_project/images/pikachu.gif", initialPosition, 0.20);
    this.minY = minY;
    this.maxY = maxY;
    this.lastJumpTime = System.currentTimeMillis();
  }

  @Override
  public void updatePosition() {
    long currentTime = System.currentTimeMillis();

    if (currentTime - lastJumpTime > 1000 && Math.random() > 0.7) {
      lastJumpTime = currentTime;
      int deltaX = -20;
      int deltaY = (Math.random() > 0.5 ? 1 : -1) * 60;
      position.translate(deltaX, deltaY);
    } else {
      position.x -= 4;
    }

    if (position.y < minY || position.y > maxY) {
      position.y = minY + (int) (Math.random() * (maxY - minY));
    }
  }
}
