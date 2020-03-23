/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nagarjuna;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class SetBQues6 {
    public SetBQues6(){
        JFrame f = new JFrame("List ");
        f.setSize(500,400);
        JPanel p = new JPanel();
        JLabel l = new JLabel("Programming Languages : ");
        
        String [] lang = {"C","C++","Java","Python"};
        
        JTextField t = new JTextField(10);
        JList list = new JList(lang);
        
        list.addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent arg0) {
                if (!arg0.getValueIsAdjusting()) {
                  t.setText(list.getSelectedValue().toString());
                }
            }
        });
        p.add(l);
        p.add(list);
        p.add(t);
        f.add(p);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new SetBQues6();
    }
}
