package com.BrianRaymond800.Chess_Planner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class ValidMoveFinderTest {
    @Test
    void TestKingsPawn(){
        ValidMoveFinder finder = new ValidMoveFinder();
        Assertions.assertTrue(finder.isValidMove("RNBKQBNRPPPPPPPP00000000000000000000000000000000pppppppprnbkqbnr", "e4"));
    }
}
