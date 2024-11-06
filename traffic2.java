import java.awt.*;
import java.awt.geom.*;
import java.util.Date;

public class traffic2 extends Frame {
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(3.0f));
        Rectangle2D.Double leftstoplight = new Rectangle2D.Double(50, 100, 120, 300);
        g2d.draw(leftstoplight);

        Rectangle2D.Double rightstoplight = new Rectangle2D.Double(250, 100, 120, 300);
        g2d.draw(rightstoplight);

        Ellipse2D.Double leftred = new Ellipse2D.Double(80, 110, 60, 60);
        g2d.draw(leftred);
        g2d.fill(leftred);
        Ellipse2D.Double leftyellow = new Ellipse2D.Double(80, 210, 60, 60);
        g2d.draw(leftyellow);
        g2d.fill(leftyellow);

        Ellipse2D.Double leftgreen = new Ellipse2D.Double(80, 310, 60, 60);
        g2d.draw(leftgreen);
        g2d.fill(leftgreen);

        Ellipse2D.Double rightred = new Ellipse2D.Double(280, 110, 60, 60);
        g2d.draw(rightred);
        g2d.fill(rightred);
        Ellipse2D.Double rightyellow = new Ellipse2D.Double(280, 210, 60, 60);
        g2d.draw(rightyellow);
        g2d.fill(rightyellow);

        Ellipse2D.Double rightgreen = new Ellipse2D.Double(280, 310, 60, 60);
        g2d.draw(rightgreen);
        g2d.fill(rightgreen);
        for (int x = 0; x < 90; x++) {
            g2d.setColor(Color.red);
            g2d.fill(rightred);
            g2d.setColor(Color.green);
            g2d.fill(leftgreen);
            g2d.setColor(Color.black);
            g2d.fill(leftyellow);
            g2d.fill(rightgreen);
            g2d.fill(rightyellow);
            sustain(5000);

            g2d.setColor(Color.yellow);
            g2d.fill(rightyellow);
            g2d.fill(leftyellow);
            g2d.setColor(Color.black);
            g2d.fill(rightgreen);
            g2d.fill(leftgreen);
            g2d.fill(rightred);
            sustain(2500);

            g2d.setColor(Color.red);
            g2d.fill(leftred);
            g2d.setColor(Color.green);
            g2d.fill(rightgreen);
            g2d.setColor(Color.black);
            g2d.fill(leftyellow);
            g2d.fill(leftgreen);
            g2d.fill(rightred);
            g2d.fill(rightyellow);
            sustain(5000);

            g2d.setColor(Color.yellow);
            g2d.fill(rightyellow);
            g2d.fill(leftyellow);
            g2d.setColor(Color.black);
            g2d.fill(rightgreen);
            g2d.fill(leftgreen);
            g2d.fill(leftred);
            sustain(2500);

        }
    }

    public void sustain(long t) {
        long finish = (new Date()).getTime() + t;
        while ((new Date()).getTime() < finish) {

        }
    }

    public static void main(String[] argv) {
        traffic2 t = new traffic2();
        t.setVisible(true);
        t.setTitle("Stoplight");
        t.setSize(500, 500);
    }
}
