package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline testFeline;
    @Test
    public void felineEatMeatWillReturnMeatListTest() {
        testFeline = new Feline();
        try {
            List<String> actualFoodReturn = testFeline.eatMeat();
            List<String> expectedFoodReturn = List.of("Животные", "Птицы", "Рыба");
            assertEquals(expectedFoodReturn, actualFoodReturn);
        }
        catch (Exception e) {
            Assert.fail("Exception " + e);
        }
    }

    @Test
    public void felineGetFamilyWillReturnFelineTest() {
        testFeline = new Feline();
        String actualFamilyReturn = testFeline.getFamily();
        String expectedFamilyReturn = "Кошачьи";
        assertEquals(expectedFamilyReturn, actualFamilyReturn);
    }

    @Test
    public void felineGetKittensWithoutArgumentWillReturnOneTest() {
        testFeline = new Feline();
        int actualKittensCOunt = testFeline.getKittens();
        int expectedKittensCount = 1;
        assertEquals(expectedKittensCount, actualKittensCOunt);
    }

}