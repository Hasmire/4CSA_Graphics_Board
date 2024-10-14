import java.awt.*;
import java.awt.geom.*;

public class setoperations_java extends Frame {
  public void paint(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    BasicStroke bs = new BasicStroke(8.0f);
    g2d.setStroke(bs);
    g2d.setFont(new Font("Arial", Font.BOLD, 30));

    // Draw the objects square, rectangle, ellipse and circle
    Ellipse2D.Double elli = new Ellipse2D.Double(40, 40, 400, 200);
    Ellipse2D.Double circ = new Ellipse2D.Double(80, 60, 200, 200);
    Rectangle2D.Double rect = new Rectangle2D.Double(150, 100, 200, 300);
    Rectangle2D.Double sq = new Rectangle2D.Double(100, 100, 200, 200);

    // g2d.draw(elli);
    // g2d.draw(circ);
    g2d.draw(rect);
    g2d.draw(sq);

    Area E = new Area(elli);
    Area C = new Area(circ);
    Area R = new Area(rect);
    Area S = new Area(sq);

    // E.add(S);
    g2d.setPaint(Color.YELLOW);
    // g2d.fill(E);

    // E.subtract(R);
    // g2d.fill(E);

    // R.intersect(C);
    // g2d.fill(R);

    S.exclusiveOr(R);
    g2d.fill(S);
  }

  public static void main(String[] agv) {
    setoperations_java gp = new setoperations_java();
    gp.setTitle("String and GeomImages in Java");
    gp.setBackground(Color.LIGHT_GRAY);
    gp.setSize(800, 800);
    gp.setForeground(Color.RED);
    gp.setVisible(true);

  }
}
