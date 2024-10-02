package transformations;

import java.awt.*;
import java.awt.geom.*;

public class transform_shifted extends Frame {
  private int windowHeight;

  /**
   * Constructor
   *
   * @param height The window height.
   */
  transform_shifted(int height) {
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

    // Generate and draw a rectangle which will be shifted later on.
    Rectangle2D.Double rect = new Rectangle2D.Double(20, 20, 100, 60);
    g2d.draw(rect);

    // Define a translation.
    AffineTransform translation = new AffineTransform();
    translation.setToTranslation(140, 80);

    // Draw the scaled rectangle with dashed lines.
    g2d.setStroke(new BasicStroke(3.0f, BasicStroke.CAP_BUTT,
        BasicStroke.JOIN_BEVEL, 8.0f,
        new float[] { 50.0f, 10.0f }, 4.0f));
    g2d.draw(translation.createTransformedShape(rect));
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
    transform_shifted f = new transform_shifted(height);
    f.setTitle("Example: scaling");
    f.setSize(500, height);
    f.setVisible(true);
  }
}