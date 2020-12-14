package com.company.Assignment1;

import java.awt.geom.Ellipse2D;//https://docs.oracle.com/en/java/javase/13/docs/api/java.desktop/java/awt/geom/Ellipse2D.html
import java.awt.geom.Line2D;//https://docs.oracle.com/en/java/javase/13/docs/api/java.desktop/java/awt/geom/Line2D.html
import java.awt.geom.Point2D;//https://docs.oracle.com/en/java/javase/13/docs/api/java.desktop/java/awt/geom/Point2D.html

public class Problem3 {
    public static void main(String[] args) {
        Line2D line = new Line2D.Double(3,12,17,31);//creating a line from the given initial values
        System.out.printf( "Created 2D Line : x1:%.0f, y1:%.0f, x2:%.0f, y2:%.0f\n", line.getX1(), line.getY1(), line.getX2(), line.getY2());
        line.setLine(line.getP1(),new Point2D.Double(9,13));//set line is to set the points of the line
        // getP1() returns the start points of 2Dline Point2D.Double defines a point specified in double precision.
        System.out.println("After changing the end points");
        System.out.printf( "Created 2D Line : x1:%.0f, y1:%.0f, x2:%.0f, y2:%.0f\n", line.getX1(), line.getY1(), line.getX2(), line.getY2());
        //creating an ellipse now
        Ellipse2D ellipse = new Ellipse2D.Double(4,13,60,25);
        System.out.printf("\nCreated Ellipse : x1:%.0f, y1:%.0f, width:%.0f, height:%.0f\n", ellipse.getX(), ellipse.getY(),ellipse.getWidth(),ellipse.getHeight());

    }
}
