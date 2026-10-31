package com.BrianRaymond800.Chess_Planner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.function.Consumer;

public class Piece extends JLabel {
    public void setupDrag(Consumer<Point> consumer) {
        MouseAdapter dragListener = new MouseAdapter() {
            private int screenX = 0;
            private int screenY = 0;
            private int componentX = 0;
            private int componentY = 0;
            private final Consumer<Point> onDragFinished = consumer;
            //Defines the coordinates of the piece and the mouse

            @Override
            public void mousePressed(MouseEvent e) {
                screenX = e.getXOnScreen();
                screenY = e.getYOnScreen();
                componentX = getX() + 50;
                componentY = getY() + 50;
                //Updates the coordinates
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                int deltaX = e.getXOnScreen() - screenX;
                int deltaY = e.getYOnScreen() - screenY;

                setLocation((componentX + deltaX) / 100 * 100, (componentY + deltaY) / 100 * 100);
                //Moves the piece with the mouse, but snaps to the grid
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if(onDragFinished != null) {
                    onDragFinished.accept(getLocation());
                }
            }
        };

        addMouseListener(dragListener);
        addMouseMotionListener(dragListener);
    }
}
