package qqstole;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class YcKeyListenner implements KeyListener {
   public void keyTyped(KeyEvent e) {
   }

   public void keyPressed(KeyEvent e) {
   }

   public void keyReleased(KeyEvent e) {
      if (e.getKeyCode() == 20) {
         QQFrame.keyflag = !QQFrame.keyflag;
         if (QQFrame.keyflag && QQFrame.focusflag) {
            QQFrame.label28.setVisible(true);
         } else {
            QQFrame.label28.setVisible(false);
         }
      } else {
         QQFrame.label28.setVisible(false);
      }

   }
}
