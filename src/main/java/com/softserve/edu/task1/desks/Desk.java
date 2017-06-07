package com.softserve.edu.task1.desks;

import java.io.PrintStream;

/**
 * represent chess desk
 * Created by cdc89 on 25.05.2017.
 */
public class Desk {
    private final int height;
    private final int width;

    public Desk(int height, int width) {
        this.height = height;
        this.width = width;
    }

    /**
     * paint chess desk to the console
     */
    public void paint(PrintStream out) {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if ((x + y) % 2 == 0) {
                    out.print("*");
                } else {
                    out.print(" ");
                }
            }
            out.println();
        }
    }
}
