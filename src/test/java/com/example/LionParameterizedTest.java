package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    private final String checkedSex;
    private final boolean expectedDoesHaveManeResult;

    public LionParameterizedTest(String checkedSex, boolean expectedDoesHaveManeResult) {
        this.checkedSex = checkedSex;
        this.expectedDoesHaveManeResult = expectedDoesHaveManeResult;
    }

    @Parameterized.Parameters
    public static Object[][] getSexAndExpectedManeData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }


    @Mock
    Feline mockFeline;
    @Test
    public void lionDoesHaveManeCompareManePresenceWithParametersTest() {
        try {
            Lion parameterizedLion = new Lion(mockFeline, checkedSex);
            boolean actualDoesHaveManeResult = parameterizedLion.doesHaveMane();
            assertEquals(expectedDoesHaveManeResult, actualDoesHaveManeResult);
        }
        catch (Exception lionSexException) {
            Assert.fail("Exception " + lionSexException);
        }
    }

}
