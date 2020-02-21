package image;

import java.awt.*;
import javax.swing.*;

public class ImageTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() ->
         {
            JFrame frame = new ImageFrame();
            frame.setTitle("Bruce dice test");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
         });
   }
}

/**
 * A frame with an image component
 */
class ImageFrame extends JFrame
{
   public ImageFrame()
   {
      add(new ImageComponent());
      pack();
   }
}

/**
 * A component that displays a tiled image
 */
class ImageComponent extends JComponent
{
   private static final int DEFAULT_WIDTH = 1000;
   private static final int DEFAULT_HEIGHT = 600;

   private Image image1, image2;

   public ImageComponent()
   {
      image1 = new ImageIcon("3up.jpg").getImage();
      image2 = new ImageIcon("5up.jpg").getImage();
   }

   public void paintComponent(Graphics g)
   {
      if (image1 == null) return;

      int image1Width = image1.getWidth(null);
      int image1Height = image1.getHeight(null);

      // draw the image in the upper-left corner

      g.drawImage(image1, 100, 100, null);
      g.drawImage(image2, 150 + image1Width, 100, null);
      
   }
   
   public Dimension getPreferredSize() { return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT); }
}

