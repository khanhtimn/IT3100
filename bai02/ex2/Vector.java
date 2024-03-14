package bai02.ex2;
import java.util.Scanner;
/**
 * Viết khai báo một lớp Vector gôm 3 thành phần với những phương thức cộng/trừ vector,
 * nhân với 1 hằng số, nhân vô hướng 2 vector.
 **/
public class Vector {
    private final double x;
    private final double y;
    private final double z;

    // Constructor
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Phương thức cộng vector
    public Vector add(Vector other) {
        double newX = this.x + other.x;
        double newY = this.y + other.y;
        double newZ = this.z + other.z;
        return new Vector(newX, newY, newZ);
    }

    // Phương thức trừ vector
    public Vector subtract(Vector other) {
        double newX = this.x - other.x;
        double newY = this.y - other.y;
        double newZ = this.z - other.z;
        return new Vector(newX, newY, newZ);
    }

    // Phương thức nhân với hằng số
    public Vector multiply(double scalar) {
        double newX = this.x * scalar;
        double newY = this.y * scalar;
        double newZ = this.z * scalar;
        return new Vector(newX, newY, newZ);
    }

    // Phương thức nhân vô hướng 2 vector
    public double dotProduct(Vector other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    // Phương thức in thông tin vector
    public void print() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tọa độ vector 1:");
        Vector vector1 = newVector(scanner);

        System.out.println("Nhập tọa độ vector 2:");
        Vector vector2 = newVector(scanner);

        System.out.print("Vector 1: ");
        vector1.print();

        System.out.print("Vector 2: ");
        vector2.print();

        Vector sum = vector1.add(vector2);
        System.out.print("Vector 1 + Vector 2: ");
        sum.print();

        Vector difference = vector1.subtract(vector2);
        System.out.print("Vector 1 - Vector 2: ");
        difference.print();

        System.out.print("Nhập hằng số để nhân với vector 1: ");
        double scalar = scanner.nextDouble();
        Vector scaledVector = vector1.multiply(scalar);
        System.out.print(scalar + " * (Vector 1): ");
        scaledVector.print();

        double dotProduct = vector1.dotProduct(vector2);
        System.out.println("(Vector 1).(Vector 2): " + dotProduct);

        scanner.close();
    }

    private static Vector newVector(Scanner scanner) {
        System.out.print("x: ");
        double x1 = scanner.nextDouble();
        System.out.print("y: ");
        double y1 = scanner.nextDouble();
        System.out.print("z: ");
        double z1 = scanner.nextDouble();
        return new Vector(x1, y1, z1);
    }
}
