package com.BrianRaymond800.Chess_Planner;

public class BoardSetup {
    private char[] pieces;
    private Boolean[] castle;
    private int enPassant;
    private Boolean whiteTurn;

    public BoardSetup() {
        resetBoard();
    }

    public void resetBoard() {
        pieces = new char[]{'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p', 'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r'};
        castle = new Boolean[]{true, true, true, true};
        enPassant = 0;
        whiteTurn = true;
    }
}
