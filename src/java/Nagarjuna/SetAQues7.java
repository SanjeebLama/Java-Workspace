/*
Q. Write a program to demostrate the mouse event handling by using adapter class
 */
package Nagarjuna;
import java.awt.*;
import java.awt.event.*;
public class SetAQues7 {
    Label l1, l2, l3;
    public SetAQues7(){
        Frame f = new Frame("Mouse Handling Event");
        f.setSize(400,400);
        Panel p = new Panel(new GridLayout(3,1));
        l1 = new Label("Mouse Event Handling Program",Label.CENTER);
        l2 = new Label("Interact here to see the result",Label.CENTER);
        l3 = new Label("",Label.CENTER);
//        l2.addMouseListener(new MouseListener(){
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                int x,y;
//                x = e.getX();
//                y = e.getY();
//                l3.setText("Result : ("+x+" , "+y+" )");
//            }   
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//            }
//            
//        });
    l2.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e){
             int x,y;
                x = e.getX();
                y = e.getY();
                l3.setText("Result : ("+x+" , "+y+" )");
        }
    });
        p.add(l1);
        p.add(l2);
        p.add(l3);
        f.add(p);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new SetAQues7();
    }
}
