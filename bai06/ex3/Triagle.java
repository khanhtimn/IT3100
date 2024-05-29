package bai06.ex3;

import java.awt.*;

public class Triagle {
    public static void main(String[] args) {
        // Tạo ra một Bundle với màu xanh
        Bundle graphicsBundle = new Bundle(Color.BLUE);


        // Tao ra mot Polygon voi Bundle graphicsBundle
        Polygon polygon = new Polygon(graphicsBundle);

        //Them cac diem cua Polygon
       polygon.addPoint(new Point(0, 0));

       polygon.addPoint(new Point(1, 0));

       polygon.addPoint(new Point(0, 1));




        // Print the initial state of the Polygon
        System.out.println("Initial Polygon: " + polygon);

        // Rotate the Polygon by 45 degrees
        polygon.rotate(45);
        System.out.println("After rotation by 45 degrees: " + polygon);

        // Scale the Polygon by a factor of 2
        polygon.scale(2);
        System.out.println("After scaling by a factor of 2: " + polygon);
    }
}
