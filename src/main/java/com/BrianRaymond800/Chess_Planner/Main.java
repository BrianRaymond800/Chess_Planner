package com.BrianRaymond800.Chess_Planner;
import javax.swing.JFrame;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Chess Planner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1600, 900);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.black);
    }
}
