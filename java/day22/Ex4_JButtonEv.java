import java.awt.event.*; //ActionListener interface is found in java.awt.event package. 
import javax.swing.*;

public class Ex4_JButtonEv {
   public static void main(String[] args) {
      JFrame f = new JFrame("Button Example");
      JTextField tf = new JTextField();
      tf.setBounds(50, 50, 150, 20);
      JButton b = new JButton("Click Here");
      b.setBounds(50, 100, 95, 30);
      // Java ActionListener is notified whenever you click on the button. It is
      // notified against //ActionEvent.
      // Registering the button component with its Listener (ActionListener)
      b.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) // Write the action that you want to perform when button is clicked
                                                    // in the method actionPerformed
         {
            tf.setText("I am a button");
         }
      });
      f.add(b);
      f.add(tf);
      f.setSize(400, 400);
      f.setLayout(null);
      f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}