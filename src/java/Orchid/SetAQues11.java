/*
Q. Create a swing GUI with two textfields and button.
When the button is clicked content of first text field should be copied to second tetfield.
 */
package Orchid;

/**
 *
 * @author USER
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SetAQues11 {
    JTextField t1,t2;
    JButton b;
    public SetAQues11(){
        JFrame f = new JFrame("Swing GUI");
        f.setSize(400,400);
        
        JPanel p = new JPanel();
        
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        b = new JButton("Copy");
        
        b.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent ae){
               String s;
               s = t1.getText();
               t2.setText(s);
           } 
        });
        
        p.add(t1);
        p.add(b);
        p.add(t2);
        f.add(p);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new SetAQues11();
    }
}
