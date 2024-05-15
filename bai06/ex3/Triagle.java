package bai06.ex3;

import java.awt.*;

public class Triagle {
    public static void main(String[] args) {
        // Create a GraphicsBundle with a color
        Bundle graphicsBundle = new Bundle(Color.RED);

        // Create a Polygon with the GraphicsBundle
        Polygon polygon = new Polygon(graphicsBundle);

        // Add points to the Polygon
        polygon.addPoint(new Point(1, 1));
        polygon.addPoint(new Point(2, 3));
        polygon.addPoint(new Point(4, 5));

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
