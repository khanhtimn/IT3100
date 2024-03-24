package bai04.ex3;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Từ bài tập 4.1, các bạn thêm trong lớp sinh viên điểm thi OOP. Một số thay đổi so với bài 4.1
 * Phương thức khởi tạo sẽ gán điểm thi bằng 0.
 * Thêm phương thức thi: lamBaiThi()
 * Phương thức này sẽ gán điểm bài thi bằng một điểm ngẫu nhiên từ 0..10
 * Thêm phương thức hiện thông tin và điểm thi của sinh viên: inDiemThi()
 * Lớp Test có phương thức tổ chức thi. Phương thức này sẽ tổ chức cho tất cả các thành viên trong lớp thi
 * Cuối cùng in ra điểm thi của cả lớp
 **/
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

        System.out.println("**************");
        System.out.println("Thông tin của lớp là: ");
        for (Student student : students) {
            lamBaiThi(student);
            System.out.println("Tên: " + student.getStudentName() + "\nTuổi: " + student.getYear() + "\nĐiểm: " + student.getDiemThi());
            System.out.println("**************");
        }

        System.out.println("Chương trình kết thúc");
        scanner.close();
    }
    private static void lamBaiThi(Student student) {
        student.setDiemThi(ThreadLocalRandom.current().nextInt(0, 10 + 1));
    }
}