/*
Write a program to demonstrate menus and submenus.
 */
package Nagarjuna;

import java.awt.*;

public class SetBQues8 {

    public SetBQues8() {
        Frame f = new Frame("Menu in Java");
        MenuBar mb = new MenuBar();
        Menu file = new Menu("File");
        MenuItem open = new MenuItem("Open");
        file.add(open);
        mb.add(file);


        
        Menu submenu = new Menu("Sub menu");
        MenuItem i1 = new MenuItem("item 1");
        
        submenu.add(i1);
        file.add(submenu);
        f.setMenuBar(mb);

        f.setSize(400, 400);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new SetBQues8();
    }
}
