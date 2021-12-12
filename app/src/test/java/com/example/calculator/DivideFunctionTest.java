package com.example.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mariuszgromada.math.mxparser.Expression;

public class DivideFunctionTest {

    @Test
    public void DivideNumberOnNumber(){
        final String givenString = "4/2";

        final String expectedResult = "2.0";
        final Expression result = new Expression(givenString);
        String actualResult = String.valueOf(result.calculate());

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void DivideNumberOnZero(){
        final String givenString = "4/0";

        final String expectedResult = "NaN";
        final Expression result = new Expression(givenString);
        String actualResult = String.valueOf(result.calculate());

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void DivideNumberOnEmptyString(){
        final String givenString = "4/ ";

        final String expectedResult = "NaN";
        final Expression result = new Expression(givenString);
        String actualResult = String.valueOf(result.calculate());

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void EmptyStringDivideOnNumber(){
        final String givenString = " /0";

        final String expectedResult = "NaN";
        final Expression result = new Expression(givenString);
        String actualResult = String.valueOf(result.calculate());

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void EmptyStringDivideOnEmptyString(){
        final String givenString = " / ";

        final String expectedResult = "NaN";
        final Expression result = new Expression(givenString);
        String actualResult = String.valueOf(result.calculate());

        assertEquals(expectedResult, actualResult);
    }

}
