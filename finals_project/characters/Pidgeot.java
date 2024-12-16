package finals_project.characters;

import finals_project.AnimatedImage;

import java.awt.Point;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class Pidgeot extends AnimatedImage {
  private boolean isFlipped = false;
  private long startTime;

  public Pidgeot(Point initialPosition) {
    super("finals_project/images/pidgeot.gif", initialPosition, 0.70);
    this.startTime = System.currentTimeMillis();
  }

  @Override
  public void updatePosition() {
    long elapsedTime = System.currentTimeMillis() - startTime;

    if (elapsedTime < 5000) {
      position.x -= 37;
      isFlipped = false;
    } else if (elapsedTime < 9500) {
      position.x += 15;
      isFlipped = true;
    } else {
      position.x -= 3;
      isFlipped = false;
    }
  }

  @Override
  public void draw(Graphics2D g2d) {
    if (image != null) {
      AffineTransform transform = new AffineTransform();
      transform.translate(position.x, position.y);
      transform.scale(scale, scale);

      if (isFlipped) {
        transform.scale(-1, 1);
        transform.translate(-image.getWidth(null), 0);
      }

      g2d.drawImage(image, transform, null);
    }
  }

  @Override
  public void setStartTime(long startTime) {
    this.startTime = startTime;
  }
}