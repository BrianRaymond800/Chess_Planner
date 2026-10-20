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
        frame.getContentPane().setBackground(Color.black);

        JLayeredPane board = new JLayeredPane();
        board.setBounds(0, 0, 800, 800);
        addBoardComponent("/board.png", new int[]{0, 0, 800, 800}, board, JLayeredPane.PALETTE_LAYER);
        addBoardComponent("/blackRook.png", new int[]{25, 25, 50, 50}, board, JLayeredPane.MODAL_LAYER);

        frame.add(board);
        frame.setVisible(true);
    }

    public static void addBoardComponent(String componentPath, int[] dimensions, JLayeredPane board, Integer layer){
        URL componentURL = Main.class.getResource(componentPath);
        ImageIcon componentImage = new ImageIcon(componentURL);

        JLabel componentLabel = new JLabel();
        componentLabel.setIcon(componentImage);
        componentLabel.setBounds(dimensions[0], dimensions[1], dimensions[2], dimensions[3]);

        board.add(componentLabel, layer);
    }
}