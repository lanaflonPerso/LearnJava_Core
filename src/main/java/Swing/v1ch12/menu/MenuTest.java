package menu;

import javax.swing.*;
import java.awt.*;

/**
 * @version 1.24 2012-06-12
 * @author Cay Horstmann
 */
public class MenuTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         JFrame frame = new MenuFrame();
         frame.setTitle("MenuTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}