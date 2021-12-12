package com.example.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BTNSqrtFunctionTest {

    @Test
    public void SquareRootOfNumber(){
        final String givenString = "4";

        final int expectedResult = 2;
        final int actualResult = (int) Math.sqrt(Double.parseDouble(givenString));

        assertEquals(expectedResult, actualResult);
    }

}
