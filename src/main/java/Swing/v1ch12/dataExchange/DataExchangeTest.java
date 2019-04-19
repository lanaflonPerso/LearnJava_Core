package Swing.v1ch12.dataExchange;

import javax.swing.*;
import java.awt.*;

/**
 * @version 1.34 2015-06-12
 * @author Cay Horstmann
 */
public class DataExchangeTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         JFrame frame = new DataExchangeFrame();
         frame.setTitle("DataExchangeTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
