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

        URL boardURL = Main.class.getResource("/board.png");
        ImageIcon boardImage = new ImageIcon(boardURL);

        URL blackRookURL = Main.class.getResource("/blackRook.png");
        ImageIcon blackRookImage = new ImageIcon(blackRookURL);

        JLabel boardLabel = new JLabel();
        boardLabel.setIcon(boardImage);
        boardLabel.setBounds(0, 0, 800, 800);

        JLabel blackRookLabel = new JLabel();
        blackRookLabel.setIcon(blackRookImage);
        blackRookLabel.setBounds(25, 25, 50, 50);

        JLayeredPane board = new JLayeredPane();
        board.setBounds(0, 0, 800, 800);
        board.add(boardLabel, JLayeredPane.PALETTE_LAYER);
        board.add(blackRookLabel, JLayeredPane.MODAL_LAYER);

        frame.add(board);
        frame.setVisible(true);
    }
}