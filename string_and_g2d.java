import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color; // Add this line to import the Color class
import java.awt.Font; // Add this line to import the Font class
import java.awt.geom.*; // Add this line to import the Line2D class
import javax.swing.JFrame;
import javax.swing.JPanel;

public class string_and_g2d extends JFrame {
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke(8.0f);
        g2d.setStroke(bs);

        // Drawing the String Java
        g2d.setFont(new Font("Arial", Font.BOLD, 30));
        g2d.drawString("Welcome 4CSA in Graphics using Java!", 50, 70);

        // Drawing the line/s
        Line2D.Double line1 = new Line2D.Double(50, 80, 250, 300);
        g2d.draw(line1);

        // Drawing the Quadratic Curve
        QuadCurve2D.Double quad1 = new QuadCurve2D.Double(50, 80, 30, 200, 250, 300);
        g2d.draw(quad1);

        // Drawing Cubic Curve
        CubicCurve2D.Double cubic1 = new CubicCurve2D.Double(50, 80, 150, 60, 320, 280, 250, 300);
        g2d.setPaint(Color.BLUE);
        g2d.draw(cubic1);

        // Drawing Rectangle
        Rectangle2D.Double rect1 = new Rectangle2D.Double(270, 310, 200, 250);
        g2d.setPaint(Color.CYAN);
        g2d.draw(rect1);
        g2d.setPaint(Color.MAGENTA);
        g2d.fill(rect1);

        // Drawing the Circle
        Ellipse2D.Double circle = new Ellipse2D.Double(120 - 70, 400 - 70, 140, 140);
        g2d.setPaint(Color.GREEN); // Set the color for the circle
        g2d.draw(circle); // Draw the circle outline
        g2d.fill(circle); // Fill the circle with the current color

        // Drawing another Ellipse
        Ellipse2D.Double ellipse = new Ellipse2D.Double(250, 75, 200, 150);
        g2d.setPaint(Color.YELLOW); // Set the color for the ellipse
        g2d.draw(ellipse); // Draw the ellipse outline
        g2d.fill(ellipse); // Fill the ellipse with the current color

        // Drawing an Arc. An arc is an open mark from bounding rectangle (50, 48, 250,
        // 200).
        Rectangle2D.Double bound_rect = new Rectangle2D.Double(50, 480, 250, 200);
        Arc2D.Double arc_open = new Arc2D.Double(bound_rect, 20, 45, Arc2D.OPEN);
        g2d.setPaint(Color.red);
        g2d.draw(arc_open);

        // Drawing an Arc
        Arc2D.Double arc = new Arc2D.Double(bound_rect, 70, 60, Arc2D.CHORD);
        g2d.setPaint(Color.pink);
        g2d.fill(arc);

        // Drawing an Arc as a Pie
        Arc2D.Double arc_pie = new Arc2D.Double(bound_rect, 150, 120, Arc2D.PIE);
        g2d.setPaint(Color.black);
        g2d.fill(arc_pie);
    }

    public static void main(String[] args) {
        string_and_g2d s = new string_and_g2d();
        s.setTitle("String and GeomImages in Java");
        s.setBackground(Color.RED);
        s.setSize(500, 500);
        s.setForeground(Color.RED);
        s.setVisible(true);
    }
}
