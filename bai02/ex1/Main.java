package bai02.ex1;

/*
Viết khai báo một gói chứa hai lớp: lớp hình vuông, lớp hình tròn. Viết khai báo lớp hình vuông, lớp hình tròn cùng
 các thuộc tính thích hợp, các phương thức get/set thích hợp.
 */
public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Square area: " + square.getArea());
        System.out.println("Square perimeter: " + square.getPerimeter());

        Circle circle = new Circle(5);
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
    }
    static class Square {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        public double getArea() {
            return side * side;
        }

        public double getPerimeter() {
            return 4 * side;
        }
    }
    static class Circle {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    }
}
