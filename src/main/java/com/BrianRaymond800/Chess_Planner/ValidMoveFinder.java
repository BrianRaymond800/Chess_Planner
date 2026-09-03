package com.BrianRaymond800.Chess_Planner;

public class ValidMoveFinder {
    private int convertFileToOffset(char file){
        switch (file) {
            case 'a' -> {
                return 0;
            }
            case 'b' -> {
                return 1;
            }
            case 'c' -> {
                return 2;
            }
            case 'd' -> {
                return 3;
            }
            case 'e' -> {
                return 4;
            }
            case 'f' -> {
                return 5;
            }
            case 'g' -> {
                return 6;
            }
            case 'h' -> {
                return 7;
            }
        }
        return 0;
    }
    public boolean isValidMove(boolean white, String position, String move){
        int offset = convertFileToOffset(move.charAt(0));
        if(white){
            if (move.charAt(1) == 4){
                if(position.charAt(24 + offset) == '0' && (position.charAt(16 + offset) == 'P' || (position.charAt(16 + offset) == '0' && position.charAt(8) == 'P'))){
                    return true;
                }
            } else if(position.charAt(16 + offset) == '0' && position.charAt(8 + offset) == 'P'){
                return true;
            }
        }
        return false;
    }
}
