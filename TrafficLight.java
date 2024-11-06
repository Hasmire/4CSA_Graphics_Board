import java.awt.*;
import java.awt.geom.*;
import java.util.Date;

import javax.swing.*;

public class TrafficLight extends JPanel {

    private enum State {
        START, GO1_STP2, RDY1_STP2, STP1_GO2, STP1_RDY2
    }

    private State state = State.START;
    private int baseTimer = 3;
    private int road1Timer = 3;
    private int road2Timer = 3;

    private int redDuration = 33;
    private int greenDuration = 30;
    private int yellowDuration = 3;
    private int baseDuration = 30;

    public TrafficLight() {
        Timer stateTimer = new Timer(1000, e -> {
            baseTimer--;
            road1Timer--;
            road2Timer--;

            if (baseTimer == 0) {
                switch (state) {
                    case START:
                        state = State.GO1_STP2;
                        baseTimer = baseDuration;
                        road1Timer = greenDuration;
                        road2Timer = redDuration;
                        break;
                    case GO1_STP2:
                        state = State.RDY1_STP2;
                        baseTimer = yellowDuration;
                        road1Timer = yellowDuration;
                        break;
                    case RDY1_STP2:
                        state = State.STP1_GO2;
                        baseTimer = baseDuration;
                        road1Timer = redDuration;
                        road2Timer = greenDuration;
                        break;
                    case STP1_GO2:
                        state = State.STP1_RDY2;
                        baseTimer = yellowDuration;
                        road2Timer = yellowDuration;
                        break;
                    case STP1_RDY2:
                        state = State.GO1_STP2;
                        baseTimer = baseDuration;
                        road1Timer = greenDuration;
                        road2Timer = redDuration;
                        break;
                }
            }
            repaint();
        });
        stateTimer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        drawTrafficLight(g2d, 100, 40, "Road 1", road1Timer);

        drawTrafficLight(g2d, 500, 40, "Road 2", road2Timer);
    }

    private void drawLight(Graphics2D g2d, String color) {
        switch (color) {
            case "red":
                Ellipse2D.Double redLight = new Ellipse2D.Double(63, 92, 53, 54);
                g2d.setColor(new Color(242, 42, 45));
                g2d.fill(redLight);
                g2d.setColor(Color.BLACK);
                g2d.draw(redLight);
                break;
            case "yellow":
                Ellipse2D.Double yellowLight = new Ellipse2D.Double(63, 170, 53, 54);
                g2d.setColor(new Color(255, 153, 6));
                g2d.fill(yellowLight);
                g2d.setColor(Color.BLACK);
                g2d.draw(yellowLight);
                break;
            case "green":
                Ellipse2D.Double greenLight = new Ellipse2D.Double(63, 248, 53, 54);
                g2d.setColor(new Color(3, 209, 118));
                g2d.fill(greenLight);
                g2d.setColor(Color.BLACK);
                g2d.draw(greenLight);
                break;
            default:
                break;
        }
    }

    private String returnLightColor(String roadText) {
        if (roadText == "Road 1") {
            switch (state) {
                case GO1_STP2:
                    return "green";
                case RDY1_STP2:
                    return "yellow";
                case STP1_GO2:
                    return "red";
                case STP1_RDY2:
                    return "red";
                default:
                    return "red";
            }
        } else {
            switch (state) {
                case GO1_STP2:
                    return "red";
                case RDY1_STP2:
                    return "red";
                case STP1_GO2:
                    return "green";
                case STP1_RDY2:
                    return "yellow";
                default:
                    return "red";
            }
        }
    }

    private void drawTrafficLight(Graphics2D g2d, int translateX, int translateY, String roadText, int timerText) {
        String color = returnLightColor(roadText);
        g2d.translate(translateX, translateY);

        GeneralPath body = new GeneralPath();
        body.moveTo(103, 320);
        body.lineTo(76, 320);
        body.lineTo(76, 543);
        body.lineTo(103, 543);
        body.closePath();
        g2d.setColor(new Color(156, 155, 151));
        g2d.fill(body);
        g2d.setColor(Color.BLACK);
        g2d.draw(body);

        GeneralPath base = new GeneralPath();
        base.moveTo(110, 543);
        base.lineTo(68, 543);
        base.lineTo(68, 562);
        base.lineTo(110, 562);
        base.closePath();
        g2d.setColor(new Color(122, 113, 114));
        g2d.fill(base);
        g2d.setColor(Color.BLACK);
        g2d.draw(base);

        GeneralPath bottom = new GeneralPath();
        bottom.moveTo(125, 562);
        bottom.lineTo(52, 562);
        bottom.curveTo(48, 563, 46, 564, 46, 570);
        bottom.lineTo(46, 588);
        bottom.curveTo(47, 592, 49, 593, 52, 594);
        bottom.lineTo(126, 593);
        bottom.curveTo(130, 593, 131, 592, 132, 588);
        bottom.lineTo(132, 570);
        bottom.curveTo(132, 565, 131, 563, 125, 562);
        bottom.closePath();
        g2d.setColor(new Color(82, 82, 80));
        g2d.fill(bottom);
        g2d.setColor(Color.BLACK);
        g2d.draw(bottom);

        GeneralPath frame = new GeneralPath();
        frame.moveTo(137, 320);
        frame.lineTo(41, 320);
        frame.curveTo(39, 319, 38, 318, 38, 317);
        frame.lineTo(38, 79);
        frame.curveTo(38, 75, 39, 74, 41, 74);
        frame.lineTo(137, 74);
        frame.curveTo(140, 75, 140, 75, 140, 79);
        frame.lineTo(140, 317);
        frame.curveTo(140, 319, 140, 319, 137, 320);
        frame.closePath();
        g2d.setColor(new Color(16, 52, 66));
        g2d.fill(frame);
        g2d.setColor(Color.BLACK);
        g2d.draw(frame);

        Ellipse2D.Double circle = new Ellipse2D.Double(57, 86, 65, 65);
        g2d.setColor(new Color(13, 26, 32));
        g2d.fill(circle);
        g2d.setColor(Color.BLACK);
        g2d.draw(circle);

        circle = new Ellipse2D.Double(57, 164, 65, 65);
        g2d.setColor(new Color(13, 26, 32));
        g2d.fill(circle);
        g2d.setColor(Color.BLACK);
        g2d.draw(circle);

        circle = new Ellipse2D.Double(57, 242, 65, 65);
        g2d.setColor(new Color(13, 26, 32));
        g2d.fill(circle);
        g2d.setColor(Color.BLACK);
        g2d.draw(circle);

        drawLight(g2d, color);

        GeneralPath side = new GeneralPath();
        side.moveTo(176, 164);
        side.lineTo(140, 164);
        side.lineTo(140, 213);
        side.lineTo(161, 213);
        side.lineTo(161, 195);
        side.curveTo(173, 183, 175, 176, 176, 164);
        side.closePath();
        g2d.setColor(new Color(13, 26, 32));
        g2d.fill(side);
        g2d.setColor(Color.BLACK);
        g2d.draw(side);

        side.reset();

        side.moveTo(176, 88);
        side.lineTo(140, 88);
        side.lineTo(140, 137);
        side.lineTo(161, 137);
        side.lineTo(161, 119);
        side.curveTo(173, 107, 175, 100, 176, 88);
        side.closePath();
        g2d.setColor(new Color(13, 26, 32));
        g2d.fill(side);
        g2d.setColor(Color.BLACK);
        g2d.draw(side);

        side.reset();

        side.moveTo(176, 242);
        side.lineTo(140, 242);
        side.lineTo(140, 291);
        side.lineTo(161, 291);
        side.lineTo(161, 273);
        side.curveTo(173, 261, 175, 254, 176, 242);
        side.closePath();
        g2d.setColor(new Color(13, 26, 32));
        g2d.fill(side);
        g2d.setColor(Color.BLACK);
        g2d.draw(side);

        side.reset();
        side.moveTo(1, 242);
        side.lineTo(38, 242);
        side.lineTo(38, 291);
        side.lineTo(16, 291);
        side.lineTo(16, 273);
        side.curveTo(4, 261, 2, 254, 1, 242);
        side.closePath();
        g2d.setColor(new Color(13, 26, 32));
        g2d.fill(side);
        g2d.setColor(Color.BLACK);
        g2d.draw(side);

        side.reset();
        side.moveTo(1, 164);
        side.lineTo(38, 164);
        side.lineTo(38, 213);
        side.lineTo(16, 213);
        side.lineTo(16, 195);
        side.curveTo(4, 183, 2, 176, 1, 164);
        side.closePath();
        g2d.setColor(new Color(13, 26, 32));
        g2d.fill(side);
        g2d.setColor(Color.BLACK);
        g2d.draw(side);

        side.reset();
        side.moveTo(1, 88);
        side.lineTo(38, 88);
        side.lineTo(38, 137);
        side.lineTo(16, 137);
        side.lineTo(16, 119);
        side.curveTo(4, 107, 2, 100, 1, 88);
        side.closePath();
        g2d.setColor(new Color(13, 26, 32));
        g2d.fill(side);
        g2d.setColor(Color.BLACK);
        g2d.draw(side);

        GeneralPath top = new GeneralPath();
        top.moveTo(45, 6);
        top.curveTo(45, 3, 47, 0, 50, 0);
        top.lineTo(130, 0);
        top.curveTo(133, 0, 135, 3, 135, 6);
        top.lineTo(135, 74);
        top.lineTo(45, 74);
        top.lineTo(45, 6);
        top.closePath();
        g2d.setColor(new Color(13, 26, 32));
        g2d.fill(top);

        switch (color) {
            case "red":
                g2d.setColor(new Color(242, 42, 45));
                break;
            case "yellow":
                g2d.setColor(new Color(255, 153, 6));
                break;
            case "green":
                g2d.setColor(new Color(3, 209, 118));
                break;
            default:
                break;
        }
        g2d.setFont(new Font("Gill Sans MT", Font.BOLD, 30));
        g2d.drawString(String.valueOf(timerText), 71, 50);

        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Gill Sans MT", Font.BOLD, 20));
        g2d.drawString(roadText, 59, 620);

        g2d.translate(-translateX, -translateY);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new TrafficLight());
        frame.setSize(800, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
