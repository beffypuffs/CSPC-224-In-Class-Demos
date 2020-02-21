import javax.swing.*;
import java.awt.*;

public class helloGoZags
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() ->
         {
            JFrame frame = new helloGoZagsFrame();
            frame.setTitle("Bruce's test");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
         });
   }
}

/**
 * A frame that contains a message panel
 */
class helloGoZagsFrame extends JFrame
{
   public helloGoZagsFrame()
   {
      add(new helloGoZagsComponent());
      pack();
   }
}

/**
 * A component that displays a message.
 */
class helloGoZagsComponent extends JComponent
{
   public static final int MESSAGE_X = 75;
   public static final int MESSAGE_Y = 100;

   private static final int DEFAULT_WIDTH = 500;
   private static final int DEFAULT_HEIGHT = 200;

   public void paintComponent(Graphics g)
   {
      g.drawString("Go Zags!", MESSAGE_X, MESSAGE_Y);
   }
   
   public Dimension getPreferredSize() { return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT); }
}

