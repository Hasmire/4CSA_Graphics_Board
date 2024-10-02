package Quiz1;

import java.awt.*;
import java.awt.geom.*;

public class _3_Difference extends Frame {
  public void paint(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    BasicStroke bs = new BasicStroke(8.0f);
    g2d.setStroke(bs);
    g2d.setFont(new Font("Arial", Font.BOLD, 30));

    GeneralPath t = new GeneralPath();
    t.moveTo(100, 250);
    t.lineTo(150, 250);
    t.lineTo(150, 200);
    t.lineTo(200, 200);
    t.lineTo(200, 500);
    t.lineTo(400, 500);
    t.lineTo(400, 200);
    t.lineTo(450, 200);
    t.lineTo(450, 250);
    t.lineTo(500, 250);
    t.lineTo(500, 150);
    t.lineTo(450, 100);
    t.lineTo(150, 100);
    t.lineTo(100, 150);
    t.lineTo(100, 250);
    t.closePath();
    // g2d.setColor(Color.BLACK);
    // g2d.draw(t);

    GeneralPath boat = new GeneralPath();
    boat.moveTo(100, 350);
    boat.lineTo(150, 450);
    boat.lineTo(450, 450);
    boat.lineTo(500, 350);
    boat.lineTo(305, 350);
    boat.lineTo(290, 350);
    boat.lineTo(290, 150);
    boat.lineTo(300, 150);
    boat.lineTo(300, 200);
    boat.lineTo(400, 200);
    boat.lineTo(300, 150);
    boat.lineTo(300, 350);
    boat.closePath();
    // g2d.setColor(Color.BLACK);
    // g2d.draw(boat);

    Area tArea = new Area(t);
    Area boatArea = new Area(boat);

    // Relative Difference between T and Boat
    // tArea.subtract(boatArea);
    // g2d.setColor(Color.MAGENTA);
    // g2d.fill(tArea);

    // Symmetric Difference between T and Boat
    tArea.exclusiveOr(boatArea);
    g2d.setColor(Color.GREEN);
    g2d.fill(tArea);
  }

  public static void main(String[] args) {
    _3_Difference gp = new _3_Difference();
    gp.setTitle("Quiz1_Lagman_03");
    gp.setBackground(Color.lightGray);
    gp.setSize(600, 650);
    gp.setForeground(Color.RED);
    gp.setVisible(true);
  }
}
