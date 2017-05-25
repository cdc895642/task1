package com.softserve.edu.task1;

import com.softserve.edu.task1.desks.Desk;

import java.text.NumberFormat;
import java.text.ParseException;

/**
 * entry point
 */
public class App 
{
    public static void main( String[] args ) throws ParseException {
        NumberFormat numberFormat=NumberFormat.getNumberInstance();
        int height=numberFormat.parse(args[0]).intValue();
        int width=numberFormat.parse(args[1]).intValue();
        Desk desk=new Desk(height,width);
        desk.paint();
    }
}
