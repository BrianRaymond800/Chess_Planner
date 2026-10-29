package com.BrianRaymond800.Chess_Planner;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Piece extends JLabel {
    public void setupDrag() {
        MouseAdapter dragListener = new MouseAdapter() {
            private int screenX = 0;
            private int screenY = 0;
            private int componentX = 0;
            private int componentY = 0;
            //Defines the coordinates of the piece and the mouse

            @Override
            public void mousePressed(MouseEvent e) {
                screenX = e.getXOnScreen();
                screenY = e.getYOnScreen();
                componentX = getX();
                componentY = getY();
                //Updates the coordinates
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                int deltaX = e.getXOnScreen() - screenX;
                int deltaY = e.getYOnScreen() - screenY;

                setLocation((componentX + deltaX) / 100 * 100 + 25, (componentY + deltaY) / 100 * 100 + 25);
                //Moves the piece with the mouse, but snaps to the grid
            }
        };

        addMouseListener(dragListener);
        addMouseMotionListener(dragListener);
    }
}
