/*
Write an applet consisting of two textfield and a button "Sum of Digits".
When the button is pushed the square of digit of the input in first textfield should be displayed in second 
text field.
 */
package Nagarjuna;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
    <applet class = "SetAQues5">
    </applet>
*/
public class SetAQues5 extends Applet {
    TextField t1,t2;
    Button b;
    public SetAQues5(){
        Panel p = new Panel();
        t1 = new TextField(10);
        b = new Button("Sum of Digits");
        t2 = new TextField(10);
        b.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent ae){
               int i;
               i = Integer.parseInt(t1.getText());
               i = i*i;
               t2.setText(i+" ");
           } 
        });
        p.add(t1);
        p.add(b);
        p.add(t2);
        add(p);
    }
}
