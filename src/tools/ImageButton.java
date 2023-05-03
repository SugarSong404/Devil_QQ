package tools;

import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ImageButton extends JButton {
   private static final long serialVersionUID = 1L;
   private URL url;

   public ImageButton(String url, Class<?> cl) {
      this.url = cl.getResource(url);
      Icon icon = new ImageIcon(this.url);
      this.setIcon(icon);
   }
}
