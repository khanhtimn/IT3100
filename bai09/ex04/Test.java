package bai09.ex04;

import bai09.ex04.shapes.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * Tạo một lớp cơ sở 2DShape có thuộc tính name và phương thức tính diện tích
 * • Tạo một loạt các lớp kế thừa từ 2DShape:
 * • Circle, Rectangle, Trapezoid, Triangle, Polygon
 * • Tạo một lớp có một tập hợp các đối tượng ngẫu nhiên trong danh sách các lớp kể trên. Chú ý không cho phép các đối tượng không kết thừa từ 2DShape vào danh sách. Có các phương thức
 * • Sắp xếp danh sách đó theo diện tích sử dụng các
 * Comparator
 * • Sắp xếp danh sách đó theo tên sử dụng các Comparator
 * • In ra thông tin của danh sách đã xắp xếp sử dụng Iterator
 * • Viết chương trình demo viêc sử dung các lớp trên
 * */
public class Test {
    private static final int MAX_SHAPES = 10;
    private static final Random random = new Random();

    public static void main(String[] args) {
        List<TwoDimShape> shapes = generateRandomShapes();

        System.out.println("Shapes:");
        printShapes(shapes);

        System.out.println("\nShapes sorted by area:");
        sortByArea(shapes);
        printShapes(shapes);

        System.out.println("\nShapes sorted by name:");
        sortByName(shapes);
        printShapes(shapes);
    }

    private static List<TwoDimShape> generateRandomShapes() {
        List<TwoDimShape> shapes = new ArrayList<>();
        int numShapes = random.nextInt(MAX_SHAPES) + 1;

        for (int i = 0; i < numShapes; i++) {
            TwoDimShape shape = generateRandomShape("Shape No." + (i + 1));
            shapes.add(shape);
        }

        return shapes;
    }

    private static TwoDimShape generateRandomShape(String name) {
        int shapeType = random.nextInt(5);

        return switch (shapeType) {
            case 0 -> new Circle(name, random.nextDouble() * 10);
            case 1 -> new Rectangle(name, random.nextDouble() * 10, random.nextDouble() * 10);
            case 2 -> new Triangle(name, random.nextDouble() * 10, random.nextDouble() * 10);
            case 3 -> new Trapezoid(name, random.nextDouble() * 10, random.nextDouble() * 10, random.nextDouble() * 10);
            case 4 -> new Polygon(name);
            default -> throw new IllegalArgumentException("Invalid shape type");
        };
    }

    private static void sortByArea(List<TwoDimShape> shapes) {
        shapes.sort(Comparator.comparingDouble(TwoDimShape::area));
    }

    private static void sortByName(List<TwoDimShape> shapes) {
        shapes.sort(Comparator.comparing(TwoDimShape::getName));
    }

    private static void printShapes(List<TwoDimShape> shapes) {
        for (TwoDimShape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
