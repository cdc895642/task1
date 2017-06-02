package com.softserve.edu.task1;

import com.softserve.edu.task1.desks.DataValidation;
import com.softserve.edu.task1.desks.Desk;

/**
 * Created by cdc89 on 31.05.2017.
 * entry point
 */
public class App {

    public static void main(String[] args) {
        DataValidation dataValidation = new DataValidation(args);
        if (dataValidation.isHaveError()) {
            System.out.print(dataValidation.getMessage());
            return;
        }
        int height = dataValidation.getHeight();
        int width = dataValidation.getWidth();
        Desk desk = new Desk(height, width);
        desk.paint();
    }
}
