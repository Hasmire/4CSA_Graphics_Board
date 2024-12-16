package finals_project.characters;

import finals_project.AnimatedImage;

import java.awt.Point;

public class Pidgey extends AnimatedImage {
  public Pidgey(Point initialPosition) {
    super("finals_project/images/pidgey.gif", initialPosition, 0.40);
  }

  @Override
  public void updatePosition() {
    int deltaX = (Math.random() > 0.80 ? 1 : -1) * 5;
    int deltaY = (Math.random() > 0.5 ? 1 : -1) * 2;
    position.translate(deltaX, deltaY);
  }
}