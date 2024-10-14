package Prelims_Project;

import java.awt.*;
import java.awt.geom.*;

public class SelfPortrait extends Frame {
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

    g2d.draw(cross);
  }

  public static void main(String[] args) {
    SelfPortrait gp = new SelfPortrait();
    gp.setTitle("Lagman_SelfPortrait");
    gp.setBackground(Color.LIGHT_GRAY);
    gp.setSize(600, 650);
    gp.setForeground(Color.RED);
    gp.setVisible(true);
  }
}