package finals_project;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Lagman_Project extends JPanel {
    private BufferedImage backgroundImage;

    private Image mayImage, pidgeotImage, jolteonImage, pidgeyImage, manectricImage, pikachuImage;
    private final Point backgroundOffset = new Point(0, 0);
    private final Point mayPosition = new Point(1100, 420);
    private final Point pidgeotPosition = new Point(900, 0);
    private final Point jolteonPosition = new Point(1200, 600);
    private final Point[] pidgeyPositions = {
            new Point(1050, 300),
            new Point(1150, 200),
            new Point(1250, 240),
            new Point(1350, 160),
            new Point(1450, 220),
    };
    private final Point manectricPosition = new Point(1400, 560);
    private final Point pikachuPosition = new Point(1650, 480);

    private final double pidgeotScale = 0.70,
            mayScale = 0.40,
            jolteonScale = 0.8,
            pidgeyScale = 0.4,
            manectricScale = 0.4,
            pikachuScale = 0.2;

    private long pidgeotStartTime, jolteonStartTime, pikachuLastJumpTime, manectricStartTime = 0;

    private boolean isPidgeotFlipped = false;

    private int manectricSpeed = 2;

    private int pikachuMaxY = 670, pikachuMinY = 540;

    public Lagman_Project() {
        loadImages();
        initializeTimers();
        pidgeotStartTime = System.currentTimeMillis();
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
        new Timer(1, e -> {
            updateBackgroundOffset();
            if (checkAllOutOfBounds()) {
                resetAllPositions();
            }
            repaint();
        }).start();

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
            int imageHeight = backgroundImage.getHeight();

            for (int x = -imageWidth + backgroundOffset.x; x < getWidth(); x += imageWidth) {
                for (int y = backgroundOffset.y; y < getHeight(); y += imageHeight) {
                    g2d.drawImage(backgroundImage, x, y, null);
                }
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
        long currentTime = System.currentTimeMillis();
        long elapsedTime = currentTime - pidgeotStartTime;

        if (elapsedTime < 2000) {
            pidgeotPosition.x -= 45;
            isPidgeotFlipped = false;
        } else if (elapsedTime < 7000) {
            pidgeotPosition.x += 15;
            isPidgeotFlipped = true;
        } else {
            pidgeotPosition.x -= 3;
            isPidgeotFlipped = false;
        }
    }

    private void updateJolteonPosition() {
        long currentTime = System.currentTimeMillis();
        long elapsedTime = currentTime - jolteonStartTime;

        if (elapsedTime < 2000) {
            jolteonPosition.x -= 3;
            jolteonPosition.y -= 3;
        } else if (elapsedTime < 4000) {
            jolteonPosition.x -= 3;
            jolteonPosition.y += 3;
        } else if (elapsedTime >= 4000) {
            jolteonStartTime = currentTime;
        }
    }

    private void updatePidgeyPositions() {
        long currentTime = System.currentTimeMillis();
        long elapsedTime = currentTime % 3000;

        for (Point pidgeyPos : pidgeyPositions) {
            updateSinglePidgeyPosition(pidgeyPos, elapsedTime);
        }
    }

    private void updateSinglePidgeyPosition(Point position, long elapsedTime) {
        int directionX = Math.random() > 0.80 ? 1 : -1;
        int directionY = Math.random() > 0.5 ? 1 : -1;

        int deltaX = directionX * 5;
        int deltaY = directionY * 2;

        position.x += deltaX;
        position.y += deltaY;
    }

    private void updateManectricPosition() {
        if (manectricStartTime == 0)
            manectricStartTime = System.currentTimeMillis();

        long elapsedTime = System.currentTimeMillis() - manectricStartTime;
        manectricSpeed = Math.min(10, 2 + (int) (elapsedTime / 1000));
        manectricPosition.x -= manectricSpeed;
    }

    private void updatePikachuPosition() {
        long currentTime = System.currentTimeMillis();

        if (currentTime - pikachuLastJumpTime > 1000 && Math.random() > 0.7) {
            int deltaX = (Math.random() > 0.5 ? 1 : -1) * 30;
            int deltaY = (Math.random() > 0.5 ? 1 : -1) * 60;

            pikachuPosition.x += deltaX;
            pikachuPosition.y += deltaY;

            if (pikachuPosition.y > pikachuMaxY) {
                pikachuPosition.y = pikachuMaxY;
            } else if (pikachuPosition.y < pikachuMinY) {
                pikachuPosition.y = pikachuMinY;
            }

            pikachuLastJumpTime = currentTime;
        } else {
            pikachuPosition.x -= 5.5;
        }
    }

    private boolean checkAllOutOfBounds() {
        boolean mayOutOfBounds = isOutOfBounds(mayPosition, mayImage);
        boolean pidgeotOutOfBounds = isOutOfBounds(pidgeotPosition, pidgeotImage);
        boolean jolteonOutOfBounds = isOutOfBounds(jolteonPosition, jolteonImage);
        boolean manectricOutOfBounds = isOutOfBounds(manectricPosition, manectricImage);
        boolean pikachuOutOfBounds = isOutOfBounds(pikachuPosition, pikachuImage);
        boolean allPidgeysOutOfBounds = allPidgeysOutOfBounds();

        return mayOutOfBounds && pidgeotOutOfBounds && jolteonOutOfBounds && manectricOutOfBounds && pikachuOutOfBounds
                && allPidgeysOutOfBounds;
    }

    private boolean isOutOfBounds(Point position, Image image) {
        return position.x + image.getWidth(null) < 0;
    }

    private boolean allPidgeysOutOfBounds() {
        for (Point pidgeyPos : pidgeyPositions) {
            if (pidgeyPos.x + pidgeyImage.getWidth(null) >= 0) {
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
        resetPidgeyPositions();
    }

    private void resetPidgeyPositions() {
        pidgeyPositions[0] = new Point(1200, 300);
        pidgeyPositions[1] = new Point(1250, 200);
        pidgeyPositions[2] = new Point(1300, 240);
        pidgeyPositions[3] = new Point(1350, 160);
        pidgeyPositions[4] = new Point(1400, 220);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lagman_Project");
        Lagman_Project panel = new Lagman_Project();

        frame.add(panel);
        frame.setSize(1200, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        panel.backgroundOffset.y = panel.getHeight() - panel.backgroundImage.getHeight();
    }
}