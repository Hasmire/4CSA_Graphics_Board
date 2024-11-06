package finals_mp1;

import java.awt.*;
import java.awt.geom.*;
import java.util.Map;

import javax.swing.*;

public class Lagman_MPAnimationTL extends JPanel {

    private enum State {
        START, GO1_STP2, RDY1_STP2, STP1_GO2, STP1_RDY2
    }

    private State currentState = State.START;
    private int baseTimer = 3;
    private int road1Timer = 3;
    private int road2Timer = 3;

    private static final int RED_DURATION = 33;
    private static final int GREEN_DURATION = 30;
    private static final int YELLOW_DURATION = 3;
    private static final int BASE_DURATION = 30;

    private static final Map<String, Color> COLORS = Map.of(
            "red", new Color(242, 42, 45),
            "yellow", new Color(255, 153, 6),
            "green", new Color(3, 209, 118),
            "outline", new Color(13, 26, 32),
            "body", new Color(156, 155, 151),
            "base", new Color(122, 113, 114),
            "bottom", new Color(82, 82, 80),
            "frame", new Color(16, 52, 66),
            "side", new Color(13, 26, 32));

    private Map<State, String> road1LightMap = Map.of(
            State.START, "red",
            State.GO1_STP2, "green",
            State.RDY1_STP2, "yellow",
            State.STP1_GO2, "red",
            State.STP1_RDY2, "red");

    private Map<State, String> road2LightMap = Map.of(
            State.START, "red",
            State.GO1_STP2, "red",
            State.RDY1_STP2, "red",
            State.STP1_GO2, "green",
            State.STP1_RDY2, "yellow");

    public Lagman_MPAnimationTL() {
        Timer stateTimer = new Timer(1000, e -> {
            baseTimer--;
            road1Timer--;
            road2Timer--;

            if (baseTimer == 0) {
                switch (currentState) {
                    case START:
                        transitionState(State.GO1_STP2, BASE_DURATION, GREEN_DURATION, RED_DURATION);
                        break;
                    case GO1_STP2:
                        transitionState(State.RDY1_STP2, YELLOW_DURATION, YELLOW_DURATION, road2Timer);
                        break;
                    case RDY1_STP2:
                        transitionState(State.STP1_GO2, BASE_DURATION, RED_DURATION, GREEN_DURATION);
                        break;
                    case STP1_GO2:
                        transitionState(State.STP1_RDY2, YELLOW_DURATION, road1Timer, YELLOW_DURATION);
                        break;
                    case STP1_RDY2:
                        transitionState(State.GO1_STP2, BASE_DURATION, GREEN_DURATION, RED_DURATION);
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

        drawTrafficLight(g2d, 100, 40, "Road 1", road1Timer, getLightColor("Road 1"));
        drawTrafficLight(g2d, 500, 40, "Road 2", road2Timer, getLightColor("Road 2"));
    }

    private void transitionState(State nextState, int newBaseTimer, int newRoad1Timer, int newRoad2Timer) {
        currentState = nextState;
        baseTimer = newBaseTimer;
        road1Timer = newRoad1Timer;
        road2Timer = newRoad2Timer;
    }

    private String getLightColor(String road) {
        return road.equals("Road 1") ? road1LightMap.get(currentState) : road2LightMap.get(currentState);
    }

    private Color getActiveColor(String color) {
        return COLORS.getOrDefault(color, Color.BLACK);
    }

    private void drawTrafficLight(Graphics2D g2d, int x, int y, String roadName, int timer, String lightColor) {
        g2d.translate(x, y);

        drawStoplightFrame(g2d);
        drawLight(g2d, lightColor);
        drawTimerText(g2d, timer, lightColor);
        drawRoadLabel(g2d, roadName);

        g2d.translate(-x, -y);
    }

    private void drawStoplightFrame(Graphics2D g2d) {
        GeneralPath body = new GeneralPath();
        body.moveTo(103, 320);
        body.lineTo(76, 320);
        body.lineTo(76, 543);
        body.lineTo(103, 543);
        body.closePath();
        g2d.setColor(COLORS.get("body"));
        g2d.fill(body);
        g2d.setColor(Color.BLACK);
        g2d.draw(body);

        GeneralPath base = new GeneralPath();
        base.moveTo(110, 543);
        base.lineTo(68, 543);
        base.lineTo(68, 562);
        base.lineTo(110, 562);
        base.closePath();
        g2d.setColor(COLORS.get("base"));
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
        g2d.setColor(COLORS.get("bottom"));
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
        g2d.setColor(COLORS.get("frame"));
        g2d.fill(frame);
        g2d.setColor(Color.BLACK);
        g2d.draw(frame);

        GeneralPath side = new GeneralPath();
        side.moveTo(176, 164);
        side.lineTo(140, 164);
        side.lineTo(140, 213);
        side.lineTo(161, 213);
        side.lineTo(161, 195);
        side.curveTo(173, 183, 175, 176, 176, 164);
        side.closePath();
        g2d.setColor(COLORS.get("side"));
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
        g2d.setColor(COLORS.get("side"));
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
        g2d.setColor(COLORS.get("side"));
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
        g2d.setColor(COLORS.get("side"));
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
        g2d.setColor(COLORS.get("side"));
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
        g2d.setColor(COLORS.get("side"));
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
        g2d.setColor(COLORS.get("side"));
        g2d.fill(top);
    }

    private void drawLight(Graphics2D g2d, String color) {
        drawLightOutline(g2d, 57, 86);
        drawLightOutline(g2d, 57, 164);
        drawLightOutline(g2d, 57, 242);

        switch (color) {
            case "red":
                drawColoredLight(g2d, color, 63, 92);
                break;
            case "yellow":
                drawColoredLight(g2d, color, 63, 170);
                break;
            case "green":
                drawColoredLight(g2d, color, 63, 248);
                break;
        }
    }

    private void drawLightOutline(Graphics2D g2d, int x, int y) {
        Ellipse2D.Double outline = new Ellipse2D.Double(x, y, 65, 65);
        g2d.setColor(COLORS.get("outline"));
        g2d.fill(outline);
        g2d.setColor(Color.BLACK);
        g2d.draw(outline);
    }

    private void drawColoredLight(Graphics2D g2d, String color, int x, int y) {
        Ellipse2D.Double light = new Ellipse2D.Double(x, y, 53, 54);
        g2d.setColor(getActiveColor(color));
        g2d.fill(light);
        g2d.setColor(Color.BLACK);
        g2d.draw(light);
    }

    private void drawTimerText(Graphics2D g2d, int timer, String color) {
        g2d.setFont(new Font("Gill Sans MT", Font.BOLD, 30));
        g2d.setColor(getActiveColor(color));
        g2d.drawString(String.valueOf(timer), 73, 50);
    }

    private void drawRoadLabel(Graphics2D g2d, String roadName) {
        g2d.setFont(new Font("Gill Sans MT", Font.BOLD, 20));
        g2d.setColor(Color.BLACK);
        g2d.drawString(roadName, 59, 620);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new Lagman_MPAnimationTL());
        frame.setTitle("MP1_Finals_Lagman_Animation_Traffic Lights");
        frame.setSize(800, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
