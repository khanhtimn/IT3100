package bai02.ex1;

import java.util.Scanner;
/**
* Bài 1: Viết khai báo một gói (shape) chứa hai lớp:
* lớp hình vuông, lớp hình tròn. Viết khai báo lớp hình vuông, lớp hình tròn cùng các thuộc tính thích hợp,
* các phương thức get/set thích hợp.
* Thuộc tính: Kích thước (m)
* Phương thức: get/set và sayhello
* Viết chương trình sử dụng 2 lớp này
**/
public class AreaPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập độ dài cạnh hình vuông: ");
        double squareSide = scanner.nextDouble();
        Square square = new Square(0); // Khởi tạo với giá trị mặc định
        square.setSide(squareSide);
        Square.sayHello();
        System.out.println("Diện tích hình vuông: " + square.getArea());
        System.out.println("Chu vi hình vuông: " + square.getPerimeter());

        System.out.print("Nhập bán kính hình tròn: ");
        double circleRadius = scanner.nextDouble();
        Circle circle = new Circle(0); // Khởi tạo với giá trị mặc định

        circle.setRadius(circleRadius);
        Circle.sayHello();
        System.out.println("Diện tích hình tròn: " + circle.getArea());
        System.out.println("Chu vi hình tròn: " + circle.getPerimeter());

        scanner.close();
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

        public void setSide(double side) {
            this.side = side;
        }
        public static void sayHello() {
            System.out.println("Hình vuông");
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

        public void setRadius(double radius) {
            this.radius = radius;
        }
        public static void sayHello() {
            System.out.println("Hình Tròn");
        }
    }
}
