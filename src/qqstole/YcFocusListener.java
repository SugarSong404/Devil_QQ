package qqstole;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JComponent;

class YcFocusListener implements FocusListener {
   private JComponent a;

   public YcFocusListener(JComponent p) {
      this.a = p;
   }

   public void focusGained(FocusEvent e) {
      if (this.a == QQFrame.text1) {
         QQFrame.label4.setVisible(true);
         QQFrame.label6.setVisible(true);
         QQFrame.label15.setVisible(false);
      } else if (this.a == QQFrame.text2) {
         QQFrame.label5.setVisible(true);
         QQFrame.label7.setVisible(true);
         QQFrame.label16.setVisible(false);
         QQFrame.focusflag = true;
         if (QQFrame.keyflag) {
            QQFrame.label28.setVisible(true);
         } else {
            QQFrame.label28.setVisible(false);
         }
      } else if (this.a == QQFrame.label19) {
         QQFrame.label17.setVisible(true);
      } else if (this.a == QQFrame.label20) {
         QQFrame.label18.setVisible(true);
      }

   }

   public void focusLost(FocusEvent e) {
      if (this.a == QQFrame.text1) {
         QQFrame.label4.setVisible(false);
         QQFrame.label6.setVisible(false);
         if (QQFrame.text1.getText().length() == 0) {
            QQFrame.label15.setVisible(true);
         }
      } else if (this.a == QQFrame.text2) {
         QQFrame.label5.setVisible(false);
         QQFrame.label7.setVisible(false);
         if (QQFrame.text2.getPassword().length == 0) {
            QQFrame.label16.setVisible(true);
            QQFrame.focusflag = false;
            QQFrame.label28.setVisible(false);
         }
      } else if (this.a == QQFrame.label19) {
         QQFrame.label17.setVisible(false);
      } else if (this.a == QQFrame.label20) {
         QQFrame.label18.setVisible(false);
      }

   }
}
