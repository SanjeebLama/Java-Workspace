/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orchid;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SetBQues15 {
    JTextField t;
    JButton b;
    JLabel l;
    public SetBQues15(){
        JFrame f = new JFrame("Font demonstration");
        f.setSize(400,400);
        
        JPanel p = new JPanel();
      
        t = new JTextField(10);
        b = new JButton("Magic");
        b.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent ae){
               Font f = new Font("Times New Roman",Font.BOLD,30);
               t.setFont(f);
               
           } 
        });
        p.add(t);
        p.add(b);
        f.add(p);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new SetBQues15();
    }
}
