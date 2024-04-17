/*
Q. Create a swing GUI that contains  a combo box and textfield.
When the user select any item in the combo box it should be displayed in the textfield.
 */
package Prime;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Ques1 {
    JComboBox c;
    JTextField t;
    JLabel l;
    public  Ques1(){
        JFrame f = new JFrame("Swing GUI");
        f.setSize(500,300);
        
        JPanel p = new JPanel();
        
        l = new JLabel("Favourite Programming Language : ");
        String lang [] = {"C","C++","Java","Python","JavaScript"};
        c = new JComboBox(lang);
        
        t = new JTextField(10);
        
        c.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent ae){
               String s;
               s = (String) c.getSelectedItem();
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
        new Ques1();
    }
}
