package MP1;

import java.awt.*;
import java.awt.geom.*;

public class MP1_Lagman extends Frame {
  @Override
  public void paint(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;

    float strokeWidth = 5.0f;
    g2d.setStroke(new BasicStroke(strokeWidth));

    // Line (BLACK)
    g2d.setColor(Color.BLACK);
    g2d.draw(new Line2D.Float(50, 475, 500, 125));
    g2d.draw(new Line2D.Float(500, 125, 300, 300));
    g2d.draw(new Line2D.Float(300, 300, 450, 500));
    g2d.draw(new Line2D.Float(450, 500, 200, 375));
    g2d.draw(new Line2D.Float(200, 375, 50, 475));

    // Quadratic Curve (GREEN)
    g2d.setColor(Color.GREEN);
    QuadCurve2D q = new QuadCurve2D.Float();
    q.setCurve(175, 500, 200, 300, 400, 550);
    g2d.draw(q);

    // Cubic Bezier Curve (BLUE)
    g2d.setColor(Color.BLUE);
    CubicCurve2D c = new CubicCurve2D.Float();
    c.setCurve(375, 300, 450, 550, 550, 450, 575, 350);
    g2d.draw(c);

    // Rectangle (RED)
    g2d.setColor(Color.RED);
    g2d.drawRect(100, 100, 150, 200);

    // Ellipse (YELLOW)
    g2d.setColor(Color.YELLOW);
    int centerX = 100;
    int centerY = 90;
    int horizontalRadius = (int) Math.sqrt(400);
    int verticalRadius = (int) Math.sqrt(900);
    g2d.drawOval(centerX - horizontalRadius, centerY - verticalRadius,
        2 * horizontalRadius, 2 * verticalRadius);

    // Arc (ORANGE)
    g2d.setColor(Color.ORANGE);
    g2d.drawArc(300, 50, 100, 75, 15, 75);
    Rectangle2D.Double bound_rect = new Rectangle2D.Double(300, 50, 100, 75);
    Arc2D.Double arc_open = new Arc2D.Double(bound_rect, 15, 75, Arc2D.PIE);
    g2d.setPaint(Color.ORANGE);
    g2d.draw(arc_open);

    // Labels (BLACK)
    g2d.setColor(Color.BLACK);
    g2d.drawString("JR Gregg Victor M. Lagman", 20, 50);
    g2d.drawString("4CSA", 200, 50);
    g2d.drawString("Line", 460, 520);
    g2d.drawString("QuadCurve", 230, 470);
    g2d.drawString("CubicCurve", 450, 400);
    g2d.drawString("Rectangle", 140, 320);
    g2d.drawString("Ellipse", 40, 80);
    g2d.drawString("Arc", 320, 90);
  }

  public static void main(String[] args) {
    MP1_Lagman s = new MP1_Lagman();
    s.setTitle("MP1_4CSA_Lagman_Java");
    s.setBackground(Color.lightGray);
    s.setSize(600, 600);
    s.setForeground(Color.red);
    s.setVisible(true);
  }
}