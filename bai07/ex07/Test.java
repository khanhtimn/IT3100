package bai07.ex07;

public class Test {
    public static void main(String[] args) {
        // Test Circle
        Circle circle1 = new Circle(5.0);
        System.out.println("Circle 1: " + circle1);
        printShape(circle1.getRadius(), circle1.getArea(), circle1.getPerimeter());

        Circle circle2 = new Circle(10.0, "Red", true);
        System.out.println("\nCircle 2: " + circle2);
        printShape(circle2.getRadius(), circle2.getArea(), circle2.getPerimeter(), circle2.getColor(), circle2.isFilled());

        // Test Rectangle
        Rectangle rectangle1 = new Rectangle(3.0, 5.0);
        System.out.println("\nRectangle 1: " + rectangle1);
        printShape(rectangle1.getLength(), rectangle1.getArea(), rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle(6.0, 8.0, "Blue", false);
        System.out.println("\nRectangle 2: " + rectangle2);
        printShape(rectangle2.getLength(), rectangle2.getArea(), rectangle2.getPerimeter(), rectangle2.getColor(), rectangle2.isFilled());


        // Test Square
        Square square1 = new Square(4.0);
        System.out.println("\nSquare 1: " + square1);
        printShape(square1.getLength(), square1.getArea(), square1.getPerimeter());

        Square square2 = new Square(7.0, "Green", true);
        System.out.println("\nSquare 2: " + square2);
        printShape(square2.getLength(), square2.getArea(), square2.getPerimeter(), square2.getColor(), square2.isFilled());
    }

    private static void printShape(double length, double area, double perimeter) {
        System.out.println("Length / Radius: " + length);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
    private static void printShape(double length, double area, double perimeter, String color, boolean filled) {
        System.out.println("Length / Radius: " + length);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Color: " + color);
        System.out.println("Is filled: " + filled);
    }
}
