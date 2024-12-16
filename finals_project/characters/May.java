package finals_project.characters;

import finals_project.AnimatedImage;

import java.awt.*;

public class May extends AnimatedImage {
  public May(Point initialPosition) {
    super("finals_project/images/may.gif", initialPosition, 0.40);
  }

  @Override
  public void updatePosition() {
    position.x -= 3;
  }
}
