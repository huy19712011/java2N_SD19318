package com.mycompany.java2n_sd19318;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Java2N_SD19318 extends JFrame{

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setTitle("Swing Frame Demo");
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imageIcon = new ImageIcon("vit.gif");
        frame.setIconImage(imageIcon.getImage());

        frame.getContentPane().setBackground(Color.GRAY);
    }
}
