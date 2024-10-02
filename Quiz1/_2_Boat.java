package Quiz1;

import java.awt.*;
import java.awt.geom.*;

public class _2_Boat extends Frame {
  public void paint(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    BasicStroke bs = new BasicStroke(8.0f);
    g2d.setStroke(bs);
    g2d.setFont(new Font("Arial", Font.BOLD, 30));
    GeneralPath t = new GeneralPath();
    t.moveTo(100, 350);
    t.lineTo(150, 450);
    t.lineTo(450, 450);
    t.lineTo(500, 350);
    t.lineTo(305, 350);
    t.lineTo(290, 350);
    t.lineTo(290, 150);
    t.lineTo(300, 150);
    t.lineTo(300, 200);
    t.lineTo(400, 200);
    t.lineTo(300, 150);
    t.lineTo(300, 350);
    t.closePath();
    g2d.setColor(Color.GREEN);
    g2d.fill(t);
  }

  public static void main(String[] args) {
    _2_Boat gp = new _2_Boat();
    gp.setTitle("Quiz1_Lagman_02");
    gp.setBackground(Color.lightGray);
    gp.setSize(600, 650);
    gp.setForeground(Color.RED);
    gp.setVisible(true);
  }
}
