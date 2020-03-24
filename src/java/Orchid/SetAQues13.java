/*
Q. Create an applet with two buttons.
When the buttons are clicked background color of buttons 
should be changed accordingly.
 */
package Orchid;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
    <applet code = "SetAQues13">
    </applet>
*/
public class SetAQues13 extends Applet implements ActionListener{
    Button b2,b1;

    public SetAQues13(){
        b1 = new Button("RED");
        b2 = new Button("BLUE");
        
        b1.addActionListener(this);
        b2.addActionListener(this);
       add(b1);
       add(b2);
       
    }
    public void actionPerformed(ActionEvent ae){
        String color = ae.getActionCommand();
        showStatus(color);
        if(color == "RED"){
            setBackground(Color.RED);
        }else{
            setBackground(Color.BLUE);
        }
    }
    
}
