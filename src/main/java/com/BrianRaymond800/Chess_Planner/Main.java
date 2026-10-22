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
        addBoardComponent("/blackKnight.png", new int[]{125, 25, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/blackBishop.png", new int[]{225, 25, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/blackQueen.png", new int[]{325, 25, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/blackKing.png", new int[]{425, 25, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/blackBishop.png", new int[]{525, 25, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/blackKnight.png", new int[]{625, 25, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/blackRook.png", new int[]{725, 25, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/blackPawn.png", new int[]{25, 125, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/blackPawn.png", new int[]{125, 125, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/blackPawn.png", new int[]{225, 125, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/blackPawn.png", new int[]{325, 125, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/blackPawn.png", new int[]{425, 125, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/blackPawn.png", new int[]{525, 125, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/blackPawn.png", new int[]{625, 125, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/blackPawn.png", new int[]{725, 125, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/whitePawn.png", new int[]{25, 625, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/whitePawn.png", new int[]{125, 625, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/whitePawn.png", new int[]{225, 625, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/whitePawn.png", new int[]{325, 625, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/whitePawn.png", new int[]{425, 625, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/whitePawn.png", new int[]{525, 625, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/whitePawn.png", new int[]{625, 625, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/whitePawn.png", new int[]{725, 625, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/whiteRook.png", new int[]{25, 725, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/whiteKnight.png", new int[]{125, 725, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/whiteBishop.png", new int[]{225, 725, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/whiteQueen.png", new int[]{325, 725, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/whiteKing.png", new int[]{425, 725, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/whiteBishop.png", new int[]{525, 725, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/whiteKnight.png", new int[]{625, 725, 50, 50}, board, JLayeredPane.MODAL_LAYER);
        addBoardComponent("/whiteRook.png", new int[]{725, 725, 50, 50}, board, JLayeredPane.MODAL_LAYER);

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