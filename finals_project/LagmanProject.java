package finals_project;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.sound.sampled.*;
import javax.swing.*;

public class LagmanProject extends JPanel {

    private BufferedImage backgroundImage;
    private Image mayImage, pidgeotImage, jolteonImage, pidgeyImage, manectricImage, pikachuImage;

    private final Point backgroundOffset = new Point(0, 0);
    private final Point mayPosition = new Point(1200, 420);
    private final Point pidgeotPosition = new Point(2400, 0);
    private final Point jolteonPosition = new Point(1300, 600);
    private final Point[] pidgeyPositions = {
            new Point(1250, 300),
            new Point(1350, 200),
            new Point(1450, 240),
            new Point(1550, 160),
            new Point(1650, 220),
    };
    private final Point manectricPosition = new Point(1600, 560);
    private final Point pikachuPosition = new Point(1850, 480);

    private final double mayScale = 0.40;
    private final double pidgeotScale = 0.70;
    private final double jolteonScale = 0.80;
    private final double pidgeyScale = 0.40;
    private final double manectricScale = 0.40;
    private final double pikachuScale = 0.20;

    private long pidgeotStartTime, jolteonStartTime, pikachuLastJumpTime, manectricStartTime = 0;
    private boolean isPidgeotFlipped = false;

    private int manectricSpeed = 2;
    private final int pikachuMaxY = 670;
    private final int pikachuMinY = 540;

    public LagmanProject() {
        loadImages();
        initializeTimers();
        pidgeotStartTime = System.currentTimeMillis();
        playBackgroundMusic("finals_project/sound/music.wav");
    }

    private void loadImages() {
        backgroundImage = loadBufferedImage("finals_project/images/background.png");
        mayImage = loadImage("finals_project/images/may.gif");
        pidgeotImage = loadImage("finals_project/images/pidgeot.gif");
        jolteonImage = loadImage("finals_project/images/jolteon.gif");
        pidgeyImage = loadImage("finals_project/images/pidgey.gif");
        manectricImage = loadImage("finals_project/images/manectric.gif");
        pikachuImage = loadImage("finals_project/images/pikachu.gif");
    }

    private BufferedImage loadBufferedImage(String path) {
        try {
            return ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private Image loadImage(String path) {
        try {
            return new ImageIcon(path).getImage();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void initializeTimers() {
        // Timer to update background scrolling
        new Timer(1, e -> {
            updateBackgroundOffset();
            if (checkAllOutOfBounds()) {
                resetAllPositions();
            }
            repaint();
        }).start();

        // Timer to update positions of entities
        new Timer(60, e -> {
            updateMayPosition();
            updatePidgeotPosition();
            updateJolteonPosition();
            updatePidgeyPositions();
            updateManectricPosition();
            updatePikachuPosition();
            repaint();
        }).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        drawBackground(g2d);
        drawImage(g2d, mayImage, mayPosition, mayScale);
        drawImage(g2d, pidgeotImage, pidgeotPosition, pidgeotScale);
        drawImage(g2d, jolteonImage, jolteonPosition, jolteonScale);
        for (Point pidgeyPos : pidgeyPositions) {
            drawImage(g2d, pidgeyImage, pidgeyPos, pidgeyScale);
        }
        drawImage(g2d, manectricImage, manectricPosition, manectricScale);
        drawImage(g2d, pikachuImage, pikachuPosition, pikachuScale);
    }

    private void drawBackground(Graphics2D g2d) {
        if (backgroundImage != null) {
            int imageWidth = backgroundImage.getWidth();
            for (int x = -imageWidth + backgroundOffset.x; x < getWidth(); x += imageWidth) {
                g2d.drawImage(backgroundImage, x, backgroundOffset.y, null);
            }
        }
    }

    private void drawImage(Graphics2D g2d, Image image, Point position, double scale) {
        if (image != null) {
            AffineTransform transform = new AffineTransform();
            transform.translate(position.x, position.y);
            transform.scale(scale, scale);

            if (image == pidgeotImage && isPidgeotFlipped) {
                transform.scale(-1, 1);
                transform.translate(-image.getWidth(null), 0);
            }

            g2d.drawImage(image, transform, null);
        }
    }

    private void updateBackgroundOffset() {
        if (backgroundImage != null) {
            backgroundOffset.x = (backgroundOffset.x + 6) % backgroundImage.getWidth();
        }
    }

    private void updateMayPosition() {
        mayPosition.x -= 3;
    }

    private void updatePidgeotPosition() {
        long elapsedTime = System.currentTimeMillis() - pidgeotStartTime;

        if (elapsedTime < 5000) {
            pidgeotPosition.x -= 35;
            isPidgeotFlipped = false;
        } else if (elapsedTime < 9500) {
            pidgeotPosition.x += 15;
            isPidgeotFlipped = true;
        } else {
            pidgeotPosition.x -= 3;
            isPidgeotFlipped = false;
        }
    }

    private void updateJolteonPosition() {
        long elapsedTime = System.currentTimeMillis() - jolteonStartTime;

        if (elapsedTime < 2000) {
            jolteonPosition.translate(-3, -3);
        } else if (elapsedTime < 4000) {
            jolteonPosition.translate(-3, 3);
        } else {
            jolteonStartTime = System.currentTimeMillis();
        }
    }

    private void updatePidgeyPositions() {
        for (Point position : pidgeyPositions) {
            int deltaX = (Math.random() > 0.80 ? 1 : -1) * 5;
            int deltaY = (Math.random() > 0.5 ? 1 : -1) * 2;

            position.translate(deltaX, deltaY);
        }
    }

    private void updateManectricPosition() {
        if (manectricStartTime == 0) {
            manectricStartTime = System.currentTimeMillis();
        }

        long elapsedTime = System.currentTimeMillis() - manectricStartTime;
        manectricSpeed = Math.min(10, 2 + (int) (elapsedTime / 1000));
        manectricPosition.x -= manectricSpeed;
    }

    private void updatePikachuPosition() {
        long currentTime = System.currentTimeMillis();

        if (currentTime - pikachuLastJumpTime > 1000 && Math.random() > 0.7) {
            int deltaX = (Math.random() > 0.5 ? 1 : -1) * 30;
            int deltaY = (Math.random() > 0.5 ? 1 : -1) * 60;

            pikachuPosition.translate(deltaX, deltaY);
            pikachuPosition.y = Math.max(pikachuMinY, Math.min(pikachuMaxY, pikachuPosition.y));

            pikachuLastJumpTime = currentTime;
        } else {
            pikachuPosition.x -= 5;
        }
    }

    private boolean checkAllOutOfBounds() {
        return isOutOfBounds(mayPosition, mayImage) &&
                isOutOfBounds(pidgeotPosition, pidgeotImage) &&
                isOutOfBounds(jolteonPosition, jolteonImage) &&
                isOutOfBounds(manectricPosition, manectricImage) &&
                isOutOfBounds(pikachuPosition, pikachuImage) &&
                allPidgeysOutOfBounds();
    }

    private boolean isOutOfBounds(Point position, Image image) {
        return position.x + image.getWidth(null) < 0;
    }

    private boolean allPidgeysOutOfBounds() {
        for (Point position : pidgeyPositions) {
            if (!isOutOfBounds(position, pidgeyImage)) {
                return false;
            }
        }
        return true;
    }

    private void resetAllPositions() {
        mayPosition.x = getWidth();
        pidgeotPosition.x = getWidth();
        jolteonPosition.x = getWidth();
        manectricPosition.x = getWidth();
        pikachuPosition.x = getWidth();
        pidgeyPositions[0] = new Point(1200, 300);
        pidgeyPositions[1] = new Point(1250, 200);
        pidgeyPositions[2] = new Point(1300, 240);
        pidgeyPositions[3] = new Point(1350, 160);
        pidgeyPositions[4] = new Point(1400, 220);
    }

    private void playBackgroundMusic(String filePath) {
        try (InputStream audioSrc = new FileInputStream(filePath);
                InputStream bufferedIn = new BufferedInputStream(audioSrc)) {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(bufferedIn);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lagman Project");
        LagmanProject panel = new LagmanProject();

        frame.add(panel);
        frame.setSize(1200, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        panel.backgroundOffset.y = panel.getHeight() - panel.backgroundImage.getHeight();
    }
}
