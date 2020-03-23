/*
Create a swing GUI that contains a combo box and a textfield. When the user selects any item in 
the combo box it should be displayed in the textfield.
 */
package Nagarjuna;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SetAQues6 {
    JFrame f;
    JPanel p;
    JTextField t;
    public SetAQues6(){
        f = new JFrame("ComboBox ");
        p = new JPanel();
        t = new JTextField(10);
        f.setSize(600,200);
        JLabel l = new JLabel("What's your favourite programming language?");
        String code [] = {"C","C++","Java","Python"};
        JComboBox c = new JComboBox(code);
        c.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent ae){
               String s = (String) c.getSelectedItem();
               t.setText(s);
           } 

        });
        p.add(l);
        p.add(c);
        p.add(t);
        f.add(p);
        f.setVisible(true);
        
        
    }
    public static void main(String[] args) {
        new SetAQues6();
    }
}
