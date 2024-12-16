package finals_project.characters;

import finals_project.AnimatedImage;

import java.awt.Point;

public class Lapras extends AnimatedImage {
  private long startTime;
  private final int minY;
  private final int maxY;

  public Lapras(Point initialPosition, int minY, int maxY) {
    super("finals_project/images/lapras.gif", initialPosition, 0.50);
    this.minY = minY;
    this.maxY = maxY;
    this.startTime = System.currentTimeMillis();
  }

  @Override
  public void updatePosition() {
    position.x -= 3;

    long elapsedTime = System.currentTimeMillis() - startTime;
    double frequency = 0.005;
    double amplitude = (maxY - minY) / 2.0;
    double centerY = (maxY + minY) / 2.0;

    position.y = (int) (centerY + amplitude * Math.sin(frequency * elapsedTime));
  }
}