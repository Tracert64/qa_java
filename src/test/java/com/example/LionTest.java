package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    Feline testFeline;
    Lion testLion;
    @Before public void prep() throws Exception{ testFeline = new Feline();
        testLion = new Lion(testFeline, "Самка");
    }

    @Test
    public void lionGetKittensWillReturnOneTest() {
            int actualKittensCount = testLion.getKittens();
            int expectedKittensCount = 1;
            assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void lionGetFoodWillReturnMeatListTest() {
        try {
            List<String> actualFoodReturn = testLion.getFood();
            List<String> expectedFoodReturn = List.of("Животные", "Птицы", "Рыба");
            assertEquals(expectedFoodReturn, actualFoodReturn);
        }
        catch (Exception animalFoodException) {
            Assert.fail("Exception " + animalFoodException);
        }
    }

    @Mock
    Feline mockFeline;
    @Test
    public void lionSexExceptionMessageHaveCorrectTextTest() {
        try {
            new Lion(mockFeline, "Некорректный пол");
        }
        catch (Exception lionSexException) {
            String actualExceptionText = lionSexException.getMessage();
            String expectedExceptionText = "Используйте допустимые значения пола животного - самец или самка";
            assertEquals(expectedExceptionText, actualExceptionText);
        }
    }


}