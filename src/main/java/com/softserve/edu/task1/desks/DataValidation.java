package com.softserve.edu.task1.desks;

import java.text.NumberFormat;
import java.text.ParseException;

/**
 * Created by cdc89 on 27.05.2017.
 * check input data. if input data is correct return converted to int height
 * and width, else - return negative values
 */
public class DataValidation {
    private final String RULES = "input correct values for height and width "
            + "of the "
            + "chess desk";
    private int height = -1;
    private int width = -1;
    private String message;

    /**
     * @param args array must have two elements. First - height, second -
     *             width
     */
    public DataValidation(String[] args) {
        if (args.length != 2) {
            message = RULES;
            return;
        }
        parseInput(args);
        if (message == null) {
            inputValidation();
        }
    }

    /**
     * return true if data incorrect
     *
     * @return return true if data incorrect
     */
    public boolean isHaveError() {
        if (message != null) {
            return true;
        }
        return false;
    }

    public int getHeight() {
        return height = message != null ? -1 : height;
    }

    public int getWidth() {
        return width = message != null ? -1 : width;
    }

    public String getMessage() {
        return message;
    }

    private void parseInput(String[] args) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        try {
            height = numberFormat.parse(args[0]).intValue();
            width = numberFormat.parse(args[1]).intValue();
            if (height==0 || width==0){
                throw new IllegalArgumentException();
            }
        } catch (ParseException | IllegalArgumentException e) {
            message = RULES;
        }
    }

    private void inputValidation() {
        if (height <= 0 || width <= 0) {
            message = RULES;
        }
    }
}
