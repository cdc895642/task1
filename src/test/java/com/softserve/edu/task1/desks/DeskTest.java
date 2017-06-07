package com.softserve.edu.task1.desks;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by cdc89 on 03.06.2017.
 */
public class DeskTest {
    @Test
    public void Paint_FourFour_PaintDesk() {
        //Arrange
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        DataValidation dataValidation = mock(DataValidation.class);
        when(dataValidation.getHeight()).thenReturn(4);
        when(dataValidation.getWidth()).thenReturn(4);
        Desk desk = new Desk(dataValidation.getHeight(), dataValidation.getWidth
                ());
        String[][] expected = new String[][]{
                {"*", " ", "*", " "},
                {" ", "*", " ", "*"},
                {"*", " ", "*", " "},
                {" ", "*", " ", "*"}
        };

        //Act
        desk.paint(new PrintStream(outContent));
        String[][] result = byteArrayToStringArray(outContent, dataValidation
                .getHeight(), dataValidation.getWidth());

        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    public void Paint_FourThree_PaintDesk() {
        //Arrange
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        DataValidation dataValidation = mock(DataValidation.class);
        when(dataValidation.getHeight()).thenReturn(4);
        when(dataValidation.getWidth()).thenReturn(3);
        Desk desk = new Desk(dataValidation.getHeight(), dataValidation.getWidth
                ());
        String[][] expected = new String[][]{
                {"*", " ", "*"},
                {" ", "*", " "},
                {"*", " ", "*"},
                {" ", "*", " "}
        };

        //Act
        desk.paint(new PrintStream(outContent));
        String[][] result = byteArrayToStringArray(outContent, dataValidation
                .getHeight(), dataValidation.getWidth());

        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    public void Paint_ThreeFour_PaintDesk() {
        //Arrange
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        DataValidation dataValidation = mock(DataValidation.class);
        when(dataValidation.getHeight()).thenReturn(3);
        when(dataValidation.getWidth()).thenReturn(4);
        Desk desk = new Desk(dataValidation.getHeight(), dataValidation.getWidth
                ());
        String[][] expected = new String[][]{
                {"*", " ", "*", " "},
                {" ", "*", " ", "*"},
                {"*", " ", "*", " "}
        };

        //Act
        desk.paint(new PrintStream(outContent));
        String[][] result = byteArrayToStringArray(outContent, dataValidation
                .getHeight(), dataValidation.getWidth());

        //Assert
        assertArrayEquals(expected, result);
    }

    private String[][] byteArrayToStringArray(ByteArrayOutputStream
                                                      outContent, int
                                                      height, int width) {
        String[][] result = new String[height][width];
        String out=outContent.toString().replaceAll("[\\r\\n]", "");
        char[] temp = out.toCharArray();
        int current = 0;
        for (int y = 0; y < height; y++) {
            String[] line = new String[width];
            for (int x = 0; x < width; x++) {
                line[x] = temp[current++] + "";
            }
            result[y] = line;
        }
        return result;
    }
}
