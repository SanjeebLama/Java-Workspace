/*
Write a program to demostrate key event handling using keyListener.
 */
package Nagarjuna;
import java.awt.*;
import java.awt.event.*;

public class SetBQues5 {
    public SetBQues5(){
        Frame f = new Frame("Key Event Handling");
        f.setSize(500,400);
        
        Panel p = new Panel();
        Label l = new Label("                                           ");
        TextField t = new TextField(10);
        t.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                l.setText("keyPressed Event");
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
            
        });
        p.add(t);
        p.add(l);
        f.add(p);
        f.setVisible(true);
    }public static void main(String[] args) {
        new SetBQues5();
    }
}
