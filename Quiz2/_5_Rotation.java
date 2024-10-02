package Quiz2;

import java.awt.*;
import java.awt.geom.*;

public class _5_Rotation extends Frame {
  private int windowHeight;

  /**
   * Constructor
   *
   * @param height The window height.
   */
  _5_Rotation(int height) {
    // Enables the closing of the window.
    addWindowListener(new CloseMyWindow());

    windowHeight = height;
  }

  public void paint(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;

    /*
     * yUp defines a translation allowing the specification of objects in "real"
     * coordinates where the y-axis points upwards and the origin of the coordinate
     * system is located in the lower left corner of the window.
     */
    AffineTransform yUp = new AffineTransform();
    yUp.setToScale(1, -1);
    AffineTransform translate = new AffineTransform();
    translate.setToTranslation(40, windowHeight - 50);
    yUp.preConcatenate(translate);

    // Apply the transformation to the Graphics2D object to draw everything
    // in "real" coordinates.
    g2d.transform(yUp);
    // The lines should have a thickness of 3.0 instead of 1.0.
    g2d.setStroke(new BasicStroke(3.0f));

    GeneralPath gp = new GeneralPath();
    // Start at the lower left corner of the car
    gp.moveTo(60, 120);
    gp.lineTo(80, 120); // front underbody
    gp.quadTo(90, 140, 100, 120); // front wheel
    gp.lineTo(160, 120); // middle underbody
    gp.quadTo(170, 140, 180, 120); // rear wheel
    gp.lineTo(200, 120); // rear underbody
    gp.curveTo(195, 100, 200, 80, 160, 80); // rear
    gp.lineTo(110, 80); // roof
    gp.lineTo(90, 100); // windscreen
    gp.lineTo(60, 100); // bonnet
    gp.lineTo(60, 120); // front
    g2d.draw(gp); // Draw the car

    // Define a rotation.
    AffineTransform rotation = new AffineTransform();
    rotation.setToRotation(Math.toRadians(-45));

    // Draw the scaled rectangle with dashed lines.
    g2d.setStroke(new BasicStroke(3.0f, BasicStroke.CAP_BUTT,
        BasicStroke.JOIN_BEVEL, 8.0f,
        new float[] { 50.0f, 10.0f }, 4.0f));
    g2d.setColor(Color.RED);
    g2d.draw(rotation.createTransformedShape(gp));
    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(1.0f));
    // Draw a coordinate system.
    drawSimpleCoordinateSystem(400, 200, g2d);

  }

  /**
   * Draws a coordinate system.
   *
   * @param xmax x-coordinate to which the x-axis should extend.
   * @param ymax y-coordinate to which the y-axis should extend.
   * @param g2d  Graphics2D object for drawing.
   */
  public static void drawSimpleCoordinateSystem(int xmax, int ymax,
      Graphics2D g2d) {
    int xOffset = 0;
    int yOffset = 0;
    int step = 20;
    String s;
    // Remember the actual font.
    Font fo = g2d.getFont();
    // Use a small font.
    int fontSize = 13;
    Font fontCoordSys = new Font("serif", Font.PLAIN, fontSize);
    /*
     * Unfortunately, the transformation yUp applied to the Graphics2D object
     * will cause the letters to occur upside down. Therefore, generate an
     * upside down font which will appear correctly when drawn upside down.
     */
    // To make the font upside down, a reflection w.r.t. the x-axis is needed.
    AffineTransform flip = new AffineTransform();
    flip.setToScale(1, -1);
    // Shift the font back to the baseline after reflection.
    AffineTransform lift = new AffineTransform();
    lift.setToTranslation(0, fontSize);
    flip.preConcatenate(lift);

    // Generate the font with the letters upside down.
    Font fontUpsideDown = fontCoordSys.deriveFont(flip);

    g2d.setFont(fontUpsideDown);

    // x-axis
    g2d.drawLine(xOffset, yOffset, xmax, yOffset);
    // Marks and labels for the x-axis.
    for (int i = xOffset + step; i <= xmax; i = i + step) {
      g2d.drawLine(i, yOffset - 2, i, yOffset + 2);
      g2d.drawString(String.valueOf(i), i - 7, yOffset - 30);
    }

    // y-axis
    g2d.drawLine(xOffset, yOffset, xOffset, ymax);

    // Marks and labels for the y-axis.
    s = "  "; // for indention of numbers < 100
    for (int i = yOffset + step; i <= ymax; i = i + step) {
      g2d.drawLine(xOffset - 2, i, xOffset + 2, i);
      if (i > 99) {
        s = "";
      }
      g2d.drawString(s + String.valueOf(i), xOffset - 25, i - 20);
    }

    // Reset to the original font.
    g2d.setFont(fo);
  }

  public static void main(String[] argv) {
    int height = 300;
    _5_Rotation f = new _5_Rotation(height);
    f.setTitle("Example: scaling");
    f.setSize(500, height);
    f.setVisible(true);
  }
}