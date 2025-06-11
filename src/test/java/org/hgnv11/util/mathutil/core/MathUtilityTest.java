package org.hgnv11.util.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test // tuong duong ham main co the run nhu ham main
    public void verifyFactorialGiveRightArg0RunsWell() {
        assertEquals(1, MathUtility.getFactorial(0));
    }

    @Test
    public void verifyFactorialGiveRightArg1RunsWell() {
        assertEquals(1, MathUtility.getFactorial(1));
    }

    @Test
    public void verifyFactorialGiveRightArg2RunsWell() {
        assertEquals(2, MathUtility.getFactorial(2));
    }
    @Test
    public void verifyFactorialGiveRightArg3RunsWell() {
        assertEquals(6, MathUtility.getFactorial(3));
    }

}