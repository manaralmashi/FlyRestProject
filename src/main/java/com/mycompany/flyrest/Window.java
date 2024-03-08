package com.mycompany.flyrest;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Lamis
 */
public class Window extends JFrame {

    JLabel L1;

    /**
     * Window
     * @param title
     * @param Picture 
     * @description Constructor
     */
    public Window(String title, String Picture) {

        setTitle(title); // to set the title of the Window
        setSize(2000, 2000); // set the size
        setLocationRelativeTo(null); // to open the Window in the center of he screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setVisible(true); //to show the Window
        setContentPane(new JLabel(new ImageIcon(Picture)));
        setLayout(new FlowLayout());
        L1 = new JLabel();
        add(L1);
        setSize(2000, 2000);

    }

}
 