package com.BrianRaymond800.Chess_Planner;

public class ValidMoveFinder {
    public boolean isValidMove(boolean white, String position, String move){
        if(white == true){
            if(position.charAt(37) == '0'){
                return true;
            }
        }
        return false;
    }
}
