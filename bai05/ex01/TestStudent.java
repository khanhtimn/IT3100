package bai05.ex01;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Từ bài 4.3
 * Thêm các phương thức lamBaiThi mới :
 *     lamBaiThi(long seed), với seed để khởi tạo bộ sinh số ngẫu nhiên với một seed Random(seed)
 *     lamBaiThi(SinhVien bankeben):
 *      phương thức làm bài thi này sẽ copy 50% bài của bạn bankeben + 50% phần tự làm như phương thức lamBaiThi().
 *      Bạn kế bên có thể là đằng trước hoặc sau trong danh sách.
 * Lớp Test, phương thức tổ chức thi mới như sau:
 *     Với mỗi bạn chọn ngẫu nhiên 1 trong 3 cách làm bài:
 *      (1) lamBaiThi();
 *      (2) lamBaiThi(seed);
 *      (3) lamBaiThi(SinhVien bankeben);
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
        System.out.println("***************");
        System.out.println("Thông tin của lớp là: ");
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println("Chọn phương thức làm bài thi cho sinh viên " + student.getStudentName() + ":");
            System.out.println("1. lamBaiThi()");
            System.out.println("2. lamBaiThi(seed)");
            System.out.println("3. lamBaiThi(SinhVien banKeBen)");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    lamBaiThi(student);
                    break;
                case 2:
                    long seed = ThreadLocalRandom.current().nextLong();
                    lamBaiThi(student, seed);
                    break;
                case 3:
                    //Bạn kế bên là đằng sau trong danh sách (lấy phần dư khi vượt quá phần tử mảng)
                    int index = (i + 1) % students.length;
                    lamBaiThi(student, students[index]);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
            System.out.println("***************");
            System.out.println("Tên: " + student.getStudentName() + "\nTuổi: " + student.getYear() + "\nĐiểm: " + student.getDiemThi());
            System.out.println("***************");
        }
        System.out.println("Chương trình kết thúc");
        scanner.close();
    }
    private static void lamBaiThi(Student student) {
        student.setDiemThi(ThreadLocalRandom.current().nextInt(0, 10 + 1));
    }

    private static void lamBaiThi(Student student, long seed) {
        Random random = new Random(seed);
        student.setDiemThi(random.nextInt(10 + 1));
    }

    private static void lamBaiThi(Student student, Student banKeBen) {
        int diemTuLam = ThreadLocalRandom.current().nextInt(0, 10 + 1);
        int diemBanKeBen = banKeBen.getDiemThi();
        int diemThi = (diemTuLam + diemBanKeBen) / 2;
        student.setDiemThi(diemThi);
    }

}