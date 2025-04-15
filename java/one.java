// import java.awt.*;
// import java.util.*;

import javax.swing.*;
public class one {
   public static void main(String[] args) {
      JFrame a=new JFrame("tap");
      a.setBounds(500,500,100,100);
      JButton b=new JButton("tap");
      JLabel l=new JLabel();
      a.add(b);
      a.add(l);
      b.setBounds(0, 0, 0, 0);
      l.setBounds(0, 100, 0, 0);
      a.setDefaultCloseOperation(0);
    }
   
}