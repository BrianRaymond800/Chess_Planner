package com.BrianRaymond800.Chess_Planner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class ValidMoveFinderTest {
    @Test
    void TestOneStepPawnValid(){
        ValidMoveFinder finder = new ValidMoveFinder();
        Assertions.assertTrue(finder.isValidMove(true, "RNBKQBNRPPPPPPPP00000000000000000000000000000000pppppppprnbkqbnr", "e3"));
    }

    @Test
    void TestTwoStepPawnValid(){
        ValidMoveFinder finder = new ValidMoveFinder();
        Assertions.assertTrue(finder.isValidMove(true, "RNBKQBNRPPPPPPPP00000000000000000000000000000000pppppppprnbkqbnr", "d4"));
    }
    @Test
    void TestOneStepPawnBlocked(){
        ValidMoveFinder finder = new ValidMoveFinder();
        Assertions.assertFalse(finder.isValidMove(true, "RNBKQBNRPPPPPPPP00r00000000000000000000000000000pppppppprnbkqbnr", "c3"));
    }

    @Test
    void TestTwoStepPawnNoPawn(){
        ValidMoveFinder finder = new ValidMoveFinder();
        Assertions.assertFalse(finder.isValidMove(true, "RNBKQBNRPPPPP0PP00000000000000000000000000000000pppppppprnbkqbnr", "f4"));
    }
}
