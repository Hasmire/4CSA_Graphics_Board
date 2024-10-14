package mp2;

import java.awt.*;
import java.awt.geom.*;

public class _01_Cross extends Frame {
  public void paint(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    BasicStroke bs = new BasicStroke(8.0f);
    g2d.setStroke(bs);
    g2d.setFont(new Font("Arial", Font.BOLD, 30));

    // Top Lines and QuadCurve
    Line2D.Double top1 = new Line2D.Double(250, 280, 250, 180);
    QuadCurve2D.Double topQuad1 = new QuadCurve2D.Double(250, 180, 290, 140, 330, 180);
    Line2D.Double top2 = new Line2D.Double(330, 180, 330, 280);
    g2d.draw(top1);
    g2d.draw(topQuad1);
    g2d.draw(top2);

    // Right Lines and QuadCurve
    Line2D.Double right1 = new Line2D.Double(330, 280, 430, 280);
    QuadCurve2D.Double rightQuad1 = new QuadCurve2D.Double(430, 280, 470, 320, 430, 360);
    Line2D.Double right2 = new Line2D.Double(430, 360, 330, 360);
    g2d.draw(right1);
    g2d.draw(rightQuad1);
    g2d.draw(right2);

    // Bottom Lines and QuadCurve
    Line2D.Double bottom1 = new Line2D.Double(330, 360, 330, 460);
    QuadCurve2D.Double bottomQuad1 = new QuadCurve2D.Double(330, 460, 290, 500, 250, 460);
    Line2D.Double bottom2 = new Line2D.Double(250, 460, 250, 360);
    g2d.draw(bottom1);
    g2d.draw(bottomQuad1);
    g2d.draw(bottom2);

    // Left Lines and QuadCurve
    Line2D.Double left1 = new Line2D.Double(250, 360, 150, 360);
    QuadCurve2D.Double leftQuad1 = new QuadCurve2D.Double(150, 360, 110, 320, 150, 280);
    Line2D.Double left2 = new Line2D.Double(150, 280, 250, 280);
    g2d.draw(left1);
    g2d.draw(leftQuad1);
    g2d.draw(left2);
  }

  public static void main(String[] agv) {
    _01_Cross gp = new _01_Cross();
    gp.setTitle("MP2_Lagman_01");
    gp.setBackground(Color.LIGHT_GRAY);
    gp.setSize(600, 650);
    gp.setForeground(Color.RED);
    gp.setVisible(true);

  }
}
