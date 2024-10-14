package mp2;

import java.awt.*;
import java.awt.geom.*;

public class _03_ChristmasTree_GeneralPath extends Frame {
  public void paint(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    BasicStroke bs = new BasicStroke(8.0f);
    g2d.setStroke(bs);
    g2d.setFont(new Font("Arial", Font.BOLD, 30));

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

    // Create the Trunk
    GeneralPath trunk = new GeneralPath();
    trunk.moveTo(285, 550); // A
    trunk.lineTo(285, 580); // B
    trunk.lineTo(315, 580); // C
    trunk.lineTo(315, 550); // D
    trunk.closePath(); // A

    // Draw and fill the star
    g2d.setPaint(Color.YELLOW);
    g2d.fill(star);
    g2d.setPaint(Color.BLACK);
    g2d.draw(star);

    // Draw and fill the tree
    g2d.setPaint(Color.GREEN);
    g2d.fill(tree);
    g2d.setPaint(Color.BLACK);
    g2d.draw(tree);

    // Draw and fill the trunk
    g2d.setPaint(new Color(139, 69, 19)); // Brown color
    g2d.fill(trunk);
    g2d.setPaint(Color.BLACK);
    g2d.draw(trunk);
  }

  public static void main(String[] args) {
    _03_ChristmasTree_GeneralPath gp = new _03_ChristmasTree_GeneralPath();
    gp.setTitle("MP2_Lagman_03");
    gp.setBackground(Color.LIGHT_GRAY);
    gp.setSize(600, 650);
    gp.setForeground(Color.RED);
    gp.setVisible(true);
  }
}