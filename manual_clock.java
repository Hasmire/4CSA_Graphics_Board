import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.time.LocalTime;

// CLOCK
public class manual_clock extends JFrame {

  private JLabel setTimeLabel;
  private JTextField hour, minutes, seconds;
  private JButton setButton, currentTimeButton;

  Graphics2D graphics2D;
  Line2D.Double longHand;
  Line2D.Double shortHand;
  Line2D.Double secondsHand;

  private manual_clock() {
    super("Clock");
    setSize(700, 800);
    setLayout(null);
    setBackground(Color.WHITE);
    setForeground(Color.BLACK);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setTimeLabel = new JLabel("Set Time: ");
    add(setTimeLabel);
    setTimeLabel.setLocation(100, 650);
    setTimeLabel.setSize(100, 50);

    hour = new JTextField("");
    add(hour);
    hour.setLocation(150, 650);
    hour.setSize(50, 50);

    minutes = new JTextField("");
    add(minutes);
    minutes.setLocation(200, 650);
    minutes.setSize(50, 50);

    seconds = new JTextField("");
    add(seconds);
    seconds.setLocation(250, 650);
    seconds.setSize(50, 50);

    setButton = new JButton("Set");
    setButton.addActionListener(e -> {
      repaint();
      System.out.println(hour.getText() + " : " + minutes.getText() + " : " + seconds.getText());
    });
    add(setButton);
    setButton.setLocation(300, 650);
    setButton.setSize(100, 50);

    currentTimeButton = new JButton("Current Time");
    currentTimeButton.addActionListener(e -> {
      LocalTime now = LocalTime.now();
      hour.setText(String.format("%02d", now.getHour()));
      minutes.setText(String.format("%02d", now.getMinute()));
      seconds.setText(String.format("%02d", now.getSecond()));
      repaint();
    });
    add(currentTimeButton);
    currentTimeButton.setLocation(400, 650);
    currentTimeButton.setSize(150, 50);

    setVisible(true);
  }

  public Shape rotate(Shape shape, double deg) {
    AffineTransform transform = new AffineTransform();
    transform.rotate(Math.toRadians(deg), 350, 350);
    return transform.createTransformedShape(shape);
  }

  public void paint(Graphics g) {
    super.paint(g);
    if (g instanceof Graphics2D) {
      graphics2D = (Graphics2D) g;
      BasicStroke basicStroke = new BasicStroke(5.0f);
      graphics2D.setStroke(basicStroke);

      Ellipse2D.Double clock = new Ellipse2D.Double(100, 100, 500, 500);
      graphics2D.setPaint(Color.BLACK);
      graphics2D.draw(clock);

      Ellipse2D.Double center = new Ellipse2D.Double(340, 340, 20, 20);
      graphics2D.setPaint(Color.BLACK);
      graphics2D.fill(center);

      drawName();
      drawRomanNumerals();
      drawMinuteLines();

      drawLongHand();
      drawShortHands();
      drawSecondsHand();
    }
  }

  public void drawName() {
    graphics2D.setFont(new Font("Serif", Font.BOLD, 24));
    graphics2D.drawString("Lagman, JR Gregg Victor", 220, 430);
  }

  public void drawRomanNumerals() {
    String[] romanNumerals = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII" };
    int radius = 220;
    int centerX = 350;
    int centerY = 350;

    graphics2D.setFont(new Font("Serif", Font.BOLD, 24));
    for (int i = 0; i < 12; i++) {
      double angle = Math.toRadians((i * 30) - 60);
      int x = (int) (centerX + radius * Math.cos(angle));
      int y = (int) (centerY + radius * Math.sin(angle));
      graphics2D.drawString(romanNumerals[i], x - 15, y + 10);
    }
  }

  public void drawMinuteLines() {
    BasicStroke basicStroke2 = new BasicStroke(2.0f);
    graphics2D.setStroke(basicStroke2);
    graphics2D.setPaint(Color.LIGHT_GRAY);

    int radius = 240;
    int centerX = 350;
    int centerY = 350;

    for (int i = 0; i < 60; i++) {
      if (i % 5 == 0) {
        continue;
      }

      double angle = Math.toRadians(i * 6);
      int x1 = (int) (centerX + radius * Math.cos(angle));
      int y1 = (int) (centerY + radius * Math.sin(angle));
      int x2 = (int) (centerX + (radius - 10) * Math.cos(angle));
      int y2 = (int) (centerY + (radius - 10) * Math.sin(angle));
      graphics2D.drawLine(x1, y1, x2, y2);
    }
  }

  public void drawLongHand() {
    BasicStroke basicStroke2 = new BasicStroke(7.0f);
    graphics2D.setStroke(basicStroke2);
    longHand = new Line2D.Double(350, 350, 350, 150);
    graphics2D.setPaint(Color.ORANGE);
    if (hour.getText() != null && minutes.getText() != null) {
      double deg = (Integer.parseInt(hour.getText()) * 30) + (Integer.parseInt(minutes.getText()) / 2);
      graphics2D.draw(rotate(longHand, deg));
    } else {
      graphics2D.draw(longHand);
    }
  }

  public void drawShortHands() {
    BasicStroke basicStroke2 = new BasicStroke(7.0f);
    graphics2D.setStroke(basicStroke2);
    shortHand = new Line2D.Double(350, 350, 350, 200);
    graphics2D.setPaint(Color.BLUE);
    if (hour.getText() != null && minutes.getText() != null) {
      double deg = Integer.parseInt(minutes.getText()) * 6;
      graphics2D.draw(rotate(longHand, deg));
    } else {
      graphics2D.draw(shortHand);
    }
  }

  public void drawSecondsHand() {
    BasicStroke basicStroke2 = new BasicStroke(3.0f);
    graphics2D.setStroke(basicStroke2);
    secondsHand = new Line2D.Double(350, 350, 350, 100);
    graphics2D.setPaint(Color.RED);
    if (seconds.getText() != null) {
      double deg = Integer.parseInt(seconds.getText()) * 6;
      graphics2D.draw(rotate(secondsHand, deg));
    } else {
      LocalTime now = LocalTime.now();
      double deg = now.getSecond() * 6;
      graphics2D.draw(rotate(secondsHand, deg));
    }
  }

  public static void main(String[] args) {
    new manual_clock();
  }
}