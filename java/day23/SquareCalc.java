import java.awt.event.*; 
import javax.swing.*;

public class SquareCalc {
   public static void main(String[] args) {
      JFrame f = new JFrame("Square Calc");
      JTextField tf = new JTextField(10);
      JLabel jl = new JLabel("input number");
      
      tf.setBounds(150, 50, 150, 20);
      JButton b = new JButton("Calculate Square");
      b.setBounds(50, 100, 95, 30);
      jl.setBounds(40,50,100,20);
      
      b.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) 
         {
               int num=Integer.parseInt(tf.getText());
               int res= num*num;

               tf.setText("square  " + res);
         }
      });
      f.add(b);
      f.add(tf);
      f.add(jl);
      f.setSize(400, 400);
      f.setLayout(null);
      f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}