package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline mockFeline;

    @Test
    public void catGetSoundWillReturnSoundTest() {
        Cat testCatWithMock = new Cat(mockFeline);
        String actualCatSound = testCatWithMock.getSound();
        String expectedCatSound = "Мяу";
        assertEquals(expectedCatSound, actualCatSound);

    }

    @Test
    public void catGetFoodWillReturnMeatListTest() {
        Feline testFeline = new Feline();
        Cat testCat = new Cat(testFeline);
        try {
            List<String> actualFoodReturn = testCat.getFood();
            List<String> expectedFoodReturn = List.of("Животные", "Птицы", "Рыба");
            assertEquals(expectedFoodReturn, actualFoodReturn);
        }
        catch (Exception animalFoodException) {
            Assert.fail("Exception " + animalFoodException);
        }

    }
}