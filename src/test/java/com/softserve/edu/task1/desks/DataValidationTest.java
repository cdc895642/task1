package com.softserve.edu.task1.desks;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cdc89 on 31.05.2017.
 */
public class DataValidationTest {

    private final String RULES = "input correct values for height and width "
            + "of the "
            + "chess desk";
    private final int NEGATIVE_HEIGHT = -1;
    private final int NEGATIVE_WIDTH = -1;

    @Test
    public void IsHaveError_NoArgs_True() {
        //Arrange & Act
        DataValidation dataValidation = new DataValidation(new String[]{});
        //Assert
        assertTrue(dataValidation.isHaveError());
        assertEquals(dataValidation.getMessage(), RULES);
        assertEquals(dataValidation.getHeight(), NEGATIVE_HEIGHT);
        assertEquals(dataValidation.getWidth(), NEGATIVE_WIDTH);
    }

    @Test
    public void IsHaveError_OneArgs_True() {
        //Arrange & Act
        DataValidation dataValidation = new DataValidation(new String[]{"1"});
        //Assert
        assertTrue(dataValidation.isHaveError());
        assertEquals(dataValidation.getMessage(), RULES);
        assertEquals(dataValidation.getHeight(), NEGATIVE_HEIGHT);
        assertEquals(dataValidation.getWidth(), NEGATIVE_WIDTH);
    }

    @Test
    public void IsHaveError_TwoArgsNoNumber_True() {
        //Arrange & Act
        DataValidation dataValidation = new DataValidation(new String[]{"1",
                "a"});
        //Assert
        assertTrue(dataValidation.isHaveError());
        assertEquals(dataValidation.getMessage(), RULES);
        assertEquals(dataValidation.getHeight(), NEGATIVE_HEIGHT);
        assertEquals(dataValidation.getWidth(), NEGATIVE_WIDTH);
    }

    @Test
    public void IsHaveError_TwoArgsNumbersOneZero_True() {
        //Arrange & Act
        DataValidation dataValidation = new DataValidation(new String[]{"1",
                "0"});
        //Assert
        assertTrue(dataValidation.isHaveError());
        assertEquals(dataValidation.getMessage(), RULES);
        assertEquals(dataValidation.getHeight(), NEGATIVE_HEIGHT);
        assertEquals(dataValidation.getWidth(), NEGATIVE_WIDTH);
    }

    @Test
    public void IsHaveError_TwoArgsNumbers_False() {
        //Arrange & Act
        DataValidation dataValidation = new DataValidation(new String[]{"1",
                "2"});
        //Assert
        assertFalse(dataValidation.isHaveError());
        assertNull(dataValidation.getMessage());
        assertEquals(dataValidation.getHeight(), 1);
        assertEquals(dataValidation.getWidth(), 2);
    }
}
