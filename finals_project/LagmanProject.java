package finals_project;

import finals_project.characters.*;

import java.awt.*;
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;

public class LagmanProject extends JPanel {
    private Background background;
    private AnimatedImage may, pidgeot, jolteon, manectric, pikachu, lapras;
    private AnimatedImage[] pidgeys;

    public LagmanProject() {
        background = new Background("finals_project/images/background.png");
        loadImages();
        initializeTimers();
        playBackgroundMusic("finals_project/sound/music.wav");
    }

    private void loadImages() {
        may = new May(new Point(1200, 420));
        pidgeot = new Pidgeot(new Point(2400, 0));
        jolteon = new Jolteon(new Point(1300, 600));
        manectric = new Manectric(new Point(1600, 560));
        pikachu = new Pikachu(new Point(1850, 480), 540, 670);
        lapras = new Lapras(new Point(1400, 400), 398, 403);
        pidgeys = new AnimatedImage[] {
                new Pidgey(new Point(1250, 300)),
                new Pidgey(new Point(1300, 200)),
                new Pidgey(new Point(1350, 240)),
                new Pidgey(new Point(1400, 160)),
                new Pidgey(new Point(1450, 220))
        };
    }

    private void initializeTimers() {
        new Timer(1, e -> {
            background.updateOffset(6);
            if (checkAllOutOfBounds()) {
                resetAllPositions();
            }
            repaint();
        }).start();

        new Timer(60, e -> {
            may.updatePosition();
            pidgeot.updatePosition();
            jolteon.updatePosition();
            for (AnimatedImage pidgey : pidgeys) {
                pidgey.updatePosition();
            }
            manectric.updatePosition();
            pikachu.updatePosition();
            lapras.updatePosition();
            repaint();
        }).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        background.draw(g2d, getWidth(), getHeight());
        lapras.draw(g2d);
        may.draw(g2d);
        pidgeot.draw(g2d);
        jolteon.draw(g2d);
        for (AnimatedImage pidgey : pidgeys) {
            pidgey.draw(g2d);
        }
        manectric.draw(g2d);
        pikachu.draw(g2d);
    }

    private boolean checkAllOutOfBounds() {
        return may.isOutOfBounds() &&
                pidgeot.isOutOfBounds() &&
                jolteon.isOutOfBounds() &&
                manectric.isOutOfBounds() &&
                pikachu.isOutOfBounds() &&
                allPidgeysOutOfBounds();
    }

    private boolean allPidgeysOutOfBounds() {
        for (AnimatedImage pidgey : pidgeys) {
            if (!pidgey.isOutOfBounds()) {
                return false;
            }
        }
        return true;
    }

    private void resetAllPositions() {
        may.resetPosition(new Point(1200, 420));
        pidgeot.resetPosition(new Point(2400, 0));
        pidgeot.setStartTime(System.currentTimeMillis());
        jolteon.resetPosition(new Point(1300, 600));
        manectric.resetPosition(new Point(1600, 560));
        pikachu.resetPosition(new Point(1850, 480));
        lapras.resetPosition(new Point(1400, 400));
        pidgeys[0].resetPosition(new Point(1250, 300));
        pidgeys[1].resetPosition(new Point(1300, 200));
        pidgeys[2].resetPosition(new Point(1350, 240));
        pidgeys[3].resetPosition(new Point(1400, 160));
        pidgeys[4].resetPosition(new Point(1450, 220));
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

        panel.background.setOffsetY(panel.getHeight() - panel.background.getHeight());
    }
}