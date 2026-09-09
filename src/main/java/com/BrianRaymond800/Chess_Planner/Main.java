package com.BrianRaymond800.Chess_Planner;
import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Chess Planner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1400, 837);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.black);

        URL boardURL = Main.class.getResource("/board.png");
        ImageIcon boardImage = new ImageIcon(boardURL);

        JLabel boardLabel = new JLabel();
        boardLabel.setIcon(boardImage);
        boardLabel.setVerticalAlignment(JLabel.TOP);

        frame.add(boardLabel);
    }
}