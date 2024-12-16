package finals_project;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Background {
  private BufferedImage image;
  private Point offset;

  public Background(String imagePath) {
    this.image = loadBufferedImage(imagePath);
    this.offset = new Point(0, 0);
  }

  private BufferedImage loadBufferedImage(String path) {
    try {
      return ImageIO.read(new File(path));
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }

  public void updateOffset(int speed) {
    if (image != null) {
      offset.x = (offset.x + speed) % image.getWidth();
    }
  }

  public void draw(Graphics2D g2d, int panelWidth, int panelHeight) {
    if (image != null) {
      int imageWidth = image.getWidth();
      for (int x = -imageWidth + offset.x; x < panelWidth; x += imageWidth) {
        g2d.drawImage(image, x, offset.y, null);
      }
    }
  }

  public int getHeight() {
    return image != null ? image.getHeight() : 0;
  }

  public void setOffsetY(int y) {
    offset.y = y;
  }
}