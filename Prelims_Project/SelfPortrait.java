import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class SelfPortrait extends JFrame {
  public SelfPortrait() {
    setTitle("Lagman_SelfPortrait");
    setBackground(Color.LIGHT_GRAY);
    setSize(1280, 1257);
    setForeground(Color.RED);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    DrawingPanel drawingPanel = new DrawingPanel();
    JScrollPane scrollPane = new JScrollPane(drawingPanel);
    scrollPane.setPreferredSize(new Dimension(1280, 800));

    getContentPane().add(scrollPane);
    pack();
    setVisible(true);
  }

  public static void main(String[] args) {
    new SelfPortrait();
  }

  class DrawingPanel extends JPanel {
    private double scale = 1.0;

    public DrawingPanel() {
      addMouseWheelListener(new MouseWheelListener() {
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
          if (e.getPreciseWheelRotation() < 0) {
            scale *= 1.1;
          } else {
            scale /= 1.1;
          }
          revalidate();
          repaint();
        }
      });
    }

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      Graphics2D g2d = (Graphics2D) g;
      g2d.scale(scale, scale);
      BasicStroke bs = new BasicStroke(4.0f);
      g2d.setStroke(bs);
      g2d.setFont(new Font("Arial", Font.BOLD, 30));

      // Clothes
      GeneralPath clothes = new GeneralPath();
      clothes.moveTo(91, 899);
      clothes.curveTo(48.914, 1000.35, 29.2468, 1067.75, 2, 1185.5);
      clothes.lineTo(1265.5, 1186.5);
      clothes.lineTo(1265.5, 960.5);
      clothes.curveTo(1263.8, 893.52, 1231.05, 864.545, 1161, 816);
      clothes.lineTo(874.5, 690.5);
      clothes.lineTo(839, 829.5);
      clothes.curveTo(771.551, 952.47, 722.234, 999.243, 580.5, 979);
      clothes.curveTo(505.443, 916.402, 469.591, 877.721, 506, 751);
      clothes.curveTo(508.262, 727.749, 509.5, 711.5, 501, 710.5);
      clothes.curveTo(492.5, 709.5, 384.845, 754.001, 310, 784.5);
      clothes.lineTo(91, 899);
      clothes.closePath();
      g2d.setColor(Color.decode("#4A515B"));
      g2d.fill(clothes);
      g2d.setColor(Color.BLACK);
      g2d.draw(clothes);

      // Neck
      GeneralPath neck = new GeneralPath();
      neck.moveTo(506, 714);
      neck.lineTo(492, 642);
      neck.lineTo(829, 505);
      neck.lineTo(841.5, 704.5);
      neck.lineTo(841.5, 816.5);
      neck.curveTo(788.926, 936.731, 742.182, 973.559, 631, 990);
      neck.curveTo(552.646, 980.68, 509.706, 943.293, 478, 837);
      neck.curveTo(492.336, 747.64, 509.866, 725.678, 506, 714);
      neck.closePath();
      g2d.setColor(Color.decode("#C67E66"));
      g2d.fill(neck);
      g2d.setColor(Color.BLACK);
      g2d.draw(neck);

      // Beanie
      GeneralPath beanie = new GeneralPath();
      beanie.moveTo(820.916, 1186.03);
      beanie.lineTo(779.379, 1186.03);
      beanie.lineTo(795.894, 1170.92);
      beanie.lineTo(793.892, 1153.38);
      beanie.lineTo(804.902, 1114.88);
      beanie.lineTo(820.916, 1023.75);
      beanie.lineTo(830.425, 940.421);
      beanie.lineTo(840.934, 864.401);
      beanie.lineTo(846.939, 836.624);
      beanie.lineTo(828.423, 756.706);
      beanie.lineTo(833.928, 742.086);
      beanie.lineTo(838.932, 719.183);
      beanie.lineTo(823.919, 697.741);
      beanie.lineTo(827.922, 592.97);
      beanie.lineTo(827.922, 550.574);
      beanie.lineTo(826.421, 534.98);
      beanie.lineTo(836.93, 525.233);
      beanie.lineTo(398.039, 440.442);
      beanie.lineTo(431.069, 728.929);
      beanie.lineTo(422.061, 757.68);
      beanie.lineTo(391.033, 812.259);
      beanie.lineTo(395.537, 864.401);
      beanie.lineTo(382.025, 950.655);
      beanie.lineTo(384.027, 998.898);
      beanie.lineTo(376.52, 1054.45);
      beanie.lineTo(376.52, 1100.26);
      beanie.lineTo(371.015, 1139.73);
      beanie.lineTo(371.015, 1173.84);
      beanie.lineTo(365.01, 1187);
      beanie.lineTo(354, 1187);
      beanie.lineTo(358.504, 1130.47);
      beanie.lineTo(354, 1027.65);
      beanie.lineTo(371.015, 933.112);
      beanie.lineTo(371.015, 866.838);
      beanie.lineTo(371.015, 798.127);
      beanie.lineTo(363.508, 750.858);
      beanie.lineTo(354, 660.218);
      beanie.lineTo(354, 582.249);
      beanie.lineTo(363.508, 519.386);
      beanie.lineTo(376.52, 453.599);
      beanie.lineTo(376.52, 393.66);
      beanie.lineTo(392.034, 229.437);
      beanie.lineTo(387.029, 161.213);
      beanie.lineTo(440.577, 92.5025);
      beanie.lineTo(465.099, 108.584);
      beanie.lineTo(524.152, 92.5025);
      beanie.lineTo(547.673, 55.467);
      beanie.lineTo(595.215, 35);
      beanie.lineTo(646.761, 55.467);
      beanie.lineTo(679.79, 67.6497);
      beanie.lineTo(784.384, 80.8071);
      beanie.lineTo(841.434, 117.843);
      beanie.lineTo(853.946, 205.558);
      beanie.lineTo(884.473, 321.538);
      beanie.lineTo(903.49, 399.995);
      beanie.lineTo(915, 468.706);
      beanie.lineTo(915, 563.731);
      beanie.lineTo(915, 650.959);
      beanie.lineTo(884.473, 705.538);
      beanie.lineTo(870.961, 759.142);
      beanie.lineTo(848.441, 890.716);
      beanie.lineTo(830.425, 1070.53);
      beanie.lineTo(811.908, 1175.3);
      beanie.lineTo(820.916, 1186.03);
      beanie.closePath();
      g2d.setColor(Color.decode("#4F9535"));
      g2d.fill(beanie);
      g2d.setColor(Color.BLACK);
      g2d.draw(beanie);

      // Hair
      GeneralPath hair = new GeneralPath();
      hair.moveTo(844, 537.664);
      hair.lineTo(829.5, 540.164);
      hair.curveTo(828.233, 516.744, 831.052, 503.605, 838.5, 480.164);
      hair.curveTo(840.472, 443.337, 840.205, 421.775, 839.5, 383.164);
      hair.curveTo(833.594, 352.563, 833.655, 348.018, 823.5, 331.164);
      hair.curveTo(804.259, 334.671, 794.143, 327.543, 776, 316.164);
      hair.curveTo(758.248, 296.651, 749.409, 285.045, 726, 267.664);
      hair.curveTo(711.167, 287.03, 701.818, 297.297, 680, 312.664);
      hair.curveTo(672.548, 312.106, 668.926, 310.82, 663.5, 306.664);
      hair.curveTo(653.373, 312.142, 648.089, 315.789, 635.5, 317.664);
      hair.curveTo(626.998, 317.524, 624.043, 315.815, 620, 311.664);
      hair.curveTo(621.421, 308.614, 622.657, 307.859, 622, 303.164);
      hair.curveTo(611.514, 304.031, 607.818, 306.513, 598, 311.664);
      hair.curveTo(594.623, 309.734, 591.076, 309.641, 587, 307.664);
      hair.curveTo(570.411, 305.004, 560.871, 304.657, 541, 309.164);
      hair.curveTo(542.791, 309.333, 521.136, 328.319, 518, 327.664);
      hair.curveTo(514.864, 327.009, 514.149, 322.571, 515.5, 316.664);
      hair.curveTo(506.057, 312.459, 500.919, 311.535, 492, 312.164);
      hair.curveTo(483.539, 316.599, 471.5, 319.664, 472, 318.664);
      hair.curveTo(472.5, 317.664, 460.987, 317.909, 456, 323.164);
      hair.curveTo(435.431, 348.892, 427.975, 377.352, 416.5, 447.164);
      hair.curveTo(413.492, 480.851, 416.393, 502.78, 426.5, 545.164);
      hair.lineTo(412, 543.164);
      hair.curveTo(413.684, 561.103, 415.556, 570.776, 421, 587.164);
      hair.curveTo(428.778, 615.749, 431.201, 633.423, 433.5, 666.664);
      hair.curveTo(434.905, 708.954, 434.184, 726.195, 430.5, 746.664);
      hair.curveTo(403.789, 736.2, 395.891, 732.327, 376.5, 733.664);
      hair.curveTo(371.313, 713.018, 369.68, 701.576, 371.5, 681.664);
      hair.curveTo(371.711, 658.422, 372.083, 644.968, 371.5, 621.164);
      hair.curveTo(373.857, 587.835, 373.433, 569.556, 380, 522.664);
      hair.curveTo(392.085, 483.417, 396.852, 460.166, 404.5, 418.164);
      hair.curveTo(414.848, 367.59, 421.794, 339.095, 460, 298.164);
      hair.curveTo(504.192, 251.126, 537.897, 238.589, 618, 229.164);
      hair.curveTo(709.033, 220.361, 753.771, 226.558, 807.5, 283.664);
      hair.curveTo(842.857, 315.321, 856.33, 339.558, 857, 406.664);
      hair.curveTo(861.12, 454.837, 860.349, 482.847, 844, 537.664);
      hair.closePath();
      g2d.setColor(Color.decode("#4A515B"));
      g2d.fill(hair);
      g2d.setColor(Color.BLACK);
      g2d.draw(hair);

      // Face
      GeneralPath face = new GeneralPath();
      face.moveTo(625, 720.164);
      face.curveTo(523.5, 722.164, 452.787, 662.209, 426.5, 545.164);
      face.curveTo(416.393, 502.78, 413.492, 480.851, 416.5, 447.164);
      face.curveTo(427.975, 377.352, 435.431, 348.892, 456, 323.164);
      face.curveTo(460.987, 317.909, 472.5, 317.664, 472, 318.664);
      face.curveTo(471.5, 319.664, 483.539, 316.599, 492, 312.164);
      face.curveTo(500.919, 311.535, 506.057, 312.459, 515.5, 316.664);
      face.curveTo(514.149, 322.571, 514.864, 327.009, 518, 327.664);
      face.curveTo(521.136, 328.319, 542.791, 309.333, 541, 309.164);
      face.curveTo(560.871, 304.657, 570.411, 305.004, 587, 307.664);
      face.curveTo(591.076, 309.641, 594.623, 309.734, 598, 311.664);
      face.curveTo(607.818, 306.513, 611.514, 304.031, 622, 303.164);
      face.curveTo(622.657, 307.859, 621.421, 308.614, 620, 311.664);
      face.curveTo(624.043, 315.815, 626.998, 317.524, 635.5, 317.664);
      face.curveTo(648.088, 315.789, 653.373, 312.142, 663.5, 306.664);
      face.curveTo(668.926, 310.82, 672.548, 312.106, 680, 312.664);
      face.curveTo(701.818, 297.297, 711.167, 287.03, 726, 267.664);
      face.curveTo(749.409, 285.045, 758.248, 296.651, 776, 316.164);
      face.curveTo(794.143, 327.543, 804.259, 334.671, 823.5, 331.164);
      face.curveTo(833.655, 348.018, 833.594, 352.563, 839.5, 383.164);
      face.curveTo(840.205, 421.775, 840.472, 443.337, 838.5, 480.164);
      face.curveTo(831.052, 503.605, 828.233, 516.744, 829.5, 540.164);
      face.lineTo(807.5, 601.164);
      face.curveTo(759.384, 687.87, 717.316, 710.261, 625, 720.164);
      face.closePath();
      g2d.setColor(Color.decode("#C67E66"));
      g2d.fill(face);
      g2d.setColor(Color.BLACK);
      g2d.draw(face);

      // Eyebrows 1
      GeneralPath eyebrows1 = new GeneralPath();
      eyebrows1.moveTo(459, 376.664);
      eyebrows1.curveTo(449.342, 374.973, 444.882, 374.694, 440.5, 373.164);
      eyebrows1.curveTo(438.301, 369.909, 438.549, 367.322, 442, 361.164);
      eyebrows1.lineTo(459, 353.164);
      eyebrows1.curveTo(461.833, 350.831, 467.8, 345.764, 469, 344.164);
      eyebrows1.curveTo(470.2, 342.564, 485.833, 343.497, 493.5, 344.164);
      eyebrows1.curveTo(514.45, 342.624, 524.339, 344.539, 540.5, 350.164);
      eyebrows1.lineTo(553, 359.164);
      eyebrows1.curveTo(551.986, 365.465, 554.343, 368.161, 552, 373.164);
      eyebrows1.curveTo(541.698, 376.199, 536.701, 377.424, 528, 379.664);
      eyebrows1.lineTo(505.5, 371.56);
      eyebrows1.curveTo(495.486, 367.753, 481.83, 371.32, 469, 373.164);
      eyebrows1.curveTo(463.91, 375.353, 461.295, 376.793, 459, 376.664);
      eyebrows1.closePath();
      g2d.setColor(Color.decode("#4A515B"));
      g2d.fill(eyebrows1);
      g2d.setColor(Color.BLACK);
      g2d.draw(eyebrows1);

      // Eyebrows 2
      GeneralPath eyebrows2 = new GeneralPath();
      eyebrows2.moveTo(665, 365.664);
      eyebrows2.curveTo(658.181, 364.254, 654.584, 363.243, 650.5, 359.164);
      eyebrows2.curveTo(646.232, 360.163, 644.248, 360.173, 641.5, 359.164);
      eyebrows2.curveTo(639.345, 351.711, 640.86, 346.544, 641.5, 341.664);
      eyebrows2.lineTo(648.5, 338.664);
      eyebrows2.curveTo(654.99, 333.732, 659.278, 332.566, 667, 330.664);
      eyebrows2.curveTo(672.89, 330.326, 675.719, 328.153, 680.5, 323.164);
      eyebrows2.curveTo(700.222, 320.636, 712.646, 320.576, 734.5, 320.164);
      eyebrows2.curveTo(751.12, 332.794, 761.389, 331.187, 778.5, 351.164);
      eyebrows2.curveTo(776.586, 356.263, 776.754, 356.005, 774.5, 357.664);
      eyebrows2.curveTo(767.36, 352.035, 763.976, 350.54, 751.5, 347.164);
      eyebrows2.curveTo(744.813, 347.588, 740.31, 347, 737.5, 350.164);
      eyebrows2.curveTo(720.659, 350.883, 720.285, 352.368, 711, 353.164);
      eyebrows2.curveTo(699.037, 354.93, 680.89, 363.83, 682.5, 365.664);
      eyebrows2.curveTo(682.764, 365.965, 670.667, 365.664, 665, 365.664);
      eyebrows2.closePath();
      g2d.setColor(Color.decode("#4A515B"));
      g2d.fill(eyebrows2);
      g2d.setColor(Color.BLACK);
      g2d.draw(eyebrows2);

      // Eyes 1
      GeneralPath eyes1 = new GeneralPath();
      eyes1.moveTo(555.5, 425.164);
      eyes1.curveTo(559.175, 428.841, 558.937, 430.191, 555.5, 431.664);
      eyes1.lineTo(494.5, 431.664);
      eyes1.lineTo(491.5, 415.664);
      eyes1.lineTo(481, 420.164);
      eyes1.lineTo(482.5, 427.664);
      eyes1.curveTo(476.764, 428.85, 473.632, 429.574, 463.5, 427.664);
      eyes1.curveTo(461.256, 425.396, 461.269, 423.757, 463.5, 420.164);
      eyes1.curveTo(472.821, 411.717, 480.347, 409.064, 495.5, 406.664);
      eyes1.curveTo(503.804, 405.731, 508.992, 405.673, 519.5, 406.664);
      eyes1.curveTo(521.637, 404.498, 523.059, 403.466, 527.5, 403.164);
      eyes1.curveTo(541.118, 408.297, 547.468, 414.264, 555.5, 425.164);
      eyes1.closePath();
      g2d.setColor(Color.decode("#4A515B"));
      g2d.fill(eyes1);
      g2d.setColor(Color.BLACK);
      g2d.draw(eyes1);

      // Eyelid 1
      GeneralPath eyelid1 = new GeneralPath();
      eyelid1.moveTo(487.5, 431.664);
      eyelid1.lineTo(494.5, 431.664);
      eyelid1.lineTo(555.5, 431.664);
      eyelid1.curveTo(558.937, 430.191, 559.175, 428.841, 555.5, 425.164);
      eyelid1.curveTo(547.468, 414.264, 541.118, 408.297, 527.5, 403.164);
      eyelid1.curveTo(523.059, 403.466, 521.637, 404.498, 519.5, 406.664);
      eyelid1.curveTo(508.992, 405.673, 503.804, 405.731, 495.5, 406.664);
      eyelid1.curveTo(480.347, 409.064, 472.821, 411.717, 463.5, 420.164);
      eyelid1.curveTo(461.269, 423.757, 461.256, 425.396, 463.5, 427.664);
      eyelid1.curveTo(473.632, 429.574, 476.764, 428.85, 482.5, 427.664);
      eyelid1.lineTo(481, 420.164);
      eyelid1.lineTo(491.5, 415.664);
      eyelid1.lineTo(494.5, 431.664);
      eyelid1.closePath();
      g2d.setColor(Color.BLACK);
      g2d.draw(eyelid1);

      // Pupil 1
      GeneralPath pupil1 = new GeneralPath();
      pupil1.moveTo(524.5, 423.5);
      pupil1.curveTo(524.583, 419.849, 528.503, 417.05, 532, 416.5);
      pupil1.curveTo(535.98, 417.576, 536, 423, 536, 423);
      pupil1.curveTo(536, 423, 532.68, 428.138, 530.5, 427.664);
      pupil1.curveTo(526.528, 427.982, 523.968, 426.33, 524.5, 423.5);
      pupil1.closePath();
      g2d.setColor(Color.decode("#C67E66"));
      g2d.fill(pupil1);
      g2d.setColor(Color.BLACK);
      g2d.draw(pupil1);

      // Eyes 2
      GeneralPath eyes2 = new GeneralPath();
      eyes2.moveTo(669, 416.164);
      eyes2.curveTo(663.326, 418.948, 660.15, 420.057, 654.5, 420.664);
      eyes2.curveTo(654.067, 413.582, 656.734, 412.209, 664.5, 405.164);
      eyes2.curveTo(671.528, 399.221, 677.212, 398.666, 687, 396.664);
      eyes2.curveTo(697.444, 392.007, 704.213, 391.097, 718, 392.664);
      eyes2.curveTo(735.994, 397.388, 752.801, 398.742, 749, 407.664);
      eyes2.curveTo(747.493, 410.791, 746.075, 412.296, 740.5, 413.664);
      eyes2.curveTo(720.662, 415.39, 709.702, 414.371, 690.5, 413.664);
      eyes2.curveTo(687.385, 410.114, 686.421, 407.694, 686, 402.664);
      eyes2.curveTo(682.307, 402.876, 680.226, 403.722, 676.5, 406.164);
      eyes2.curveTo(674.042, 411.447, 672.312, 413.378, 669, 416.164);
      eyes2.closePath();
      g2d.setColor(Color.decode("#4A515B"));
      g2d.fill(eyes2);
      g2d.setColor(Color.BLACK);
      g2d.draw(eyes2);

      // Pupil 2
      GeneralPath pupil2 = new GeneralPath();
      pupil2.moveTo(717, 406.664);
      pupil2.curveTo(717.296, 404.514, 718.406, 403.755, 722, 403.164);
      pupil2.curveTo(725.326, 403.353, 726.634, 404.015, 726.5, 407.664);
      pupil2.curveTo(726.071, 409.81, 725.062, 410.449, 722, 410.664);
      pupil2.curveTo(718.135, 411.293, 716.863, 410.621, 717, 406.664);
      pupil2.closePath();
      g2d.setColor(Color.decode("#C67E66"));
      g2d.fill(pupil2);
      g2d.setColor(Color.BLACK);
      g2d.draw(pupil2);

      // Nose
      GeneralPath nose = new GeneralPath();
      nose.moveTo(634, 428.664);
      nose.curveTo(628.773, 449.369, 627.935, 461.187, 630.5, 482.664);
      nose.curveTo(635.003, 505.904, 642.304, 514.918, 663.5, 524.164);
      nose.moveTo(578.5, 433.664);
      nose.curveTo(579.829, 457.531, 579.993, 469.184, 578.5, 484.664);
      nose.curveTo(571.369, 503.466, 568.403, 513.011, 563.5, 529.664);
      g2d.setColor(Color.decode("#4A515B"));
      g2d.setStroke(new BasicStroke(5));
      g2d.draw(nose);

      // Nose 2
      GeneralPath nose2 = new GeneralPath();
      nose2.moveTo(577.5, 544.164);
      nose2.curveTo(567.866, 541.843, 563.643, 541.692, 562, 547.164);
      nose2.curveTo(565.414, 553.328, 571.194, 555.064, 586, 556.164);
      nose2.curveTo(593.551, 561.496, 597.824, 563.642, 605.5, 566.164);
      nose2.curveTo(622.248, 564.804, 630.693, 561.486, 644.5, 552.164);
      nose2.curveTo(656.355, 549.986, 658.681, 546.774, 662, 540.664);
      nose2.curveTo(653.671, 537.04, 648.076, 537.438, 636.5, 540.664);
      nose2.curveTo(623.011, 548.673, 614.532, 551.658, 598, 554.664);
      nose2.curveTo(589.237, 552.354, 584.607, 550.388, 577.5, 544.164);
      nose2.closePath();
      g2d.setColor(Color.decode("#4A515B"));
      g2d.fill(nose2);
      g2d.setColor(Color.BLACK);
      g2d.draw(nose2);

      // Mouth
      GeneralPath mouth = new GeneralPath();
      mouth.moveTo(533.5, 608.664);
      mouth.curveTo(528.128, 603.616, 528.365, 601.491, 535.5, 599.164);
      mouth.lineTo(622.5, 593.664);
      mouth.curveTo(652.487, 591.77, 706.5, 584.664, 708, 589.164);
      mouth.curveTo(709.5, 593.664, 666.596, 619.406, 615.5, 621.164);
      mouth.curveTo(583.088, 618.934, 563.961, 624.175, 533.5, 608.664);
      mouth.closePath();
      g2d.setColor(Color.decode("#4A515B"));
      g2d.fill(mouth);
      g2d.setColor(Color.BLACK);
      g2d.draw(mouth);

      // Beanie Mouth
      GeneralPath beanieMouth = new GeneralPath();
      beanieMouth.moveTo(471.5, 142.664);
      beanieMouth.curveTo(460.657, 144.299, 456.881, 143.06, 460.5, 131.164);
      beanieMouth.curveTo(507.538, 108.463, 539.627, 98.7501, 603, 84.664);
      beanieMouth.curveTo(649.026, 82.138, 671.144, 81.1762, 723.5, 89.664);
      beanieMouth.curveTo(727.263, 99.9939, 726.939, 103.941, 720, 106.164);
      beanieMouth.curveTo(675.277, 100.169, 648.132, 99.7754, 596.5, 103.664);
      beanieMouth.curveTo(535.027, 112.666, 514.338, 124.492, 471.5, 142.664);
      beanieMouth.closePath();
      g2d.setColor(Color.decode("#C67E66"));
      g2d.fill(beanieMouth);
      g2d.setColor(Color.BLACK);
      g2d.draw(beanieMouth);

      // Beanie Eye 1
      GeneralPath beanieEye1 = new GeneralPath();
      beanieEye1.moveTo(444, 83.164);
      beanieEye1.curveTo(442.356, 89.7221, 441.759, 93.1789, 447, 97.164);
      beanieEye1.curveTo(452.529, 102.536, 457.301, 104.872, 465.5, 109.164);
      beanieEye1.lineTo(522, 93.164);
      beanieEye1.lineTo(539, 66.664);
      beanieEye1.curveTo(543.262, 57.6066, 545.624, 52.5851, 559.5, 43.664);
      beanieEye1.curveTo(555.654, 30.9766, 552.062, 23.6401, 533.5, 8.66401);
      beanieEye1.curveTo(525.866, 0.381761, 518.956, -0.435963, 503.5, 2.66401);
      beanieEye1.curveTo(479.711, 8.46145, 466.79, 12.8361, 449.5, 36.164);
      beanieEye1.curveTo(445.635, 52.0606, 444.222, 62.0533, 444, 83.164);
      beanieEye1.closePath();
      g2d.setColor(Color.decode("#4A515B"));
      g2d.fill(beanieEye1);
      g2d.setColor(Color.BLACK);
      g2d.draw(beanieEye1);

      // Beanie Ring 1
      GeneralPath beanieRing1 = new GeneralPath();
      beanieRing1.moveTo(513, 18.664);
      beanieRing1.curveTo(505.302, 17.6878, 500.784, 17.6499, 491.5, 20.664);
      beanieRing1.curveTo(482.191, 21.6436, 478.946, 25.4191, 475, 35.164);
      beanieRing1.curveTo(471.589, 49.5839, 471.617, 57.1258, 478.5, 68.664);
      beanieRing1.curveTo(486.188, 73.3635, 490.949, 74.6249, 500.5, 73.664);
      beanieRing1.curveTo(509.604, 71.9465, 514.647, 70.0073, 523.5, 64.664);
      beanieRing1.curveTo(526.843, 58.2876, 528.398, 54.6073, 528.5, 47.164);
      beanieRing1.curveTo(528.509, 33.7338, 527.339, 26.6502, 513, 18.664);
      beanieRing1.closePath();
      g2d.setColor(Color.decode("#C67E66"));
      g2d.fill(beanieRing1);
      g2d.setColor(Color.BLACK);
      g2d.draw(beanieRing1);

      // Beanie Pupil 1
      GeneralPath beaniePupil1 = new GeneralPath();
      beaniePupil1.moveTo(501.5, 52.164);
      beaniePupil1.curveTo(493.643, 52.5059, 491.593, 51.5573, 492.5, 47.664);
      beaniePupil1.curveTo(495.515, 44.9181, 498.148, 44.2595, 504.5, 44.664);
      beaniePupil1.curveTo(511.632, 45.2413, 513.535, 46.9208, 515, 51.164);
      beaniePupil1.curveTo(510.409, 54.9807, 507.809, 55.8573, 501.5, 52.164);
      beaniePupil1.closePath();
      g2d.setColor(Color.decode("#4A515B"));
      g2d.fill(beaniePupil1);
      g2d.setColor(Color.BLACK);
      g2d.draw(beaniePupil1);

      // Beanie Eye 2
      GeneralPath beanieEye2 = new GeneralPath();
      beanieEye2.moveTo(687.5, 68.164);
      beanieEye2.lineTo(651.5, 55.164);
      beanieEye2.curveTo(655.937, 39.0917, 666.159, 31.8818, 685, 19.164);
      beanieEye2.curveTo(693.644, 16.1133, 696.301, 15.9181, 705.5, 16.664);
      beanieEye2.curveTo(693.763, 28.0769, 696.392, 34.0678, 698, 45.664);
      beanieEye2.curveTo(708.132, 54.971, 715.038, 58.4279, 728, 63.664);
      beanieEye2.curveTo(736.524, 62.7437, 741.434, 61.0455, 750.5, 55.164);
      beanieEye2.lineTo(757, 36.664);
      beanieEye2.curveTo(765.368, 44.0813, 770.25, 47.9624, 775, 60.664);
      beanieEye2.curveTo(779.766, 68.9031, 780.67, 73.7605, 780.5, 82.664);
      beanieEye2.lineTo(744.5, 77.164);
      beanieEye2.lineTo(687.5, 68.164);
      beanieEye2.closePath();
      g2d.setColor(Color.decode("#4A515B"));
      g2d.fill(beanieEye2);
      g2d.setColor(Color.BLACK);
      g2d.draw(beanieEye2);

      // Beanie Ring 2
      GeneralPath beanieRing2 = new GeneralPath();
      beanieRing2.moveTo(697, 35.164);
      beanieRing2.curveTo(696.985, 24.6981, 699.663, 20.8184, 707.5, 16.164);
      beanieRing2.curveTo(717.902, 13.1108, 723.823, 13.0377, 734.5, 15.164);
      beanieRing2.curveTo(747.728, 22.4428, 751.44, 27.4987, 757.5, 36.664);
      beanieRing2.curveTo(755.842, 44.223, 754, 48.0117, 750.5, 54.664);
      beanieRing2.curveTo(742.345, 60.965, 737.409, 63.1014, 727.5, 62.664);
      beanieRing2.curveTo(715.443, 58.9211, 710.556, 56.0286, 703.5, 50.164);
      beanieRing2.curveTo(696.272, 45.917, 695.653, 42.3561, 697, 35.164);
      beanieRing2.closePath();
      g2d.setColor(Color.decode("#C67E66"));
      g2d.fill(beanieRing2);
      g2d.setColor(Color.BLACK);
      g2d.draw(beanieRing2);

      // Beanie Pupil 2
      GeneralPath beaniePupil2 = new GeneralPath();
      beaniePupil2.moveTo(735.5, 39.664);
      beaniePupil2.curveTo(730.946, 38.9476, 728.933, 37.805, 726.5, 34.164);
      beaniePupil2.curveTo(724.925, 30.8372, 725.823, 30.1156, 729.5, 30.164);
      beaniePupil2.curveTo(734.495, 31.9166, 736.684, 33.0623, 738.5, 35.664);
      beaniePupil2.curveTo(739.299, 39.1958, 738.699, 40.1292, 735.5, 39.664);
      beaniePupil2.closePath();
      g2d.setColor(Color.decode("#4A515B"));
      g2d.fill(beaniePupil2);
      g2d.setColor(Color.BLACK);
      g2d.draw(beaniePupil2);
    }

    @Override
    public Dimension getPreferredSize() {
      int width = (int) (1280 * scale);
      int height = (int) (1257 * scale);
      return new Dimension(width, height);
    }
  }
}