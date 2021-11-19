package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private final int checkedNumber;
    private final int expectedKittensCount;

    public FelineParameterizedTest(int checkedNumber, int expectedKittensCount) {
        this.checkedNumber = checkedNumber;
        this.expectedKittensCount = expectedKittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getParametersForComparison() {
        return new Object[][] {
                {1, 1},
                {1, 1},
                {2, 2},
                {7, 7},
                {34, 34},
                {569, 569},
        };
    }

    @Test
    public void felineGetKittensCompareReturnKittensCountWithParametersTest() {
        Feline testFeline = new Feline();
        int actual = testFeline.getKittens(checkedNumber);
        assertEquals(expectedKittensCount, actual);
    }
}
