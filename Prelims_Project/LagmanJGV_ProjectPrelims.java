import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class LagmanJGV_ProjectPrelims extends JFrame {
  public LagmanJGV_ProjectPrelims() {
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
    new LagmanJGV_ProjectPrelims();
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

      // Path 1
      GeneralPath shape1 = new GeneralPath();
      shape1.moveTo(505, 747.5);
      shape1.curveTo(505.45, 741.309, 505.306, 738.921, 500, 734.5);
      shape1.curveTo(501.949, 710.854, 497.327, 697.399, 488.668, 674.516);
      shape1.lineTo(500.5, 687.5);
      shape1.lineTo(508, 713.5);
      shape1.lineTo(528.5, 747.5);
      shape1.lineTo(536, 759);
      shape1.lineTo(577, 791);
      shape1.lineTo(631, 793);
      shape1.curveTo(667.024, 789.577, 682.409, 779.641, 707.5, 758);
      shape1.curveTo(710.629, 747.972, 713.152, 744.94, 724, 738.5);
      shape1.lineTo(729, 727);
      shape1.curveTo(726.041, 717.977, 727.993, 715.507, 737, 714.5);
      shape1.curveTo(735.98, 703.769, 739.084, 700.174, 746.5, 695.5);
      shape1.lineTo(752.5, 681.5);
      shape1.curveTo(769.509, 644.543, 781.602, 626.441, 804, 595);
      shape1.lineTo(817.5, 596.5);
      shape1.lineTo(817.5, 609.5);
      shape1.lineTo(816, 631.5);
      shape1.lineTo(819.5, 647);
      shape1.lineTo(822.5, 669);
      shape1.lineTo(822.5, 678.5);
      shape1.lineTo(832, 719);
      shape1.curveTo(831.512, 727.788, 824.349, 746.494, 824.012, 746.996);
      shape1.curveTo(824.159, 747.315, 825.53, 753.888, 823, 758);
      shape1.curveTo(823.921, 764.315, 824.68, 767.689, 830, 771);
      shape1.curveTo(829.999, 777.481, 822.992, 782.297, 823, 788);
      shape1.curveTo(810.042, 808.923, 805.504, 820.632, 799.5, 841.5);
      shape1.curveTo(776.317, 853.5, 760.701, 856.206, 732.5, 860.5);
      shape1.curveTo(726.143, 850.463, 724.802, 843.973, 726, 831);
      shape1.curveTo(728.947, 824.991, 731.463, 822.678, 740, 823.5);
      shape1.lineTo(742.5, 803);
      shape1.curveTo(732.042, 803.382, 726.106, 804.098, 715.5, 805.5);
      shape1.curveTo(708.483, 809.528, 706.604, 812.388, 705, 818);
      shape1.lineTo(661, 832.5);
      shape1.lineTo(629.5, 831);
      shape1.curveTo(624.437, 827.363, 622.939, 823.248, 621.5, 814);
      shape1.lineTo(599.5, 810.5);
      shape1.lineTo(596, 818);
      shape1.curveTo(575.395, 807.693, 563.908, 801.873, 541, 793);
      shape1.curveTo(537.704, 800.818, 536.825, 805.844, 537, 816);
      shape1.curveTo(551.954, 842.402, 558.595, 856.037, 552, 868);
      shape1.lineTo(522, 851.5);
      shape1.curveTo(517.87, 837.497, 514.433, 830.746, 508, 819);
      shape1.curveTo(508.141, 841.509, 506.561, 852.887, 499.5, 870);
      shape1.curveTo(499.682, 878.791, 507.163, 896.065, 509.5, 896.5);
      shape1.curveTo(509.893, 896.573, 500.333, 907.5, 498.5, 911.5);
      shape1.curveTo(492.947, 899.309, 485.515, 892.414, 483, 875.5);
      shape1.lineTo(488.5, 847);
      shape1.lineTo(499.5, 818.5);
      shape1.lineTo(505, 784);
      shape1.lineTo(505, 747.5);
      shape1.closePath();
      g2d.setColor(Color.decode("#C4744F"));
      g2d.fill(shape1);

      // Path 2
      GeneralPath shape2 = new GeneralPath();
      shape2.moveTo(101.5, 920.5);
      shape2.curveTo(40.9022, 1036.66, 23.556, 1102.58, 0, 1220.5);
      shape2.lineTo(1265.5, 1219);
      shape2.lineTo(1261.68, 998);
      shape2.curveTo(1261.68, 966.643, 1256.48, 949.788, 1242, 921);
      shape2.curveTo(1222.25, 896.214, 1209.12, 884.388, 1185.5, 863.5);
      shape2.curveTo(1074.59, 803.919, 1010.3, 771.259, 866, 723.5);
      shape2.curveTo(861.364, 762.554, 853.748, 782.459, 846, 823);
      shape2.curveTo(824.444, 874.232, 807.821, 900.681, 770.5, 944);
      shape2.curveTo(731.586, 991.424, 701.246, 1007.42, 619, 1014.5);
      shape2.curveTo(553.882, 1004.26, 532.168, 977.021, 502, 921);
      shape2.curveTo(493.165, 897.649, 489.885, 883.689, 487.5, 857);
      shape2.curveTo(491.589, 821.176, 494.647, 805.579, 504, 748.5);
      shape2.curveTo(503.889, 744.391, 502.434, 742.346, 495.5, 739.5);
      shape2.curveTo(470.806, 744.823, 459.315, 749.88, 439.5, 759.5);
      shape2.curveTo(428.994, 763.708, 422.513, 765.224, 418, 778);
      shape2.lineTo(361.5, 798);
      shape2.curveTo(316.394, 807.451, 289.918, 817.839, 241.5, 841.5);
      shape2.curveTo(171.254, 874.506, 138.405, 892.108, 101.5, 920.5);
      shape2.closePath();
      g2d.setColor(Color.decode("#4A515B"));
      g2d.fill(shape2);

      // Path 3
      GeneralPath shape3 = new GeneralPath();
      shape3.moveTo(180, 1128.5);
      shape3.curveTo(173.036, 1112.22, 169.858, 1103.15, 175.5, 1088);
      shape3.curveTo(195.345, 1121.58, 195.636, 1140.7, 201.5, 1172);
      shape3.curveTo(205.234, 1190.08, 206.542, 1200.36, 201.5, 1220);
      shape3.lineTo(177.5, 1220);
      shape3.curveTo(178.121, 1205.55, 177.193, 1197.75, 175.583, 1184.2);
      shape3.closePath();
      g2d.setColor(Color.decode("#2F3237"));
      g2d.fill(shape3);

      // Path 4
      GeneralPath shape4 = new GeneralPath();
      shape4.moveTo(272.5, 1168);
      shape4.curveTo(274.925, 1188.88, 274.164, 1199.92, 274, 1220);
      shape4.lineTo(210.5, 1220);
      shape4.curveTo(208.667, 1201.07, 210.2, 1191.15, 215, 1174);
      shape4.lineTo(223, 1139);
      shape4.lineTo(232.5, 1093);
      shape4.lineTo(237.5, 1038);
      shape4.curveTo(239.576, 1017.5, 241.635, 1006.35, 250.5, 988.5);
      shape4.curveTo(250.553, 958.351, 250.226, 941.037, 256.5, 910.5);
      shape4.curveTo(262.554, 920.906, 265.372, 927.038, 265.5, 940.5);
      shape4.curveTo(270.703, 962.631, 271.925, 974.803, 274, 996.5);
      shape4.curveTo(273.492, 1009.33, 272.62, 1016.46, 269, 1029);
      shape4.curveTo(267.286, 1059.35, 266.62, 1076.28, 267, 1106);
      shape4.lineTo(265.5, 1159.5);
      shape4.lineTo(265.69, 1159.58);
      shape4.curveTo(269.214, 1161.09, 271.247, 1161.96, 272.5, 1168);
      shape4.closePath();
      g2d.setColor(Color.decode("#2F3237"));
      g2d.fill(shape4);

      // Path 5
      GeneralPath shape5 = new GeneralPath();
      shape5.moveTo(304, 929);
      shape5.curveTo(305.303, 905.035, 305.65, 891.249, 305, 865.5);
      shape5.curveTo(313.691, 879.156, 317.649, 890.001, 320.5, 924);
      shape5.curveTo(322.879, 953.321, 322.258, 966.567, 319.5, 987.5);
      shape5.curveTo(317.864, 1024.97, 319.04, 1047.03, 309.5, 1080.5);
      shape5.curveTo(304.497, 1080.1, 302.621, 1078.53, 301.5, 1072.5);
      shape5.lineTo(301.5, 994);
      shape5.curveTo(299.934, 968.23, 300.202, 953.956, 304, 929);
      shape5.closePath();
      g2d.setColor(Color.decode("#2F3237"));
      g2d.fill(shape5);

      // Path 6
      GeneralPath shape6 = new GeneralPath();
      shape6.moveTo(304.5, 1097.5);
      shape6.lineTo(307, 1093);
      shape6.lineTo(311, 1094.5);
      shape6.lineTo(312, 1101.5);
      shape6.lineTo(307, 1107.5);
      shape6.lineTo(304.5, 1106);
      shape6.lineTo(304.5, 1097.5);
      shape6.closePath();
      g2d.setColor(Color.decode("#2F3237"));
      g2d.fill(shape6);

      // Path 7
      GeneralPath shape7 = new GeneralPath();
      shape7.moveTo(378, 1041.5);
      shape7.curveTo(379.695, 1034.29, 380.811, 1030.48, 386.5, 1029);
      shape7.curveTo(391.361, 1031.44, 391.064, 1037.79, 390, 1050);
      shape7.lineTo(384, 1062);
      shape7.lineTo(384, 1074);
      shape7.curveTo(385.058, 1081.74, 385.445, 1086.14, 384, 1094.5);
      shape7.curveTo(382.84, 1098.9, 382.405, 1101.41, 382.5, 1106);
      shape7.curveTo(380.766, 1109.16, 379.43, 1109.87, 377, 1111);
      shape7.curveTo(373.145, 1100.06, 372.72, 1086.51, 378, 1064.5);
      shape7.curveTo(376.843, 1055.52, 377.233, 1050.48, 378, 1041.5);
      shape7.closePath();
      g2d.setColor(Color.decode("#2F3237"));
      g2d.fill(shape7);

      // Path 8
      GeneralPath shape8 = new GeneralPath();
      shape8.moveTo(385.5, 1019.5);
      shape8.curveTo(384.917, 1017.44, 384.833, 1016.35, 388.5, 1015.5);
      shape8.curveTo(391.712, 1015.45, 392.401, 1016.28, 392, 1019);
      shape8.curveTo(391.513, 1021.41, 391.132, 1022.66, 388.5, 1023);
      shape8.curveTo(386.573, 1022.89, 385.899, 1022.15, 385.5, 1019.5);
      shape8.closePath();
      g2d.setColor(Color.decode("#2F3237"));
      g2d.fill(shape8);

      // Path 9
      GeneralPath shape9 = new GeneralPath();
      shape9.moveTo(146, 1148);
      shape9.curveTo(145.2, 1145.6, 148.333, 1144, 150, 1143.5);
      shape9.curveTo(153, 1143.5, 154.5, 1146, 155.5, 1148);
      shape9.curveTo(156.5, 1150, 152.5, 1152.5, 150, 1153);
      shape9.curveTo(147.5, 1153.5, 147, 1151, 146, 1148);
      shape9.closePath();
      g2d.setColor(Color.decode("#2F3237"));
      g2d.fill(shape9);

      // Path 10
      GeneralPath shape10 = new GeneralPath();
      shape10.moveTo(339.5, 855);
      shape10.curveTo(337.142, 849.237, 336.816, 845.623, 338, 838.5);
      shape10.curveTo(343.076, 841.607, 345.691, 843.699, 347, 852.5);
      shape10.curveTo(347.161, 859.213, 346.753, 862.09, 344.5, 864.5);
      shape10.curveTo(341.455, 861.835, 340.39, 859.726, 339.5, 855);
      shape10.closePath();
      g2d.setColor(Color.decode("#2F3237"));
      g2d.fill(shape10);

      // Path 11
      GeneralPath shape11 = new GeneralPath();
      shape11.moveTo(395, 827);
      shape11.curveTo(395.94, 811.674, 396.311, 802.985, 406, 793);
      shape11.curveTo(412.372, 799.048, 411.931, 801.158, 414, 805);
      shape11.lineTo(409, 815.5);
      shape11.curveTo(405.97, 825.136, 405.235, 831.312, 406, 844);
      shape11.curveTo(403.182, 847.929, 401.485, 849.761, 397.5, 850);
      shape11.curveTo(392.117, 844.511, 393.292, 837.372, 394.977, 827.137);
      shape11.closePath();
      g2d.setColor(Color.decode("#2F3237"));
      g2d.fill(shape11);

      // Path 12
      GeneralPath shape12 = new GeneralPath();
      shape12.moveTo(421.245, 780.49);
      shape12.lineTo(421, 780.5);
      shape12.curveTo(434.285, 775.721, 441.813, 773.74, 455.5, 772.5);
      shape12.curveTo(451.402, 776.651, 448.92, 778.783, 443, 781);
      shape12.curveTo(440.203, 781.341, 438.861, 781.265, 437, 780.5);
      shape12.curveTo(430.326, 780.128, 427.016, 780.26, 421.245, 780.49);
      shape12.closePath();
      g2d.setColor(Color.decode("#2F3237"));
      g2d.fill(shape12);

      // Path 13
      GeneralPath shape13 = new GeneralPath();
      shape13.moveTo(447.5, 833);
      shape13.curveTo(440.533, 819.754, 442.49, 805.997, 452, 788.5);
      shape13.curveTo(454.15, 790.128, 454.709, 791.758, 454.5, 796);
      shape13.curveTo(456.505, 794.751, 457.406, 794.581, 458.5, 795.5);
      shape13.curveTo(464.3, 803.241, 463.155, 807.65, 462, 815.5);
      shape13.curveTo(460.856, 831.343, 458.676, 836.411, 454, 843.5);
      shape13.curveTo(452.399, 840.745, 451.52, 839.128, 451, 832);
      shape13.lineTo(447.5, 833);
      shape13.closePath();
      g2d.setColor(Color.decode("#2F3237"));
      g2d.fill(shape13);

      // Path 14
      GeneralPath shape14 = new GeneralPath();
      shape14.moveTo(491.5, 758);
      shape14.curveTo(494.242, 751.956, 496.519, 749.412, 502, 746.5);
      shape14.curveTo(505.953, 756.949, 504.631, 764.099, 500.5, 777.5);
      shape14.lineTo(494, 807);
      shape14.curveTo(492.183, 838.187, 491.149, 855.484, 487.5, 865);
      shape14.curveTo(483.638, 844.567, 481.578, 833.019, 487.5, 804);
      shape14.curveTo(490.326, 788.146, 492.024, 779.446, 491.5, 758);
      shape14.closePath();
      g2d.setColor(Color.decode("#2F3237"));
      g2d.fill(shape14);

      // Path 15
      GeneralPath shape15 = new GeneralPath();
      shape15.moveTo(511.5, 974);
      shape15.curveTo(492.906, 964.491, 486.544, 954.325, 479, 932);
      shape15.lineTo(481, 931);
      shape15.curveTo(493.908, 949.889, 503.931, 956.698, 511.5, 974);
      shape15.closePath();
      g2d.setColor(Color.decode("#2F3237"));
      g2d.fill(shape15);

      // Path 16
      GeneralPath shape16 = new GeneralPath();
      shape16.moveTo(494, 933);
      shape16.curveTo(492.576, 924.687, 493.375, 921.096, 497.5, 916.5);
      shape16.curveTo(501.164, 916.154, 502.288, 916.479, 503.5, 917.5);
      shape16.curveTo(512.861, 930.513, 516.691, 939.312, 524, 954.5);
      shape16.curveTo(526.619, 960.251, 527.591, 963.363, 527.5, 968.5);
      shape16.curveTo(518.676, 966.926, 515.302, 961.73, 510, 950.5);
      shape16.curveTo(502.575, 946.15, 499.213, 942.02, 494, 933);
      shape16.closePath();
      g2d.setColor(Color.decode("#2F3237"));
      g2d.fill(shape16);

      // Path 17
      GeneralPath shape17 = new GeneralPath();
      shape17.moveTo(908.5, 1080);
      shape17.curveTo(938.685, 1001.25, 960.962, 952.862, 1011.5, 858);
      shape17.curveTo(1001.3, 893.447, 968.906, 958.424, 919.5, 1068.5);
      shape17.curveTo(904.945, 1124.26, 890.429, 1184.64, 880, 1205.5);
      shape17.curveTo(888.296, 1157.65, 892.488, 1131.01, 908.5, 1080);
      shape17.closePath();
      g2d.setColor(Color.decode("#2F3237"));
      g2d.fill(shape17);

      // Path 18
      GeneralPath shape18 = new GeneralPath();
      shape18.moveTo(888, 730.5);
      shape18.curveTo(877.352, 728.508, 873.902, 729.556, 869, 732.5);
      shape18.lineTo(869, 743.5);
      shape18.lineTo(858.5, 755);
      shape18.curveTo(857.643, 765.916, 857.552, 771.832, 861, 780.5);
      shape18.curveTo(858.084, 789.106, 857.019, 793.775, 861, 800.5);
      shape18.curveTo(856.482, 811.532, 856.608, 817.497, 858.5, 828);
      shape18.curveTo(851.56, 821.882, 848.392, 819.233, 845.5, 815);
      shape18.curveTo(840.235, 815.578, 838.928, 816.233, 837.5, 817);
      shape18.lineTo(838, 830.5);
      shape18.lineTo(826, 832);
      shape18.curveTo(823.205, 832.593, 821.214, 831.077, 820, 829.5);
      shape18.lineTo(827.5, 830.5);
      shape18.lineTo(829.5, 832);
      shape18.lineTo(834, 832);
      shape18.curveTo(834.309, 831.164, 834.919, 831.267, 836.5, 832);
      shape18.curveTo(839.488, 832.222, 843.66, 835.883, 850, 835.5);
      shape18.curveTo(853.196, 835.079, 853.764, 834.553, 856.5, 835.5);
      shape18.curveTo(858.33, 835.082, 863.633, 837.706, 866, 840);
      shape18.lineTo(885, 840);
      shape18.lineTo(886, 831);
      shape18.curveTo(888.908, 823.934, 889.111, 819.895, 895, 814);
      shape18.curveTo(900.016, 804.083, 909.949, 791.87, 917, 786);
      shape18.curveTo(922.213, 782.686, 926.728, 781.593, 934.5, 778.5);
      shape18.lineTo(933, 788);
      shape18.curveTo(922.94, 788.932, 920.575, 790.352, 915, 796.5);
      shape18.curveTo(911.75, 800.334, 911.283, 802.59, 908.5, 806);
      shape18.curveTo(906.18, 800.295, 903.5, 798.184, 895, 792.5);
      shape18.lineTo(890.5, 785);
      shape18.lineTo(890, 783);
      shape18.lineTo(898, 780);
      shape18.lineTo(898, 774);
      shape18.curveTo(899.207, 771.88, 899.828, 769.932, 903.5, 765);
      shape18.lineTo(903.5, 755);
      shape18.lineTo(888, 730.5);
      shape18.closePath();
      g2d.setColor(Color.decode("#2F3237"));
      g2d.fill(shape18);

      // Path 20
      GeneralPath shape20 = new GeneralPath();
      shape20.moveTo(732, 1220);
      shape20.curveTo(747.769, 1187.63, 756.867, 1171.28, 769, 1113.5);
      shape20.curveTo(783.296, 1069.55, 790.37, 1039.99, 808.874, 1018);
      shape20.lineTo(807.5, 1042);
      shape20.curveTo(776.42, 1114.38, 764.17, 1152.98, 739.5, 1220);
      shape20.lineTo(732, 1220);
      shape20.closePath();
      g2d.setColor(Color.decode("#2F3237"));
      g2d.fill(shape20);

      // Path 21
      GeneralPath shape21 = new GeneralPath();
      shape21.moveTo(709, 1007.5);
      shape21.curveTo(753.328, 982.613, 777.64, 966.95, 818, 929.5);
      shape21.lineTo(816.5, 935);
      shape21.curveTo(777.262, 975.55, 753.101, 988.599, 709, 1007.5);
      shape21.closePath();
      g2d.setColor(Color.decode("#2F3237"));
      g2d.fill(shape21);

      // Path 22
      GeneralPath shape22 = new GeneralPath();
      shape22.moveTo(1070.5, 1114.5);
      shape22.curveTo(1083.4, 1098.23, 1090.15, 1083.92, 1104.5, 1083.5);
      shape22.curveTo(1111.98, 1084.28, 1107.72, 1090.75, 1097, 1104.5);
      shape22.curveTo(1085.92, 1132, 1079.67, 1145.7, 1068.5, 1168);
      shape22.curveTo(1064.54, 1180.97, 1063.22, 1188.49, 1065, 1203);
      shape22.curveTo(1062.37, 1209.17, 1060.7, 1212.81, 1057, 1220);
      shape22.lineTo(1050, 1220);
      shape22.curveTo(1048.86, 1203.03, 1045.79, 1190.83, 1057, 1187.5);
      shape22.curveTo(1059.87, 1164.96, 1060.64, 1151.31, 1057, 1121);
      shape22.curveTo(1060.76, 1115.43, 1063.16, 1112.88, 1070.5, 1114.5);
      shape22.closePath();
      g2d.setColor(Color.decode("#2F3237"));
      g2d.fill(shape22);

      // Path 23
      GeneralPath shape23 = new GeneralPath();
      shape23.moveTo(1173.5, 1013.5);
      shape23.curveTo(1141.68, 1095.3, 1124.37, 1141.41, 1085.5, 1220);
      shape23.lineTo(1081.5, 1220);
      shape23.curveTo(1112.34, 1135.52, 1132.4, 1085.6, 1173.5, 1013.5);
      shape23.closePath();
      g2d.setColor(Color.decode("#2F3237"));
      g2d.fill(shape23);

      // Path 24
      GeneralPath shape24 = new GeneralPath();
      shape24.moveTo(1136, 1220);
      shape24.curveTo(1148.09, 1187.61, 1155.91, 1175.37, 1172, 1165.5);
      shape24.curveTo(1161.39, 1186.25, 1154.66, 1198.26, 1142, 1220);
      shape24.lineTo(1136, 1220);
      shape24.closePath();
      g2d.setColor(Color.decode("#2F3237"));
      g2d.fill(shape24);

      // Path 25
      GeneralPath shape25 = new GeneralPath();
      shape25.moveTo(526, 963.5);
      shape25.curveTo(514.357, 942.607, 505.686, 931.316, 497.5, 911.5);
      shape25.lineTo(504.5, 897);
      shape25.curveTo(500.49, 888.372, 499.701, 883.049, 497.5, 872.5);
      shape25.curveTo(503.239, 853.075, 505.273, 841.077, 505.5, 816.5);
      shape25.curveTo(512.908, 828.636, 519.63, 832.162, 522.5, 845);
      shape25.lineTo(547.5, 863);
      shape25.curveTo(553.641, 864.089, 550.486, 865.309, 552.5, 857);
      shape25.curveTo(547.735, 838.068, 543.279, 828.767, 531.5, 815);
      shape25.curveTo(530.866, 806.584, 537.318, 796.016, 541.5, 787);
      shape25.curveTo(572.928, 803.077, 603.927, 822.267, 603, 803.5);
      shape25.curveTo(617.885, 805.702, 623.725, 813.222, 624, 820);
      shape25.curveTo(629.783, 828.953, 632.266, 829.168, 650, 828.5);
      shape25.curveTo(679.052, 827.833, 690.839, 820.957, 710, 806);
      shape25.curveTo(721.864, 801.554, 731.398, 802.548, 744.5, 803.5);
      shape25.curveTo(743.204, 810.181, 745.182, 816.391, 747.5, 823.5);
      shape25.curveTo(740.482, 823.331, 737.843, 826.172, 733.5, 830);
      shape25.curveTo(730.31, 844.289, 724.507, 843.863, 731, 855.907);
      shape25.curveTo(751.891, 855.027, 760.409, 852.015, 780.5, 844.907);
      shape25.curveTo(792.471, 841.2, 796.687, 842.077, 802.5, 818);
      shape25.curveTo(807.093, 805.456, 815.639, 790.559, 828.5, 779.5);
      shape25.lineTo(845.5, 787);
      shape25.curveTo(846.357, 793.402, 847.461, 805.339, 846.5, 811);
      shape25.lineTo(839.5, 820);
      shape25.curveTo(843.087, 834.97, 834.397, 841.515, 834, 854.5);
      shape25.curveTo(816.581, 891.211, 804.64, 907.713, 783, 936.5);
      shape25.curveTo(741.074, 986.553, 708.158, 1004.46, 631, 1016.5);
      shape25.curveTo(578.615, 1014.38, 557.977, 997.453, 526, 963.5);
      shape25.closePath();
      g2d.setColor(Color.decode("#D79173"));
      g2d.fill(shape25);

      // Path 26
      GeneralPath shape26 = new GeneralPath();
      shape26.moveTo(662, 808.5);
      shape26.lineTo(652, 813);
      shape26.curveTo(647.947, 814.26, 647.566, 817.205, 646.5, 822);
      shape26.curveTo(656.575, 823.447, 662.2, 824.028, 671.5, 818);
      shape26.lineTo(671.5, 815);
      shape26.curveTo(669.352, 812.023, 668.32, 810.305, 662, 808.5);
      shape26.closePath();
      g2d.setColor(Color.decode("#D79173"));
      g2d.fill(shape26);

      // Path 27
      GeneralPath shape27 = new GeneralPath();
      shape27.moveTo(437, 610);
      shape27.curveTo(426.247, 586.15, 423.785, 570.833, 418.5, 544);
      shape27.curveTo(425.401, 569.24, 429.015, 583.487, 440.5, 607);
      shape27.curveTo(455.733, 626.838, 464.168, 638.24, 483, 648.5);
      shape27.lineTo(526.5, 692.5);
      shape27.curveTo(539.654, 702.557, 548.21, 706.42, 568, 706.5);
      shape27.curveTo(584.07, 695.485, 593.148, 693.828, 609.5, 701.5);
      shape27.lineTo(622, 701.5);
      shape27.curveTo(629.071, 689.771, 630.962, 694.304, 634.5, 701.5);
      shape27.curveTo(651.51, 696.285, 661.025, 697.405, 678, 699);
      shape27.curveTo(711.785, 683.455, 729.84, 672.352, 758.5, 643);
      shape27.curveTo(772.44, 631.24, 779.42, 622.975, 790.5, 605.5);
      shape27.curveTo(793.662, 597.92, 793.424, 592.34, 803, 589);
      shape27.curveTo(804.193, 592.264, 803.997, 594.276, 803, 598);
      shape27.curveTo(777.237, 634.952, 762.442, 655.565, 748.5, 696);
      shape27.curveTo(740.689, 702.965, 739.114, 707.914, 737, 717);
      shape27.curveTo(727.814, 719.282, 728.365, 723.703, 731, 732.5);
      shape27.curveTo(718.315, 742.785, 713.545, 749.186, 706.5, 761);
      shape27.curveTo(696.248, 775.878, 687.579, 779.227, 672, 785);
      shape27.curveTo(633.428, 801.204, 612.066, 798.834, 574, 793);
      shape27.curveTo(552.194, 777.904, 542.665, 767.199, 527, 747);
      shape27.curveTo(512.189, 730.933, 507.827, 717.546, 502, 691.5);
      shape27.curveTo(495.825, 679.013, 490.015, 672.354, 479.5, 660.5);
      shape27.curveTo(460.558, 647.53, 452.069, 634.123, 437, 610);
      shape27.closePath();
      g2d.setColor(Color.decode("#895033"));
      g2d.fill(shape27);

      // Path 28
      GeneralPath shape28 = new GeneralPath();
      shape28.moveTo(504, 747);
      shape28.curveTo(499.619, 743.894, 497.682, 742.048, 495.5, 738.5);
      shape28.curveTo(494.622, 736.687, 495.5, 736.5, 498, 734.5);
      shape28.curveTo(500.5, 732.5, 505.098, 741.203, 506.5, 747);
      shape28.curveTo(507.974, 758.361, 509.758, 764.499, 506.5, 777);
      shape28.curveTo(502.228, 813.03, 497.568, 832.451, 489, 867);
      shape28.curveTo(491.741, 820.896, 494.407, 794.689, 504, 747);
      shape28.closePath();
      g2d.setColor(Color.decode("#894F37"));
      g2d.fill(shape28);

      // Path 29
      GeneralPath shape29 = new GeneralPath();
      shape29.moveTo(809, 698);
      shape29.curveTo(815.04, 697.524, 818.294, 698.455, 824, 701);
      shape29.curveTo(826.755, 711.53, 826.7, 715.861, 825.5, 722.5);
      shape29.lineTo(813.5, 722);
      shape29.curveTo(809.352, 713.914, 808.629, 708.518, 809, 698);
      shape29.closePath();
      g2d.setColor(Color.decode("#894F37"));
      g2d.fill(shape29);

      // Path 30
      GeneralPath shape30 = new GeneralPath();
      shape30.moveTo(804.5, 586.5);
      shape30.curveTo(806.395, 565.476, 813.801, 557.598, 821, 536);
      shape30.lineTo(826, 544.5);
      shape30.curveTo(826.714, 555.02, 826.123, 560.931, 823, 571.5);
      shape30.curveTo(818.853, 576.532, 824.706, 579.643, 828, 586.5);
      shape30.curveTo(822.993, 599.431, 826.102, 604.991, 827, 614.5);
      shape30.curveTo(826.187, 639.401, 820.361, 648.678, 824, 675.5);
      shape30.curveTo(819.659, 681.022, 813.992, 682.412, 808.5, 679.5);
      shape30.curveTo(806.304, 669.877, 807.51, 646.98, 808.5, 644.5);
      shape30.curveTo(809.301, 642.493, 801.719, 619.833, 803, 610.5);
      shape30.curveTo(802.3, 600.863, 802.642, 595.611, 804.5, 586.5);
      shape30.closePath();
      g2d.setColor(Color.decode("#DB9174"));
      g2d.fill(shape30);

      // Path 31
      GeneralPath shape31 = new GeneralPath();
      shape31.moveTo(808, 591);
      shape31.lineTo(803.5, 591);
      shape31.lineTo(780.5, 628.5);
      shape31.lineTo(748.5, 667.5);
      shape31.lineTo(692, 703.5);
      shape31.lineTo(604.5, 712.5);
      shape31.lineTo(552, 712.5);
      shape31.lineTo(523, 692);
      shape31.lineTo(485.5, 658);
      shape31.lineTo(436, 608);
      shape31.lineTo(406.5, 520.5);
      shape31.lineTo(406.5, 424.5);
      shape31.lineTo(422.5, 355);
      shape31.lineTo(498, 254.5);
      shape31.lineTo(576.5, 240.5);
      shape31.lineTo(727.5, 228.5);
      shape31.lineTo(854.5, 313.5);
      shape31.lineTo(819, 557.5);
      shape31.lineTo(808, 591);
      shape31.closePath();
      g2d.setColor(Color.decode("#C4744F"));
      g2d.fill(shape31);

      // Path 32
      GeneralPath shape32 = new GeneralPath();
      shape32.moveTo(494, 553.5);
      shape32.curveTo(499.178, 539.718, 502.815, 532.268, 516, 521.5);
      shape32.curveTo(520.3, 521.519, 520.895, 522.968, 519.5, 527.5);
      shape32.curveTo(504.438, 549.448, 499.258, 554.208, 494, 553.5);
      shape32.closePath();
      g2d.setColor(Color.decode("#895033"));
      g2d.fill(shape32);

      // Path 33
      GeneralPath shape33 = new GeneralPath();
      shape33.moveTo(670.5, 506.5);
      shape33.curveTo(669.496, 500.686, 668.25, 499.396, 664.5, 501.5);
      shape33.curveTo(663.806, 514.442, 662.785, 521.58, 654, 533);
      shape33.lineTo(629, 533);
      shape33.curveTo(620.29, 537.38, 615.42, 539.837, 608.5, 544.5);
      shape33.curveTo(588.593, 547.782, 578.275, 545.765, 561, 537);
      shape33.curveTo(546.853, 535.686, 546.458, 538.201, 543, 541.5);
      shape33.curveTo(545.433, 551.337, 555.242, 553.35, 575, 556);
      shape33.curveTo(585.113, 559.608, 587.425, 563.154, 591.5, 569.5);
      shape33.curveTo(596.829, 571.169, 600.942, 570.67, 608.5, 569.5);
      shape33.curveTo(624.317, 557.052, 635.441, 552.289, 656, 544.5);
      shape33.curveTo(662.117, 538.856, 665.266, 530.02, 670.5, 506.5);
      shape33.closePath();
      g2d.setColor(Color.decode("#895033"));
      g2d.fill(shape33);

      // Path 34
      GeneralPath shape34 = new GeneralPath();
      shape34.moveTo(679, 442);
      shape34.curveTo(662.324, 441.06, 657.531, 438.195, 655, 430);
      shape34.lineTo(655.367, 429.968);
      shape34.curveTo(664.316, 429.198, 669.446, 428.756, 680.5, 433.5);
      shape34.curveTo(698.67, 433.798, 709.642, 433.844, 719, 435.5);
      shape34.curveTo(712.422, 442.177, 703.188, 443.382, 679, 442);
      shape34.closePath();
      g2d.setColor(Color.decode("#895033"));
      g2d.fill(shape34);

      // Path 35
      GeneralPath shape35 = new GeneralPath();
      shape35.moveTo(513.5, 456);
      shape35.curveTo(501.5, 458.976, 495.815, 459.224, 488, 456.5);
      shape35.curveTo(484.728, 450.795, 494.737, 446.902, 529, 439);
      shape35.curveTo(536.716, 437.55, 535.687, 439.448, 535.5, 442);
      shape35.curveTo(532.972, 450.152, 527.241, 452.812, 513.5, 456);
      shape35.closePath();
      g2d.setColor(Color.decode("#895033"));
      g2d.fill(shape35);

      // Path 36
      GeneralPath shape36 = new GeneralPath();
      shape36.moveTo(432.5, 373);
      shape36.curveTo(432.697, 362.405, 435.346, 356.644, 449, 347);
      shape36.curveTo(453.985, 346.324, 456.742, 345.25, 461.5, 340.5);
      shape36.lineTo(474.5, 339);
      shape36.lineTo(494.5, 339);
      shape36.curveTo(500.209, 335.097, 502.934, 334.726, 506.5, 339);
      shape36.lineTo(516.5, 340.5);
      shape36.lineTo(543, 349);
      shape36.curveTo(548.072, 351.844, 550.327, 353.697, 547.5, 360);
      shape36.curveTo(548.043, 364.911, 547.875, 367.469, 547.5, 372);
      shape36.lineTo(549, 386);
      shape36.curveTo(552.564, 390.773, 553.764, 393.232, 560, 399.5);
      shape36.lineTo(560, 409.5);
      shape36.lineTo(543, 405.5);
      shape36.lineTo(550.5, 426);
      shape36.lineTo(545, 430);
      shape36.lineTo(481.5, 428);
      shape36.curveTo(464.065, 426.035, 452.441, 425.452, 451, 419);
      shape36.curveTo(454.753, 412.072, 465.768, 407.436, 486, 402.5);
      shape36.lineTo(508.5, 401);
      shape36.curveTo(514.756, 397.595, 515.562, 395.255, 516.5, 391);
      shape36.curveTo(507.914, 381.973, 495.038, 382.751, 469.5, 386);
      shape36.lineTo(469.5, 383);
      shape36.curveTo(479.468, 377.808, 485.039, 374.975, 494.5, 372);
      shape36.curveTo(488.958, 370.759, 483.74, 370.098, 469.5, 369);
      shape36.curveTo(454.84, 374.406, 446.765, 374.799, 432.5, 373);
      shape36.closePath();
      g2d.setColor(Color.decode("#895033"));
      g2d.fill(shape36);

      // Path 37
      GeneralPath shape37 = new GeneralPath();
      shape37.moveTo(631.5, 340.5);
      shape37.lineTo(634, 331.5);
      shape37.lineTo(641.5, 331.5);
      shape37.lineTo(655, 327.5);
      shape37.lineTo(668, 324);
      shape37.lineTo(672.5, 317);
      shape37.curveTo(692.292, 317.812, 702.379, 317.284, 719, 315);
      shape37.curveTo(739.039, 321.33, 749.003, 325.528, 758, 337.5);
      shape37.curveTo(767.523, 344.074, 771.243, 347.926, 771, 355.5);
      shape37.lineTo(760.5, 356.5);
      shape37.curveTo(752.511, 351.062, 747.736, 349.126, 739, 346.5);
      shape37.curveTo(725.494, 353.126, 717.939, 354.106, 704.5, 350.5);
      shape37.lineTo(684, 360);
      shape37.curveTo(706.047, 360.786, 716.892, 361.762, 723.5, 368);
      shape37.lineTo(724.5, 372);
      shape37.curveTo(712.561, 369.537, 706.503, 367.927, 687.5, 368);
      shape37.curveTo(668.635, 379.054, 658.954, 383.353, 645, 384);
      shape37.curveTo(640.639, 395.796, 637.565, 401.815, 631.5, 412);
      shape37.curveTo(627.006, 412.671, 625.373, 411.559, 624, 407);
      shape37.lineTo(631.5, 386);
      shape37.lineTo(624, 381.5);
      shape37.curveTo(621.668, 378.426, 622.191, 376.203, 624, 372);
      shape37.curveTo(626.398, 369.617, 628.005, 369.461, 631.5, 372);
      shape37.curveTo(635.914, 372.938, 638.147, 372.277, 641.5, 368);
      shape37.curveTo(638.553, 362.951, 636.263, 361.402, 631.5, 360);
      shape37.curveTo(630.383, 356.523, 630.039, 354.367, 631.5, 349);
      shape37.curveTo(630.072, 345.681, 629.563, 343.819, 631.5, 340.5);
      shape37.closePath();
      g2d.setColor(Color.decode("#895033"));
      g2d.fill(shape37);

      // Path 38
      GeneralPath shape38 = new GeneralPath();
      shape38.moveTo(824.5, 373.5);
      shape38.curveTo(825.648, 405.989, 827.287, 423.157, 830, 454);
      shape38.lineTo(832.5, 409.5);
      shape38.lineTo(827.5, 341.5);
      shape38.lineTo(814.5, 320);
      shape38.lineTo(762.5, 274.5);
      shape38.lineTo(712, 242);
      shape38.lineTo(661.5, 293.5);
      shape38.lineTo(630.5, 310);
      shape38.lineTo(621, 301);
      shape38.lineTo(631.5, 291);
      shape38.lineTo(630.5, 289);
      shape38.lineTo(615.5, 292);
      shape38.curveTo(612.106, 288.668, 610.169, 286.944, 605, 291);
      shape38.curveTo(599.738, 287.947, 597.06, 287.679, 593, 291);
      shape38.curveTo(590.333, 291.333, 584.9, 292, 584.5, 292);
      shape38.curveTo(584.1, 292, 579.333, 287, 577, 284.5);
      shape38.lineTo(572.5, 281);
      shape38.lineTo(567, 283.5);
      shape38.lineTo(556.5, 293.5);
      shape38.lineTo(545.5, 296);
      shape38.lineTo(539, 299.5);
      shape38.lineTo(526.5, 308.5);
      shape38.lineTo(515, 317);
      shape38.lineTo(512, 313.5);
      shape38.lineTo(503.5, 312.5);
      shape38.lineTo(494.5, 308.5);
      shape38.lineTo(483, 308.5);
      shape38.lineTo(469.5, 312.5);
      shape38.lineTo(453.5, 315.5);
      shape38.lineTo(438, 330);
      shape38.lineTo(429, 347);
      shape38.curveTo(423.422, 354.464, 421.889, 359.382, 421, 369);
      shape38.lineTo(412, 383);
      shape38.lineTo(411, 405.5);
      shape38.lineTo(406, 439);
      shape38.lineTo(406, 481);
      shape38.lineTo(409, 513);
      shape38.lineTo(414.5, 516.5);
      shape38.lineTo(411, 490);
      shape38.curveTo(409.374, 472.733, 408.492, 463.039, 412, 443.5);
      shape38.curveTo(415.951, 418.643, 418.454, 404.918, 423, 380.5);
      shape38.curveTo(423.552, 367.359, 425.312, 360.329, 431.5, 348.5);
      shape38.lineTo(441.5, 330);
      shape38.curveTo(447.162, 325.945, 449.323, 323.422, 453.5, 319);
      shape38.lineTo(463.5, 318);
      shape38.lineTo(472, 318);
      shape38.lineTo(480, 310.5);
      shape38.lineTo(487, 312.5);
      shape38.curveTo(493.061, 311.725, 496.51, 310.996, 502, 313.5);
      shape38.curveTo(506.289, 316.041, 505.611, 318.764, 503.5, 324);
      shape38.lineTo(508.5, 329);
      shape38.lineTo(539, 306.5);
      shape38.curveTo(544.76, 307.512, 547.824, 306.815, 552.5, 299.5);
      shape38.lineTo(560, 304);
      shape38.lineTo(565, 294.5);
      shape38.curveTo(570.017, 293.514, 572.633, 292.59, 577, 290.5);
      shape38.lineTo(577, 298.5);
      shape38.curveTo(584.682, 304.12, 588.856, 305.506, 596, 304);
      shape38.lineTo(609, 298.5);
      shape38.lineTo(614, 299.5);
      shape38.curveTo(612.831, 302.22, 612.001, 304.445, 610.5, 308.5);
      shape38.curveTo(615.803, 316.952, 620.99, 316.125, 630.5, 314);
      shape38.lineTo(650.5, 306.5);
      shape38.curveTo(660.051, 302.902, 664.593, 306.248, 672.5, 313.5);
      shape38.curveTo(683.314, 297.963, 689.066, 288.237, 701.5, 278);
      shape38.curveTo(706.706, 277.458, 709.144, 275.582, 712.5, 269);
      shape38.curveTo(716.469, 270.439, 718.535, 271.494, 721.5, 274.5);
      shape38.curveTo(722.145, 288.162, 724.268, 295.288, 733, 306.5);
      shape38.lineTo(742.5, 296);
      shape38.curveTo(753.843, 301.976, 757.516, 309.135, 764, 322);
      shape38.lineTo(779.5, 320);
      shape38.lineTo(779.5, 315);
      shape38.curveTo(795.669, 318.839, 802.978, 323.095, 814.5, 332.5);
      shape38.lineTo(824.5, 373.5);
      shape38.closePath();
      g2d.setColor(Color.decode("#895033"));
      g2d.fill(shape38);

      // Path 39
      GeneralPath shape39 = new GeneralPath();
      shape39.moveTo(647.5, 399.5);
      shape39.lineTo(645, 409.5);
      shape39.lineTo(643.5, 418);
      shape39.lineTo(649.5, 417.5);
      shape39.lineTo(655, 416.5);
      shape39.lineTo(670, 413);
      shape39.curveTo(669.077, 410.943, 668.188, 410.191, 666, 409.5);
      shape39.curveTo(669.229, 404.843, 670.594, 401.923, 672, 396);
      shape39.lineTo(670.5, 393.5);
      shape39.lineTo(661.5, 395);
      shape39.lineTo(647.5, 399.5);
      shape39.closePath();
      g2d.setColor(Color.decode("#895033"));
      g2d.fill(shape39);

      // Path 40
      GeneralPath shape40 = new GeneralPath();
      shape40.moveTo(703.5, 412.5);
      shape40.lineTo(712.5, 398.5);
      shape40.lineTo(687.5, 388);
      shape40.curveTo(700.635, 385.902, 708.677, 385.727, 728.5, 393.5);
      shape40.curveTo(738.309, 395.683, 743.967, 396.699, 751, 402.5);
      shape40.curveTo(741.933, 410.359, 738.695, 410.999, 732.5, 413);
      shape40.lineTo(703.5, 412.5);
      shape40.closePath();
      g2d.setColor(Color.decode("#895033"));
      g2d.fill(shape40);

      // Path 41
      GeneralPath shape41 = new GeneralPath();
      shape41.moveTo(592.5, 584.5);
      shape41.curveTo(556.954, 584.442, 539.979, 586.046, 518, 593.5);
      shape41.curveTo(516.313, 595.747, 516.376, 596.831, 518, 598.5);
      shape41.curveTo(530.089, 599.13, 535.294, 596.457, 545, 592.5);
      shape41.curveTo(590.943, 597.006, 622.298, 593.896, 656, 590);
      shape41.curveTo(663.266, 590.283, 666.637, 590.844, 671.5, 592.5);
      shape41.curveTo(685.116, 590.24, 690.67, 587.979, 696.5, 582);
      shape41.curveTo(670.293, 580.449, 653.776, 580.497, 621.5, 582);
      shape41.curveTo(618.905, 584.964, 615.756, 586.202, 608.5, 588);
      shape41.curveTo(602.672, 585.506, 599.346, 584.266, 592.5, 584.5);
      shape41.closePath();
      g2d.setColor(Color.decode("#895033"));
      g2d.fill(shape41);

      // Path 42
      GeneralPath shape42 = new GeneralPath();
      shape42.moveTo(797, 547.5);
      shape42.curveTo(798.686, 532.141, 795.132, 534.148, 785.5, 545.5);
      shape42.curveTo(777.051, 545.121, 773.948, 547.564, 770, 554.5);
      shape42.lineTo(754.5, 567);
      shape42.curveTo(752.537, 564.611, 750.304, 563.765, 744.5, 563);
      shape42.curveTo(738.234, 563.921, 735.972, 564.946, 732.5, 567);
      shape42.curveTo(725.218, 575.388, 723.17, 579.727, 719.535, 587.425);
      shape42.curveTo(719.5, 587.5, 711.756, 605.421, 712.652, 611.668);
      shape42.curveTo(719.5, 619, 727.151, 615.803, 731.916, 613.26);
      shape42.lineTo(744.5, 602.5);
      shape42.lineTo(761.5, 604.5);
      shape42.curveTo(765.29, 604.252, 767.305, 603.715, 770, 599.5);
      shape42.lineTo(776, 599.5);
      shape42.curveTo(783.558, 591.303, 787.102, 584.882, 792.5, 571);
      shape42.curveTo(795.513, 562.42, 796.611, 557.328, 797, 547.5);
      shape42.closePath();
      g2d.setColor(Color.decode("#D89173"));
      g2d.fill(shape42);

      // Path 43
      GeneralPath shape43 = new GeneralPath();
      shape43.moveTo(696, 461);
      shape43.curveTo(680.792, 463.099, 672.344, 461.964, 657.5, 453.5);
      shape43.curveTo(651.172, 455.657, 650.078, 462.752, 649, 477.5);
      shape43.curveTo(679.827, 494.461, 695.647, 505.63, 719.5, 530.5);
      shape43.curveTo(731.828, 533.029, 739.365, 532.35, 753, 530.5);
      shape43.lineTo(761.5, 534.5);
      shape43.lineTo(789.5, 526.5);
      shape43.curveTo(793.405, 524.056, 795.405, 522.366, 795.5, 513.5);
      shape43.curveTo(801.225, 510.823, 803.187, 507.398, 806.5, 501);
      shape43.curveTo(807.551, 488.51, 809.625, 482.622, 806.5, 467);
      shape43.lineTo(795.5, 463.5);
      shape43.lineTo(806.5, 456);
      shape43.curveTo(808.699, 450.735, 809.448, 447.75, 804.5, 442);
      shape43.curveTo(802.003, 441.476, 800.487, 441.534, 797, 444);
      shape43.curveTo(791.79, 451.329, 789.454, 453.924, 785.5, 458);
      shape43.lineTo(776, 456);
      shape43.curveTo(780.541, 449.863, 781.284, 446.641, 773.5, 442);
      shape43.curveTo(759.46, 439.943, 750.386, 439.757, 731, 442);
      shape43.curveTo(721.663, 447.077, 713.099, 448.451, 689, 447);
      shape43.curveTo(683.172, 448.373, 681.532, 449.374, 681, 451.5);
      shape43.curveTo(698.475, 457.899, 698.646, 459.258, 696, 461);
      shape43.closePath();
      g2d.setColor(Color.decode("#D89173"));
      g2d.fill(shape43);

      // Path 44
      GeneralPath shape44 = new GeneralPath();
      shape44.moveTo(701, 625);
      shape44.curveTo(704.731, 616.46, 705.375, 612.206, 696, 608.5);
      shape44.curveTo(673.406, 607.02, 671.603, 614.785, 660, 622);
      shape44.curveTo(673.906, 633.314, 673.284, 636.418, 658, 636.5);
      shape44.curveTo(635.499, 649.758, 608.579, 647.632, 567.5, 638.5);
      shape44.curveTo(594.202, 627.902, 607.556, 622.097, 604.5, 614);
      shape44.curveTo(585.197, 616.553, 574.232, 616.78, 554, 611.5);
      shape44.curveTo(541.913, 606.693, 534.875, 607.06, 522, 611.5);
      shape44.lineTo(507.5, 636.5);
      shape44.curveTo(516.514, 655.236, 524.577, 664.232, 543.5, 678);
      shape44.curveTo(554.946, 678.027, 559.83, 677.156, 567.5, 675);
      shape44.curveTo(603.486, 681.221, 614.418, 675.542, 633.5, 665);
      shape44.lineTo(647.5, 671);
      shape44.lineTo(665, 671);
      shape44.curveTo(679.201, 664.376, 682.93, 658.84, 688.5, 648.5);
      shape44.curveTo(702.056, 648.306, 705.387, 643.852, 707, 631.5);
      shape44.curveTo(704.924, 628.778, 703.589, 627.37, 701, 625);
      shape44.closePath();
      g2d.setColor(Color.decode("#D89173"));
      g2d.fill(shape44);

      // Path 45
      GeneralPath shape45 = new GeneralPath();
      shape45.moveTo(641, 612);
      shape45.curveTo(613.596, 615.35, 612.945, 617.376, 613, 621);
      shape45.curveTo(616.346, 627.474, 624.87, 629.382, 642, 625);
      shape45.curveTo(652.302, 621.403, 656.775, 618.306, 662, 610.5);
      shape45.curveTo(657.055, 606.275, 651.14, 608.55, 641, 612);
      shape45.closePath();
      g2d.setColor(Color.decode("#D89173"));
      g2d.fill(shape45);

      // Path 46
      GeneralPath shape46 = new GeneralPath();
      shape46.moveTo(451.5, 612);
      shape46.curveTo(440.5, 596.024, 438.188, 587.036, 434.5, 571);
      shape46.curveTo(442.785, 572.488, 445.496, 576.401, 449, 585.5);
      shape46.curveTo(451.607, 582.973, 453.083, 581.237, 456, 572);
      shape46.curveTo(462.91, 577.066, 463.593, 579.932, 467, 583.5);
      shape46.curveTo(472.306, 586.822, 475.141, 588.104, 479.5, 587.5);
      shape46.curveTo(493.092, 605.389, 494.521, 611.661, 496.5, 622.5);
      shape46.curveTo(488.15, 622.341, 482.85, 620.183, 473, 615);
      shape46.curveTo(465.441, 617.558, 460.874, 617.526, 451.5, 612);
      shape46.closePath();
      g2d.setColor(Color.decode("#D89173"));
      g2d.fill(shape46);

      // Path 47
      GeneralPath shape47 = new GeneralPath();
      shape47.moveTo(527, 577);
      shape47.curveTo(527.788, 571.267, 528.369, 567.098, 529.5, 559);
      shape47.curveTo(530.348, 555.81, 541.362, 556.327, 569, 559);
      shape47.curveTo(579.834, 566.119, 586.001, 569.724, 598, 572);
      shape47.curveTo(606.798, 573.791, 611.571, 574.594, 614.5, 569);
      shape47.curveTo(628.435, 560.91, 633.478, 555.387, 662, 552.5);
      shape47.curveTo(666.647, 548.451, 671.122, 547.725, 681, 548);
      shape47.curveTo(683.36, 543.456, 684.262, 540.246, 691, 535);
      shape47.curveTo(695.464, 537.874, 696.035, 541.311, 696, 548);
      shape47.curveTo(691.04, 552.687, 687.707, 554.594, 681, 557);
      shape47.curveTo(679.372, 568.499, 675.289, 572.927, 662, 577);
      shape47.curveTo(645.082, 577.818, 635.359, 578.048, 616.5, 577);
      shape47.lineTo(588, 580.5);
      shape47.curveTo(556.56, 581.578, 533.279, 583.996, 527, 577);
      shape47.closePath();
      g2d.setColor(Color.decode("#D89173"));
      g2d.fill(shape47);

      // Path 48
      GeneralPath shape48 = new GeneralPath();
      shape48.moveTo(510.5, 564);
      shape48.curveTo(510.308, 558.986, 510.961, 556.655, 514.5, 554);
      shape48.curveTo(517.674, 553.292, 518.478, 554.055, 519, 556.5);
      shape48.curveTo(519.41, 559.85, 519.085, 561.581, 516, 564);
      shape48.curveTo(513.535, 565.63, 512.383, 565.363, 510.5, 564);
      shape48.closePath();
      g2d.setColor(Color.decode("#D89173"));
      g2d.fill(shape48);

      // Path 49
      GeneralPath shape49 = new GeneralPath();
      shape49.moveTo(649, 513.5);
      shape49.curveTo(637.554, 513.205, 630.188, 515.495, 616.5, 521);
      shape49.curveTo(623.232, 527.305, 632.99, 526.48, 650.264, 525.02);
      shape49.lineTo(650.5, 525);
      shape49.curveTo(653.444, 520.579, 654.136, 518.081, 649, 513.5);
      shape49.closePath();
      g2d.setColor(Color.decode("#D89173"));
      g2d.fill(shape49);

      // Path 50
      GeneralPath shape50 = new GeneralPath();
      shape50.moveTo(581.5, 608);
      shape50.curveTo(561.101, 606.77, 551.443, 605.254, 544, 598);
      shape50.curveTo(548.972, 595.979, 559.751, 595.903, 584.5, 596.5);
      shape50.curveTo(600.936, 599.417, 607.851, 600.489, 616.5, 601.5);
      shape50.curveTo(604.647, 606, 597.402, 607.875, 581.5, 608);
      shape50.closePath();
      g2d.setColor(Color.decode("#D89173"));
      g2d.fill(shape50);

      // Path 51
      GeneralPath shape51 = new GeneralPath();
      shape51.moveTo(605, 434);
      shape51.curveTo(606.903, 415.1, 606.205, 405.383, 591, 395);
      shape51.curveTo(585.262, 395.581, 583.32, 400.056, 580, 408.5);
      shape51.curveTo(581.258, 427.481, 580.218, 435.198, 576, 445);
      shape51.curveTo(567.836, 461.992, 563.373, 465.199, 555.5, 466);
      shape51.lineTo(552, 475);
      shape51.lineTo(544, 473);
      shape51.lineTo(534.5, 457.5);
      shape51.lineTo(511, 473);
      shape51.lineTo(458, 451.5);
      shape51.curveTo(461.558, 442.532, 463.677, 437.644, 475.5, 438);
      shape51.curveTo(479.898, 428.541, 478.506, 425.6, 469, 424.5);
      shape51.curveTo(457.532, 425.785, 451.661, 424.983, 442.5, 420);
      shape51.curveTo(439.36, 409.488, 438.193, 402.937, 439.5, 387.5);
      shape51.curveTo(433.678, 378.443, 430.02, 376.671, 422, 386);
      shape51.curveTo(418.524, 408.233, 416.882, 417.656, 414, 434);
      shape51.curveTo(406.578, 459.429, 407.555, 475.953, 414, 507.5);
      shape51.curveTo(419.938, 543.705, 431.686, 548.932, 462, 541.5);
      shape51.curveTo(479.373, 530.842, 493.697, 514.921, 544, 491);
      shape51.curveTo(532.89, 516.949, 530.821, 528.131, 547, 532);
      shape51.curveTo(563.444, 527.43, 571.877, 529.304, 586.5, 535);
      shape51.curveTo(596.994, 533.803, 602.143, 531.869, 610.5, 527);
      shape51.curveTo(613.289, 516.819, 615.542, 511.405, 622.5, 503);
      shape51.curveTo(622.285, 489.686, 621.092, 482.604, 610.5, 473);
      shape51.curveTo(613.39, 466.383, 613.466, 461.125, 613.357, 451.5);
      shape51.curveTo(607.036, 451.846, 605.575, 450.607, 605, 447);
      shape51.curveTo(603.914, 443.696, 604.031, 440.658, 605, 434);
      shape51.closePath();
      g2d.setColor(Color.decode("#D89173"));
      g2d.fill(shape51);

      // Path 52
      GeneralPath shape52 = new GeneralPath();
      shape52.moveTo(442.5, 343.5);
      shape52.curveTo(446.25, 334.867, 448.857, 330.039, 456.5, 321.5);
      shape52.curveTo(472.124, 320.291, 480.728, 317.802, 496, 312.5);
      shape52.curveTo(509.392, 316.203, 505.276, 322.126, 497, 333);
      shape52.curveTo(484.394, 336.323, 476.336, 336.493, 461.5, 336);
      shape52.curveTo(454.377, 340.88, 450.314, 343.166, 442.5, 343.5);
      shape52.closePath();
      g2d.setColor(Color.decode("#D89173"));
      g2d.fill(shape52);

      // Path 53
      GeneralPath shape53 = new GeneralPath();
      shape53.moveTo(518.5, 333);
      shape53.curveTo(523.572, 325.523, 527.216, 321.514, 536.5, 315);
      shape53.lineTo(560, 309);
      shape53.curveTo(565.614, 297.407, 567.544, 299.589, 570, 310.5);
      shape53.lineTo(578, 314);
      shape53.curveTo(585.085, 312.732, 589.114, 311.269, 596.5, 306);
      shape53.curveTo(604.493, 312.544, 608.855, 316.298, 621.5, 319.5);
      shape53.curveTo(633.081, 316.729, 639.505, 315.422, 650, 316.5);
      shape53.curveTo(657.362, 319.43, 657.958, 321.896, 656, 327);
      shape53.curveTo(654.019, 328.425, 652.215, 328.58, 647, 327);
      shape53.curveTo(642.255, 329.201, 637.993, 330.224, 628, 331);
      shape53.lineTo(607, 337.5);
      shape53.curveTo(606.602, 348.094, 603.631, 350.799, 599.5, 357);
      shape53.curveTo(596.447, 361.393, 594.426, 362.477, 589.5, 358.5);
      shape53.lineTo(576, 354.5);
      shape53.curveTo(563.19, 358.346, 557.064, 352.343, 546.305, 341.799);
      shape53.lineTo(546, 341.5);
      shape53.curveTo(532.055, 341.077, 524.691, 340.43, 518.5, 333);
      shape53.closePath();
      g2d.setColor(Color.decode("#D89173"));
      g2d.fill(shape53);

      // Path 54
      GeneralPath shape54 = new GeneralPath();
      shape54.moveTo(473, 418.5);
      shape54.curveTo(473.962, 414.935, 475.311, 413.262, 479.5, 411);
      shape54.lineTo(481, 410.5);
      shape54.curveTo(486.931, 410.281, 487.44, 414.027, 488.5, 420.5);
      shape54.curveTo(488.14, 424.624, 486.301, 424.659, 482.5, 424);
      shape54.curveTo(477.767, 423.443, 475.789, 422.079, 473, 418.5);
      shape54.closePath();
      g2d.setColor(Color.decode("#D89173"));
      g2d.fill(shape54);

      // Path 55
      GeneralPath shape55 = new GeneralPath();
      shape55.moveTo(667, 409.5);
      shape55.curveTo(668.459, 403.68, 669.366, 400.55, 673, 398);
      shape55.curveTo(676.836, 399.504, 678.454, 401.692, 679, 411.5);
      shape55.curveTo(674.233, 412.41, 671.612, 411.848, 667, 409.5);
      shape55.closePath();
      g2d.setColor(Color.decode("#D89173"));
      g2d.fill(shape55);

      // Path 56
      GeneralPath shape56 = new GeneralPath();
      shape56.moveTo(709.5, 420);
      shape56.curveTo(703.558, 425.22, 696.649, 425.675, 680, 423.5);
      shape56.curveTo(681.869, 419.364, 685.088, 417.512, 694.5, 415);
      shape56.curveTo(703.795, 415.542, 706.274, 416.968, 709.5, 420);
      shape56.closePath();
      g2d.setColor(Color.decode("#D89173"));
      g2d.fill(shape56);

      // Path 57
      GeneralPath shape57 = new GeneralPath();
      shape57.moveTo(448.5, 363);
      shape57.curveTo(449.65, 356.572, 458.167, 345.067, 464.5, 346);
      shape57.curveTo(479.702, 340.355, 490.226, 339.276, 512.5, 341);
      shape57.curveTo(519.157, 347.829, 524.102, 350.784, 533, 356);
      shape57.curveTo(530.137, 360.037, 528.243, 362.101, 523, 364.5);
      shape57.curveTo(492.023, 365.145, 471.541, 367.541, 448.5, 363);
      shape57.closePath();
      g2d.setColor(Color.decode("#342F36"));
      g2d.fill(shape57);

      // Path 58
      GeneralPath shape58 = new GeneralPath();
      shape58.moveTo(694.5, 322.5);
      shape58.curveTo(665.752, 324.444, 653.676, 327.922, 648, 343.5);
      shape58.curveTo(653.98, 354.846, 665.173, 354.416, 690.5, 349);
      shape58.curveTo(711.391, 336.758, 726.005, 334.601, 759, 342);
      shape58.curveTo(746.592, 324.131, 728.683, 322.899, 694.5, 322.5);
      shape58.closePath();
      g2d.setColor(Color.decode("#342F36"));
      g2d.fill(shape58);

      // Path 59
      GeneralPath shape59 = new GeneralPath();
      shape59.moveTo(463.5, 420);
      shape59.curveTo(461.882, 416.301, 462.23, 414.694, 466, 413);
      shape59.lineTo(472.5, 410.5);
      shape59.lineTo(472.5, 408);
      shape59.lineTo(490, 403.5);
      shape59.curveTo(505.884, 402.926, 513.539, 404.87, 526, 410.5);
      shape59.curveTo(538.986, 414.825, 544.088, 418.351, 550.5, 426);
      shape59.curveTo(542.71, 424.882, 538.402, 424.093, 531.5, 421.5);
      shape59.lineTo(529, 415.5);
      shape59.lineTo(520, 413);
      shape59.lineTo(519, 424.5);
      shape59.curveTo(512, 425, 497.8, 426, 497, 426);
      shape59.curveTo(496.2, 426, 491.333, 423, 489, 421.5);
      shape59.curveTo(487.576, 413.338, 486.581, 409.809, 483.5, 410.5);
      shape59.curveTo(477.623, 410.775, 475.941, 414.036, 472.5, 419);
      shape59.curveTo(468.55, 421.007, 466.656, 420.944, 463.5, 420);
      shape59.closePath();
      g2d.setColor(Color.decode("#342F36"));
      g2d.fill(shape59);

      // Path 60
      GeneralPath shape60 = new GeneralPath();
      shape60.moveTo(643, 416);
      shape60.curveTo(648, 412.667, 658.1, 406, 658.5, 406);
      shape60.lineTo(652, 414);
      shape60.lineTo(643, 416);
      shape60.closePath();
      g2d.setColor(Color.decode("#342F36"));
      g2d.fill(shape60);

      // Path 61
      GeneralPath shape61 = new GeneralPath();
      shape61.moveTo(695.5, 388);
      shape61.lineTo(671.5, 396.5);
      shape61.curveTo(678.26, 398.431, 679.555, 402.219, 680, 411);
      shape61.lineTo(697, 411.5);
      shape61.lineTo(709.5, 403.5);
      shape61.lineTo(715, 398);
      shape61.lineTo(729, 407);
      shape61.lineTo(732, 399);
      shape61.lineTo(695.5, 388);
      shape61.closePath();
      g2d.setColor(Color.decode("#342F36"));
      g2d.fill(shape61);

      // Path 62
      GeneralPath shape62 = new GeneralPath();
      shape62.moveTo(404.5, 398.5);
      shape62.curveTo(422.774, 338.188, 435.455, 305.381, 499.5, 264);
      shape62.lineTo(590, 237);
      shape62.lineTo(660.5, 241);
      shape62.lineTo(728.5, 248);
      shape62.curveTo(744, 254.667, 775, 268.4, 775, 270);
      shape62.curveTo(775, 271.6, 802, 294.667, 815.5, 306);
      shape62.lineTo(835, 356.5);
      shape62.lineTo(841, 429);
      shape62.lineTo(821.5, 527.5);
      shape62.lineTo(818.5, 532.5);
      shape62.lineTo(820.5, 545.5);
      shape62.lineTo(820.5, 568.5);
      shape62.lineTo(820.5, 579.5);
      shape62.lineTo(816.5, 612.5);
      shape62.lineTo(820.5, 660);
      shape62.lineTo(818.5, 690);
      shape62.curveTo(829.291, 719.663, 829.333, 734.887, 818.5, 759.5);
      shape62.curveTo(821.891, 778.372, 821.792, 792.587, 837, 790);
      shape62.lineTo(837, 810.5);
      shape62.curveTo(831.104, 818.217, 830.487, 823.232, 834.5, 833.5);
      shape62.lineTo(828, 877);
      shape62.curveTo(822.349, 901.575, 820.793, 915.795, 821, 942);
      shape62.lineTo(815, 985);
      shape62.lineTo(804, 1048.5);
      shape62.lineTo(797.5, 1107);
      shape62.curveTo(789.576, 1136.47, 783.467, 1152.64, 784.5, 1184);
      shape62.lineTo(775.5, 1192.5);
      shape62.curveTo(762.689, 1201.14, 760.882, 1207.81, 760, 1220.5);
      shape62.lineTo(814.5, 1220.5);
      shape62.curveTo(813.149, 1208.1, 811.085, 1201.61, 800.5, 1192.5);
      shape62.lineTo(805.5, 1163);
      shape62.lineTo(810.5, 1128);
      shape62.lineTo(821, 1085.5);
      shape62.lineTo(825, 1045);
      shape62.lineTo(829, 1008);
      shape62.lineTo(832, 980);
      shape62.curveTo(834.955, 967.729, 834.382, 962.911, 831, 956.5);
      shape62.lineTo(835, 925);
      shape62.lineTo(839.5, 900.5);
      shape62.lineTo(844, 859.5);
      shape62.lineTo(849.5, 835);
      shape62.curveTo(854.152, 821.247, 855.485, 813.813, 853.5, 801.5);
      shape62.lineTo(858.5, 772.5);
      shape62.lineTo(861, 751.5);
      shape62.lineTo(870.5, 722);
      shape62.lineTo(884.5, 709.5);
      shape62.lineTo(896.5, 685);
      shape62.lineTo(902.5, 606);
      shape62.curveTo(908.187, 582.517, 909.266, 568.83, 909.5, 544);
      shape62.lineTo(903, 444.5);
      shape62.lineTo(874.5, 323);
      shape62.curveTo(868.72, 272.333, 863.676, 247.266, 848.5, 214);
      shape62.curveTo(841.178, 205.928, 837.88, 201.094, 838.5, 190);
      shape62.curveTo(847.174, 182.82, 846.472, 176.259, 844, 164);
      shape62.curveTo(842.098, 138.493, 838.682, 128.35, 828.5, 117.5);
      shape62.lineTo(775, 83.5001);
      shape62.lineTo(754.5, 76);
      shape62.curveTo(742.944, 72.3128, 738.866, 72.7396, 734, 76);
      shape62.lineTo(709.5, 68);
      shape62.curveTo(701.74, 60.4271, 695.18, 57.1317, 684, 57.9999);
      shape62.lineTo(653.5, 51.5);
      shape62.lineTo(638, 53.0001);
      shape62.lineTo(621.5, 41.0001);
      shape62.curveTo(590.584, 28.1373, 576.331, 30.4371, 553, 41.0001);
      shape62.lineTo(539, 53.0001);
      shape62.lineTo(525, 77.5);
      shape62.lineTo(463.5, 103);
      shape62.lineTo(448.5, 106);
      shape62.lineTo(445, 102);
      shape62.lineTo(440.5, 99.0001);
      shape62.lineTo(434, 97.5001);
      shape62.lineTo(391.5, 137);
      shape62.curveTo(375.638, 157.158, 377.706, 170.363, 379, 193.5);
      shape62.curveTo(380.793, 208.686, 381.814, 217.196, 387, 231.5);
      shape62.curveTo(380.248, 245.501, 378.734, 260.295, 376.072, 286.293);
      shape62.lineTo(376, 287);
      shape62.lineTo(368.5, 458);
      shape62.curveTo(356.875, 477.767, 354.951, 491.611, 356, 519);
      shape62.curveTo(342.911, 547.832, 342.301, 559.595, 350.5, 574.5);
      shape62.curveTo(347.345, 598.019, 346.482, 610.955, 350.5, 632.5);
      shape62.lineTo(350.5, 654.5);
      shape62.lineTo(350.5, 711);
      shape62.curveTo(360.12, 735.636, 362.419, 750.225, 367.5, 776);
      shape62.lineTo(362.5, 794);
      shape62.lineTo(359.5, 819);
      shape62.curveTo(361.561, 833.821, 361.212, 841.318, 369.5, 859.5);
      shape62.curveTo(365.375, 861.829, 363.595, 863.515, 362.5, 868);
      shape62.curveTo(364.47, 881.696, 366.218, 889.023, 369.5, 902);
      shape62.curveTo(364.999, 908.234, 362.93, 912.285, 362.5, 923.5);
      shape62.lineTo(362.5, 957);
      shape62.lineTo(354, 996);
      shape62.lineTo(350.5, 1035.5);
      shape62.lineTo(354, 1104.5);
      shape62.lineTo(350.5, 1159.5);
      shape62.lineTo(345, 1208.5);
      shape62.curveTo(338.439, 1208.16, 335.104, 1209.91, 329.5, 1215);
      shape62.curveTo(327.621, 1217.41, 327.995, 1218.56, 329.5, 1220.5);
      shape62.lineTo(368.5, 1220.5);
      shape62.curveTo(367.72, 1214.93, 366.389, 1212.22, 360.5, 1209);
      shape62.lineTo(365, 1169.5);
      shape62.lineTo(370, 1115.5);
      shape62.lineTo(371.5, 1074.5);
      shape62.lineTo(379, 1018);
      shape62.lineTo(382.5, 957);
      shape62.lineTo(391, 928);
      shape62.lineTo(391, 880);
      shape62.lineTo(392, 833);
      shape62.lineTo(392, 799);
      shape62.curveTo(397.455, 787.045, 401.508, 780.939, 414.5, 773.5);
      shape62.curveTo(422.165, 754.621, 425.592, 742.675, 427, 714);
      shape62.curveTo(420.227, 676.482, 420.797, 656.322, 422.5, 620.5);
      shape62.curveTo(418.041, 592.112, 413.778, 576.783, 404.5, 550);
      shape62.lineTo(404.5, 398.5);
      shape62.closePath();
      g2d.setColor(Color.decode("#4E9835"));
      g2d.fill(shape62);

      // Path 63
      GeneralPath shape63 = new GeneralPath();
      shape63.moveTo(453.5, 315.5);
      shape63.lineTo(426, 351.5);
      shape63.lineTo(423.5, 348);
      shape63.lineTo(445.5, 314);
      shape63.lineTo(503.5, 284);
      shape63.lineTo(594, 256.5);
      shape63.lineTo(656.5, 277);
      shape63.lineTo(622, 302.5);
      shape63.lineTo(631, 291);
      shape63.lineTo(617, 291);
      shape63.lineTo(599, 288);
      shape63.lineTo(582.5, 291);
      shape63.lineTo(572, 282);
      shape63.lineTo(557.5, 293);
      shape63.lineTo(543.5, 297);
      shape63.lineTo(535.5, 302.5);
      shape63.lineTo(515.5, 315.5);
      shape63.lineTo(501, 311);
      shape63.lineTo(482.5, 309);
      shape63.lineTo(465, 314);
      shape63.lineTo(453.5, 315.5);
      shape63.closePath();
      g2d.setColor(Color.decode("#4A515B"));
      g2d.fill(shape63);

      // Path 64
      GeneralPath shape64 = new GeneralPath();
      shape64.moveTo(710.5, 339);
      shape64.curveTo(700.546, 340.151, 699.373, 342.927, 696.5, 347.5);
      shape64.curveTo(710.47, 342.536, 718.234, 340.949, 732, 339.5);
      shape64.lineTo(732.5, 336.5);
      shape64.curveTo(723.88, 336.73, 719.071, 337.491, 710.5, 339);
      shape64.closePath();
      g2d.setColor(Color.decode("#4A515B"));
      g2d.fill(shape64);

      // Path 65
      GeneralPath shape65 = new GeneralPath();
      shape65.moveTo(704, 327.5);
      shape65.curveTo(699.098, 326.019, 699.049, 324.65, 697.5, 322.5);
      shape65.curveTo(699.93, 322.331, 701.369, 322.322, 705, 323.5);
      shape65.curveTo(714.823, 324.107, 719.902, 324.138, 728, 323.5);
      shape65.lineTo(730, 325);
      shape65.curveTo(731.474, 327.363, 731.519, 328.674, 731, 331);
      shape65.lineTo(728, 334.5);
      shape65.curveTo(726, 334, 721.9, 333, 721.5, 333);
      shape65.curveTo(721.1, 333, 716.667, 331, 714.5, 330);
      shape65.lineTo(704, 327.5);
      shape65.closePath();
      g2d.setColor(Color.decode("#4A515B"));
      g2d.fill(shape65);

      // Path 66
      GeneralPath shape66 = new GeneralPath();
      shape66.moveTo(667.5, 331.5);
      shape66.curveTo(667.752, 331.189, 668, 328.833, 668, 327.5);
      shape66.curveTo(661.759, 327.438, 658.715, 328.589, 654, 332.5);
      shape66.curveTo(655.635, 335.457, 656.713, 336.842, 660, 337);
      shape66.lineTo(663, 331.5);
      shape66.curveTo(664.547, 331.933, 667.251, 331.807, 667.5, 331.5);
      shape66.closePath();
      g2d.setColor(Color.decode("#4A515B"));
      g2d.fill(shape66);

      // Path 67
      GeneralPath shape67 = new GeneralPath();
      shape67.moveTo(653, 341);
      shape67.curveTo(652.504, 338.72, 651.675, 337.914, 649, 337.5);
      shape67.curveTo(646.799, 337.863, 646.921, 338.91, 647.5, 341);
      shape67.curveTo(648.537, 345.454, 650.04, 346.847, 653, 349);
      shape67.curveTo(653.728, 345.876, 653.865, 344.124, 653, 341);
      shape67.closePath();
      g2d.setColor(Color.decode("#4A515B"));
      g2d.fill(shape67);

      // Path 68
      GeneralPath shape68 = new GeneralPath();
      shape68.moveTo(746, 339.5);
      shape68.curveTo(742.279, 338.574, 740.92, 338.625, 739.5, 339.5);
      shape68.curveTo(743.379, 341.889, 745.81, 342.841, 750.5, 344);
      shape68.curveTo(750.203, 341.738, 749.833, 340.541, 746, 339.5);
      shape68.closePath();
      g2d.setColor(Color.decode("#4A515B"));
      g2d.fill(shape68);

      // Path 69
      GeneralPath shape69 = new GeneralPath();
      shape69.moveTo(457.5, 366.5);
      shape69.curveTo(453.646, 365.7, 451.734, 365.099, 450, 363);
      shape69.lineTo(448.5, 362);
      shape69.curveTo(448.713, 360.064, 448.988, 359.056, 451, 358);
      shape69.lineTo(455, 353);
      shape69.lineTo(460.5, 348);
      shape69.lineTo(468, 344.5);
      shape69.curveTo(471.218, 342.494, 473.625, 341.631, 480, 341);
      shape69.lineTo(496, 339.5);
      shape69.curveTo(502.862, 339.557, 506.148, 339.876, 511, 341);
      shape69.curveTo(516.129, 342.663, 518.182, 343.983, 521.5, 346.5);
      shape69.lineTo(529.5, 353);
      shape69.lineTo(521.5, 350);
      shape69.lineTo(511, 343.5);
      shape69.lineTo(501, 344.5);
      shape69.lineTo(490, 345.5);
      shape69.lineTo(478, 348);
      shape69.curveTo(475.637, 349.763, 474.279, 350.603, 471.5, 350.5);
      shape69.lineTo(464, 353);
      shape69.lineTo(457.5, 356);
      shape69.lineTo(456, 363);
      shape69.lineTo(465, 364);
      shape69.lineTo(457.5, 366.5);
      shape69.closePath();
      g2d.setColor(Color.decode("#4A515B"));
      g2d.fill(shape69);

      // Path 70
      GeneralPath shape70 = new GeneralPath();
      shape70.moveTo(457.5, 309);
      shape70.lineTo(448, 316);
      shape70.lineTo(435, 330.5);
      shape70.lineTo(425.5, 351.5);
      shape70.curveTo(421.112, 366.948, 418.539, 375.331, 412, 385.5);
      shape70.lineTo(410.5, 410.5);
      shape70.lineTo(405, 443);
      shape70.lineTo(409, 499.5);
      shape70.lineTo(410.5, 507);
      shape70.lineTo(411.5, 518.5);
      shape70.curveTo(411.298, 525.066, 411.083, 528.783, 409, 536);
      shape70.curveTo(406.789, 541.981, 407.828, 545.406, 407.5, 552);
      shape70.curveTo(410.196, 567.299, 412.365, 575.627, 417.5, 590);
      shape70.lineTo(416, 610);
      shape70.lineTo(409, 616.5);
      shape70.lineTo(399, 622);
      shape70.lineTo(393, 651.5);
      shape70.lineTo(388.5, 647);
      shape70.lineTo(383, 645.5);
      shape70.lineTo(377, 665);
      shape70.lineTo(369.5, 651.5);
      shape70.lineTo(366.5, 632);
      shape70.lineTo(361.5, 628);
      shape70.lineTo(363, 602);
      shape70.lineTo(377, 580);
      shape70.lineTo(374, 579);
      shape70.lineTo(375.5, 564.5);
      shape70.lineTo(377, 552);
      shape70.lineTo(374, 544.5);
      shape70.curveTo(371.998, 538.837, 371.69, 535.663, 374, 530);
      shape70.lineTo(380, 507);
      shape70.lineTo(385, 506);
      shape70.lineTo(388, 496.5);
      shape70.curveTo(390.265, 499.792, 392.751, 498.164, 398, 496.5);
      shape70.lineTo(396.5, 485);
      shape70.lineTo(392.5, 484);
      shape70.curveTo(389.126, 480.139, 389.219, 478.064, 392.5, 474.5);
      shape70.lineTo(394.5, 467.5);
      shape70.lineTo(390, 457.5);
      shape70.lineTo(388, 448.5);
      shape70.curveTo(390.842, 430.08, 394.566, 422.891, 401.5, 410.5);
      shape70.curveTo(404.817, 390.426, 408.155, 381.872, 413.5, 365.5);
      shape70.lineTo(433, 325);
      shape70.curveTo(437.901, 313.291, 455.325, 289.406, 460.5, 287);
      shape70.curveTo(466.802, 284.07, 515.862, 247.804, 546.5, 241);
      shape70.lineTo(587, 230);
      shape70.lineTo(637.5, 228);
      shape70.lineTo(674, 230);
      shape70.lineTo(704, 236.5);
      shape70.lineTo(728.5, 243);
      shape70.lineTo(755, 255.5);
      shape70.lineTo(765, 265.5);
      shape70.lineTo(779, 275);
      shape70.curveTo(787.327, 276.508, 791.484, 278.297, 797, 285);
      shape70.lineTo(801.5, 297);
      shape70.lineTo(813.5, 303.5);
      shape70.lineTo(818.5, 314);
      shape70.lineTo(827, 322);
      shape70.lineTo(835.5, 332.5);
      shape70.lineTo(840.5, 340.5);
      shape70.lineTo(833.5, 351);
      shape70.lineTo(842, 372);
      shape70.curveTo(844.002, 379.567, 844.388, 383.252, 842, 387.5);
      shape70.lineTo(839.5, 416.5);
      shape70.lineTo(838, 454);
      shape70.lineTo(838.075, 454.246);
      shape70.curveTo(840.809, 463.141, 842.364, 468.204, 842, 475.5);
      shape70.lineTo(834.5, 491);
      shape70.curveTo(831.982, 497.236, 831.054, 500.96, 834.5, 510);
      shape70.curveTo(831.221, 516.187, 830.994, 520.001, 831.5, 527);
      shape70.lineTo(821.5, 527);
      shape70.curveTo(821.132, 513.717, 821.463, 506.749, 824.5, 496.5);
      shape70.curveTo(830.072, 468.952, 832.666, 453.135, 831, 420.5);
      shape70.curveTo(832.462, 376.176, 836.104, 348.941, 817, 322);
      shape70.curveTo(805.926, 309.99, 799.046, 305.051, 783.5, 305);
      shape70.lineTo(761.5, 284);
      shape70.curveTo(745.555, 267.65, 738.76, 257.406, 708, 248.5);
      shape70.lineTo(673, 292.5);
      shape70.lineTo(632.5, 310.5);
      shape70.curveTo(624.815, 306.997, 623.963, 304.683, 623, 300.5);
      shape70.curveTo(636.135, 289.569, 643.1, 283.666, 643.5, 276);
      shape70.curveTo(631.188, 277.355, 626.866, 281.361, 618, 284);
      shape70.lineTo(616.5, 273.5);
      shape70.lineTo(600, 281.465);
      shape70.curveTo(597.66, 281.465, 594.384, 283.577, 587, 285.5);
      shape70.curveTo(582.598, 281.234, 581.521, 279.258, 580.5, 276);
      shape70.curveTo(572.839, 275.349, 569.399, 276.151, 566.5, 282);
      shape70.lineTo(548, 291);
      shape70.lineTo(538, 302);
      shape70.lineTo(517, 303.5);
      shape70.curveTo(506.041, 307.844, 499.911, 307.469, 489, 302);
      shape70.curveTo(481.565, 309.633, 476.086, 312.582, 464.5, 316);
      shape70.lineTo(457.5, 309);
      shape70.closePath();
      g2d.setColor(Color.decode("#2F3237"));
      g2d.fill(shape70);

      // Path 71
      GeneralPath shape71 = new GeneralPath();
      shape71.moveTo(459.5, 129.5);
      shape71.curveTo(453.632, 134.934, 447.551, 138.419, 463, 140.5);
      shape71.curveTo(504.377, 120.364, 528.969, 113.21, 571.5, 96.4999);
      shape71.curveTo(599.662, 95.0022, 615.762, 94.2799, 644.5, 92.9999);
      shape71.curveTo(672.592, 96.17, 686.668, 96.1447, 712, 96.4999);
      shape71.curveTo(714.175, 93.2115, 715.752, 91.3408, 712, 88.4999);
      shape71.curveTo(703.061, 84.869, 701.877, 81.5068, 669.5, 85.9999);
      shape71.curveTo(624.93, 83.7924, 600.264, 83.8619, 558.5, 92.9999);
      shape71.curveTo(516.531, 104.029, 492.06, 109.295, 459.5, 129.5);
      shape71.closePath();
      g2d.setColor(Color.decode("#D79072"));
      g2d.fill(shape71);

      // Path 72
      GeneralPath shape72 = new GeneralPath();
      shape72.moveTo(444.5, 110);
      shape72.curveTo(437.459, 103.789, 435.098, 98.9464, 433, 88.5);
      shape72.curveTo(433.297, 60.5196, 435.794, 42.6799, 449, 27.5);
      shape72.curveTo(473.213, 9.26626, 487.014, 0.0555457, 515.5, 1.00001);
      shape72.curveTo(541.595, 12.7465, 545.752, 23.2334, 553, 42);
      shape72.curveTo(539.966, 49.9317, 535.948, 56.9239, 531.5, 71.5);
      shape72.curveTo(519.141, 85.9684, 513.754, 88.9653, 506.5, 86.5);
      shape72.curveTo(479.665, 105.66, 463.017, 109.799, 444.5, 110);
      shape72.closePath();
      g2d.setColor(Color.decode("#333038"));
      g2d.fill(shape72);

      // Path 73
      GeneralPath shape73 = new GeneralPath();
      shape73.moveTo(684, 14.5);
      shape73.curveTo(671.734, 21.5376, 663.52, 28.3658, 648.5, 42);
      shape73.lineTo(649.5, 52.5);
      shape73.curveTo(663.424, 56.7536, 666.759, 60.1838, 674, 66);
      shape73.curveTo(681.714, 63.3472, 686.298, 64.2131, 694.5, 66);
      shape73.curveTo(709.659, 67.8375, 714.678, 71.9856, 723.5, 79.5);
      shape73.curveTo(733.293, 76.822, 739.217, 76.5311, 750.5, 78);
      shape73.curveTo(766.155, 85.5892, 768.073, 83.7201, 770.5, 79.5);
      shape73.curveTo(770.218, 67.8815, 766.937, 59.4708, 745.5, 35);
      shape73.curveTo(744.05, 44.0568, 742.664, 48.9613, 739.5, 57.5);
      shape73.curveTo(728.948, 61.8007, 723.579, 62.4482, 714.5, 62);
      shape73.curveTo(702.822, 56.5041, 696.604, 52.8501, 688, 42);
      shape73.curveTo(687.525, 31.3853, 689.087, 25.3944, 701.5, 14.5);
      shape73.lineTo(684, 14.5);
      shape73.closePath();
      g2d.setColor(Color.decode("#333038"));
      g2d.fill(shape73);

      // Path 74
      GeneralPath shape74 = new GeneralPath();
      shape74.moveTo(508, 18.5);
      shape74.curveTo(496.869, 15.2016, 491.596, 16.7175, 482.5, 20.5);
      shape74.curveTo(474.003, 25.1639, 470.94, 30.0585, 467.5, 41.5);
      shape74.curveTo(465.748, 54.4503, 465.812, 61.6478, 474, 74);
      shape74.curveTo(489.532, 79.7059, 498.275, 79.9887, 514, 69.5);
      shape74.curveTo(518.901, 62.4055, 520.904, 57.7233, 522.5, 47.5);
      shape74.curveTo(520.591, 36.1044, 520.419, 29.6983, 508, 18.5);
      shape74.closePath();
      g2d.setColor(Color.decode("#D8926E"));
      g2d.fill(shape74);

      // Path 75
      GeneralPath shape75 = new GeneralPath();
      shape75.moveTo(691, 29.5);
      shape75.curveTo(693.438, 22.2016, 695.11, 18.4095, 701.5, 15);
      shape75.curveTo(710.834, 12.6368, 716.721, 12.7407, 730, 19);
      shape75.curveTo(740.371, 26.4843, 744.26, 30.9086, 749.5, 39);
      shape75.curveTo(746.496, 47.8485, 743.643, 50.45, 739.5, 57);
      shape75.curveTo(729.123, 62.1319, 723.762, 63.3206, 715, 62.5);
      shape75.curveTo(703.89, 57.3112, 698.411, 53.7085, 690, 46);
      shape75.curveTo(686.881, 38.6728, 687.179, 35.0818, 691, 29.5);
      shape75.closePath();
      g2d.setColor(Color.decode("#D8926E"));
      g2d.fill(shape75);

      // Path 76
      GeneralPath shape76 = new GeneralPath();
      shape76.moveTo(491, 50.5);
      shape76.curveTo(489.296, 50.7989, 483.566, 47.1926, 482.5, 44.5);
      shape76.curveTo(487.239, 43.4307, 490.064, 43.3625, 495.5, 44.5);
      shape76.curveTo(502.911, 46.2153, 504.194, 48.3709, 507, 52);
      shape76.curveTo(501.946, 52.768, 492.717, 50.1988, 491, 50.5);
      shape76.closePath();
      g2d.setColor(Color.decode("#2F3237"));
      g2d.fill(shape76);

      // Path 77
      GeneralPath shape77 = new GeneralPath();
      shape77.moveTo(729, 39);
      shape77.curveTo(722.989, 38.48, 719.514, 37.2905, 713, 32.5);
      shape77.curveTo(716.486, 31.4458, 718.77, 31.1253, 724, 31.5);
      shape77.curveTo(728.885, 34.0512, 729.411, 35.7668, 729, 39);
      shape77.closePath();
      g2d.setColor(Color.decode("#2F3237"));
      g2d.fill(shape77);
    }

    @Override
    public Dimension getPreferredSize() {
      int width = (int) (1280 * scale);
      int height = (int) (1257 * scale);
      return new Dimension(width, height);
    }
  }
}