import java.awt.*;
import java.awt.geom.*;

public class genpath_java extends Frame {
  public void paint(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    BasicStroke bs = new BasicStroke(8.0f);
    g2d.setStroke(bs);
    g2d.setFont(new Font("Arial", Font.BOLD, 30));

    GeneralPath gp1 = new GeneralPath();
    gp1.moveTo(50, 50);
    gp1.lineTo(50, 200);
    gp1.quadTo(150, 500, 250, 200);
    gp1.curveTo(350, 100, 150, 150, 100, 100);
    gp1.lineTo(50, 50);

    g2d.setPaint(Color.GREEN);
    // g2d.draw(gp1);
    g2d.setPaint(Color.RED);
    // g2d.fill(gp1);

    GeneralPath car = new GeneralPath();
    car.moveTo(60, 120);
    car.lineTo(80, 120); // front underbody
    car.quadTo(90, 140, 100, 120); // front wheel
    car.lineTo(160, 120); // middle underbody
    car.quadTo(170, 140, 180, 120); // rear wheel
    car.lineTo(200, 120); // rear underbody
    car.curveTo(195, 100, 200, 80, 160, 80); // rear
    car.lineTo(110, 80); // roof
    car.lineTo(90, 100); // windscreen
    car.lineTo(60, 100); // bonnet
    car.lineTo(60, 120);

    g2d.draw(car);
    g2d.setPaint(Color.ORANGE);
    g2d.fill(car);
  }

  public static void main(String[] agv) {
    genpath_java gp = new genpath_java();
    gp.setTitle("String and GeomImages in Java");
    gp.setBackground(Color.LIGHT_GRAY);
    gp.setSize(800, 800);
    gp.setForeground(Color.RED);
    gp.setVisible(true);

  }
}
