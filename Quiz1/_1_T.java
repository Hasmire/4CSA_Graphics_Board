package Quiz1;

import java.awt.*;
import java.awt.geom.*;

public class _1_T extends Frame {
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

    g2d.setColor(Color.MAGENTA);
    g2d.fill(t);
  }

  public static void main(String[] args) {
    _1_T gp = new _1_T();
    gp.setTitle("Quiz1_Lagman_01");
    gp.setBackground(Color.lightGray);
    gp.setSize(600, 650);
    gp.setForeground(Color.RED);
    gp.setVisible(true);
  }
}
