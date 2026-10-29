package com.BrianRaymond800.Chess_Planner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

public class Main {

    public static char[] layout = {'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r', 'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'};

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

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                addBoardComponent(translatePieceToURL(layout[j + (i * 8)]), new int[]{25 + (j * 100), 25 + (i * 100), 50, 50}, board, JLayeredPane.MODAL_LAYER);
            }
        }

        frame.add(board);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void addBoardComponent(String componentPath, int[] dimensions, JLayeredPane board, Integer layer){
        if(componentPath != null) {
            URL componentURL = Main.class.getResource(componentPath);
            if (componentURL != null) {
                ImageIcon componentImage = new ImageIcon(componentURL);

                Piece componentLabel = new Piece();
                componentLabel.setIcon(componentImage);
                componentLabel.setBounds(dimensions[0], dimensions[1], dimensions[2], dimensions[3]);

                if(!componentPath.equals("/board.png")) {
                    componentLabel.setupDrag();
                }

                board.add(componentLabel, layer);
            }
        }
    }

    public static String translatePieceToURL(char piece){
        return switch (piece) {
            case 'r' -> "/blackRook.png";
            case 'n' -> "/blackKnight.png";
            case 'b' -> "/blackBishop.png";
            case 'q' -> "/blackQueen.png";
            case 'k' -> "/blackKing.png";
            case 'p' -> "/blackPawn.png";
            case 'P' -> "/whitePawn.png";
            case 'R' -> "/whiteRook.png";
            case 'N' -> "/whiteKnight.png";
            case 'B' -> "/whiteBishop.png";
            case 'Q' -> "/whiteQueen.png";
            case 'K' -> "/whiteKing.png";
            default -> null;
        };
    }
}