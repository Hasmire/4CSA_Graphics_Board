package finals_project;

import java.awt.*;
import java.awt.geom.AffineTransform;
import javax.swing.*;

public class AnimatedImage {
  protected Image image;
  protected Point position;
  protected double scale;

  public AnimatedImage(String imagePath, Point initialPosition, double scale) {
    this.image = new ImageIcon(imagePath).getImage();
    this.position = initialPosition;
    this.scale = scale;
  }

  public void draw(Graphics2D g2d) {
    if (image != null) {
      AffineTransform transform = new AffineTransform();
      transform.translate(position.x, position.y);
      transform.scale(scale, scale);
      g2d.drawImage(image, transform, null);
    }
  }

  public boolean isOutOfBounds() {
    return position.x + image.getWidth(null) < 0;
  }

  public void resetPosition(Point newPosition) {
    this.position = newPosition;
  }

  public void updatePosition() {
  }

  public void setStartTime(long startTime) {
  }
}