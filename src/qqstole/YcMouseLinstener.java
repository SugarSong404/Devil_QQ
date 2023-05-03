package qqstole;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

class YcMouseLinstener implements MouseListener {
   private JComponent a;
   static boolean flag8 = false;
   static boolean flag9 = false;

   public YcMouseLinstener(JComponent p) {
      this.a = p;
   }

   public void mouseClicked(MouseEvent e) {
      if (this.a == QQFrame.label1) {
         System.exit(0);
      } else if (this.a == QQFrame.label25) {
         System.exit(0);
      } else if (this.a == QQFrame.label10) {
         QQFrame.label8.setVisible(flag8);
         flag8 = !flag8;
      } else if (this.a == QQFrame.label11) {
         QQFrame.label9.setVisible(flag9);
         flag9 = !flag9;
      } else if (this.a == QQFrame.label21) {
         QQFrame.card.show(QQFrame.p1, "first");
      } else if (this.a == QQFrame.p2) {
         QQFrame.p2.requestFocus();
      }

   }

   public void mousePressed(MouseEvent e) {
   }

   public void mouseReleased(MouseEvent e) {
   }

   public void mouseEntered(MouseEvent e) {
      if (this.a == QQFrame.label1) {
         QQFrame.label12.setVisible(true);
      } else if (this.a == QQFrame.label2) {
         QQFrame.label13.setVisible(true);
      } else if (this.a == QQFrame.label3) {
         QQFrame.label14.setVisible(true);
      } else if (this.a == QQFrame.label25) {
         QQFrame.label22.setVisible(true);
      } else if (this.a == QQFrame.label26) {
         QQFrame.label23.setVisible(true);
      } else if (this.a == QQFrame.label27) {
         QQFrame.label24.setVisible(true);
      }

   }

   public void mouseExited(MouseEvent e) {
      if (this.a == QQFrame.label1) {
         QQFrame.label12.setVisible(false);
      } else if (this.a == QQFrame.label2) {
         QQFrame.label13.setVisible(false);
      } else if (this.a == QQFrame.label3) {
         QQFrame.label14.setVisible(false);
      } else if (this.a == QQFrame.label25) {
         QQFrame.label22.setVisible(false);
      } else if (this.a == QQFrame.label26) {
         QQFrame.label23.setVisible(false);
      } else if (this.a == QQFrame.label27) {
         QQFrame.label24.setVisible(false);
      }

   }
}
