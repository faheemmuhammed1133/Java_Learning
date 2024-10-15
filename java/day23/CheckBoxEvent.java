import javax.swing.*;
import java.awt.*;
// import java.awt.event.ItemEvent;
// import java.awt.event.ItemListener;
public class CheckBoxEvent {
   CheckBoxEvent(){
      JFrame f= new JFrame("CheckBox Example");

      JLabel l1=new JLabel();
      l1.setBounds(10, 10, 250, 50);

      JLabel l2=new JLabel();
      l2.setBounds(10, 30, 250, 50);

      JCheckBox Jc1=new JCheckBox("C++");
      Jc1.setBounds(10, 60, 150, 50);

      JCheckBox Jc2=new JCheckBox("java");
      Jc2.setBounds(10, 90, 150, 50);

      f.add(l1);f.add(l2);f.add(Jc1);f.add(Jc2);

      Jc1.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e){
            l1.setText("C++ CheckBox:"+(e.getStateChange()==1?"Checked":"Unchecked"));
         } 
      });
      
      Jc2.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e){
            l2.setText("C++ CheckBox:"+(e.getStateChange()==1?"Checked":"Unchecked"));
         } 
      });

      f.setSize(400,500);
      f.setLayout(null);
      f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   }

   public static void main(String[] args) {
      new CheckBoxEvent();
   }
}
