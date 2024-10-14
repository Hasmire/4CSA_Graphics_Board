package mp2;

import java.awt.*;
import java.awt.geom.*;

public class _04_SetOperations extends Frame {
  public void paint(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    BasicStroke bs = new BasicStroke(8.0f);
    g2d.setStroke(bs);
    g2d.setFont(new Font("Arial", Font.BOLD, 30));

    GeneralPath cross = new GeneralPath();

    // Top Lines and QuadCurve
    cross.moveTo(250, 280); // Start at A
    cross.lineTo(250, 180); // Line AB
    cross.quadTo(290, 140, 330, 180); // QuadCurve BC
    cross.lineTo(330, 280); // Line CD

    // Right Lines and QuadCurve
    cross.lineTo(430, 280); // Line DE
    cross.quadTo(470, 320, 430, 360); // QuadCurve EF
    cross.lineTo(330, 360); // Line FG

    // Bottom Lines and QuadCurve
    cross.lineTo(330, 460); // Line GH
    cross.quadTo(290, 500, 250, 460); // QuadCurve HI
    cross.lineTo(250, 360); // Line IJ

    // Left Lines and QuadCurve
    cross.lineTo(150, 360); // Line JK
    cross.quadTo(110, 320, 150, 280); // QuadCurve KL
    cross.lineTo(250, 280); // Line LA

    // g2d.draw(cross);

    // Create the Star
    GeneralPath star = new GeneralPath();
    star.moveTo(300, 100); // A
    star.lineTo(280, 80); // B
    star.lineTo(300, 60); // C
    star.lineTo(320, 80); // D
    star.closePath(); // A

    // Create the Tree
    GeneralPath tree = new GeneralPath();
    tree.moveTo(300, 100); // A
    tree.lineTo(250, 250); // B
    tree.lineTo(270, 250); // C
    tree.lineTo(200, 400); // D
    tree.lineTo(220, 400); // E
    tree.lineTo(150, 550); // F
    tree.lineTo(450, 550); // G
    tree.lineTo(380, 400); // H
    tree.lineTo(400, 400); // I
    tree.lineTo(330, 250); // J
    tree.lineTo(350, 250); // K
    tree.closePath(); // A

    // Create the Base
    GeneralPath base = new GeneralPath();
    base.moveTo(285, 550); // A
    base.lineTo(285, 580); // B
    base.lineTo(315, 580); // C
    base.lineTo(315, 550); // D
    base.closePath(); // A

    // Draw and fill the star
    // g2d.setPaint(Color.YELLOW);
    // g2d.fill(star);
    // g2d.setPaint(Color.BLACK);
    // g2d.draw(star);

    // Draw and fill the tree
    // g2d.setPaint(Color.GREEN);
    // g2d.fill(tree);
    // g2d.setPaint(Color.BLACK);
    // g2d.draw(tree);

    // Draw and fill the base
    // g2d.setPaint(new Color(139, 69, 19)); // Brown color
    // g2d.fill(base);
    // g2d.setPaint(Color.BLACK);
    // g2d.draw(base);

    Area crossArea = new Area(cross);
    Area christmasTree = new Area(star);
    christmasTree.add(new Area(tree));
    christmasTree.add(new Area(base));

    // Union of Cross and Christmas Tree
    // crossArea.add(christmasTree);
    // g2d.setPaint(Color.RED);
    // g2d.fill(crossArea);

    // Intersection of Cross and Christmas Tree
    // crossArea.intersect(christmasTree);
    // g2d.setPaint(Color.GREEN);
    // g2d.fill(crossArea);

    // Symmetric Difference of Cross and Christmas Tree
    // crossArea.exclusiveOr(christmasTree);
    // g2d.setPaint(Color.BLUE);
    // g2d.fill(crossArea);

    // Relative difference of Cross and Christmas Tree
    // crossArea.subtract(christmasTree);
    // g2d.setPaint(Color.YELLOW);
    // g2d.fill(crossArea);

    // Relative difference of Christmas Tree and Cross
    christmasTree.subtract(new Area(cross));
    g2d.setPaint(Color.CYAN);
    g2d.fill(christmasTree);
  }

  public static void main(String[] args) {
    _04_SetOperations gp = new _04_SetOperations();
    gp.setTitle("MP2_Lagman_04");
    gp.setBackground(Color.LIGHT_GRAY);
    gp.setSize(600, 650);
    gp.setForeground(Color.RED);
    gp.setVisible(true);
  }
}