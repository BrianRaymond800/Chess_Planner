package com.BrianRaymond800.Chess_Planner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

public class Main {

    public static char[] layout = {'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r', 'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'};
    //The initial layout of a chess board
    private static Piece[][] position = new Piece[8][8];

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Chess Planner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1400, 837);
        frame.getContentPane().setBackground(Color.black);
        //Setting up the basic frame

        JLayeredPane board = new JLayeredPane();
        board.setBounds(0, 0, 800, 800);
        addBoardComponent("/board.png", new int[]{0, 0, 800, 800}, board, JLayeredPane.PALETTE_LAYER);

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                Piece currentPiece = addBoardComponent(translatePieceToURL(layout[j + (i * 8)]), new int[]{(j * 100), (i * 100), 100, 100}, board, JLayeredPane.MODAL_LAYER);
                position[j][i] = currentPiece;
            }
        }
        //Adding the board and pieces

        frame.add(board);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static Piece addBoardComponent(String componentPath, int[] dimensions, JLayeredPane board, Integer layer){
        if(componentPath != null) {
            URL componentURL = Main.class.getResource(componentPath);
            if (componentURL != null) {
                ImageIcon componentImage = new ImageIcon(componentURL);

                Piece componentLabel = new Piece();
                componentLabel.setIcon(componentImage);
                componentLabel.setBounds(dimensions[0], dimensions[1], dimensions[2], dimensions[3]);
                //Creates the board and each piece

                if(!componentPath.equals("/board.png")) {
                    componentLabel.setupDrag(newLocation -> {
                        for(int i = 0; i < 8; i ++) {
                            for(int j = 0; j < 8; j ++) {
                                if(position[i][j] == componentLabel) {
                                    position[i][j] = null;
                                }
                            }
                        }
                        //Remove the piece from its current location
                        if(position[newLocation.x / 100][newLocation.y / 100] != null) {
                            board.remove(position[newLocation.x / 100][newLocation.y / 100]);
                        }
                        //Capture anything at the new location
                        position[newLocation.x / 100][newLocation.y / 100] = componentLabel;
                        //Put the piece in the new location
                        board.repaint();
                    });
                }
                //Only the pieces can be moved

                board.add(componentLabel, layer);

                return componentLabel;
            }
        }
        return null;
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
            //Translates the one character piece reference to the image file path
        };
    }
}