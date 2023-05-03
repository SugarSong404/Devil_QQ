package qqstole;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class QQPanel4 extends JPanel {
   private static final long serialVersionUID = 1L;

   protected void paintComponent(Graphics g) {
      int width = this.getWidth();
      int height = this.getHeight();
      super.paintComponent(g);

      try {
         Image image = this.imageFromResource("/images/p3.png");
         g.drawImage(image, 0, 0, width, height, Color.white, (ImageObserver)null);
      } catch (IOException var5) {
         var5.printStackTrace();
      }

   }

   private Image imageFromResource(String url) throws IOException {
      URL imageurl = QQFrame.class.getResource(url);
      BufferedImage image = ImageIO.read(imageurl);
      return image;
   }
}
