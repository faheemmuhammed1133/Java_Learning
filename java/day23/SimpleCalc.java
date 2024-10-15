import java.awt.event.*; 
import javax.swing.*;

public class SimpleCalc {
   public static void main(String[] args) {
      JFrame f = new JFrame("Simple Calc");
      JTextField num1 = new JTextField();
      JTextField num2 = new JTextField();
      JLabel jl = new JLabel("input number1");
      JLabel jl2 = new JLabel("input number2");
      JLabel result = new JLabel();
      
      jl.setBounds(50,50,100,20);
      jl2.setBounds(50,100,100,20);
      num1.setBounds(150, 50, 150, 20);
      num2.setBounds(150, 100, 150, 20);
      result.setBounds(50,200,100,30);
      JButton aDD = new JButton("Add");
      JButton sUB = new JButton("Substract");
      JButton reset = new JButton("Reset");
      aDD.setBounds(50, 150, 100, 30);
      sUB.setBounds(150, 150, 100, 30);
      reset.setBounds(250, 150,100, 30);
     // int res=0;
      aDD.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) 
         {
               int n1=Integer.parseInt(num1.getText());
               int n2=Integer.parseInt(num2.getText());
               int res=n1+n2;

               result.setText("result = "+res);
               
            }
         });
         sUB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
               int n1=Integer.parseInt(num1.getText());
               int n2=Integer.parseInt(num2.getText());
               int res=n1-n2;

               result.setText("result = "+res);
               
         }
      });
      reset.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) 
         {
               

               num1.setText("");
               num2.setText("");
         }
      });
      f.add(aDD);
      f.add(sUB);
      f.add(reset);
      f.add(num1);
      f.add(num2);
      f.add(jl);
      f.add(jl2);
      f.add(result);
      f.setSize(400, 400);
      f.setLayout(null);
      f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}