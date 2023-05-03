
package tools;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

public abstract class YcSimpleLayout implements LayoutManager {
   public void addLayoutComponent(String name, Component comp) {
   }

   public void removeLayoutComponent(Component comp) {
   }

   public Dimension preferredLayoutSize(Container parent) {
      return null;
   }

   public Dimension minimumLayoutSize(Container parent) {
      return null;
   }
}
