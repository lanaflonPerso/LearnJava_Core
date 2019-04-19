package border;

import javax.swing.*;
import java.awt.*;

/**
 * @version 1.34 2015-06-13
 * @author Cay Horstmann
 */
public class BorderTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         JFrame frame = new BorderFrame();
         frame.setTitle("BorderTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
