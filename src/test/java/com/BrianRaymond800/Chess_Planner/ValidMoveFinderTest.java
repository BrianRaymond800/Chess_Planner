package com.BrianRaymond800.Chess_Planner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class ValidMoveFinderTest {
    @Test
    void TestVantKrujis(){
        ValidMoveFinder finder = new ValidMoveFinder();
        Assertions.assertTrue(finder.isValidMove(true, "RNBKQBNRPPPPPPPP00000000000000000000000000000000pppppppprnbkqbnr", "e3"));
    }
}
