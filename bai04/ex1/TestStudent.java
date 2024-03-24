package bai04.ex1;
import java.util.Scanner;

public class TestStudent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[numStudents];

        for (int i = 0; i < students.length; i++) {
            System.out.print("Nhập tên sinh viên thứ " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Nhập tuổi sinh viên thứ " + (i + 1) + ": ");
            int age = scanner.nextInt();
            scanner.nextLine();
            students[i] = new Student(name, age);
        }

        System.out.println("Thông tin của lớp là: ");
        for (Student student : students) {
            System.out.println("Tên: " + student.getStudentName() + "\nTuổi: " + student.getYear());
            System.out.println("**************");
        }

        System.out.println("Chương trình kết thúc");
        scanner.close();
    }
}