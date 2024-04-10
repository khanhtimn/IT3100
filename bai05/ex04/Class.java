package bai05.ex04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Đưa danh sách sinh viên vào lớp học
 * Sinh viên được khởi tạo trong phương thức khởi tạo của lớp
 * khởi tạo có tham số cho lớp học, tham số là số lượng sinh viên bằng sách sử dụng phương pháp sinh tên, năm sinh ngẫu nhiên
 * khởi tạo không tham số: số sinh viên và thông tin sinh viên nhập từ bàn phím
 * Thêm phương thức sắp xếp sinh viên theo điểm
 * Thêm phương thức sắp xếp sinh viên theo năm sinh
 * Trong hàm main, in ra danh sách theo điểm và năm sinh
 */
public class Class {
    private final List<Student> danhSachSinhVien;

    public Class(int soLuongSinhVien) {
        this.danhSachSinhVien = new ArrayList<>();
        for (int i = 0; i < soLuongSinhVien; i++) {
            String tenNgauNhien = NameGenerator.generateRandomName();
            int namSinh = ThreadLocalRandom.current().nextInt(1990, 2006);
            int diemNgauNhien = ThreadLocalRandom.current().nextInt(0, 10 + 1);
            danhSachSinhVien.add(new Student(tenNgauNhien, namSinh, diemNgauNhien));
        }
    }

    public double tinhDiemTong() {
        double sum = 0;
        for (Student sv : danhSachSinhVien) {
            sum += sv.getDiemThi();
        }
        return sum;
    }

    public double tinhDiemTrungBinh() {
        return tinhDiemTong() / danhSachSinhVien.size();
    }

    public void sapXepTheoDiem() {
        danhSachSinhVien.sort(Comparator.comparingInt(Student::getDiemThi).reversed());
    }

    public void sapXepTheoNamSinh() {
        danhSachSinhVien.sort(Comparator.comparingInt(Student::getYear));
    }

    public void inDanhSachSinhVien() {
        System.out.println("Danh sách sinh viên theo điểm:");
        sapXepTheoDiem();
        for (Student sv : danhSachSinhVien) {
            System.out.println("Tên: " + sv.getStudentName() + ", Năm sinh: " + sv.getYear() + ", Điểm: " + sv.getDiemThi());
        }

        System.out.println("\nDanh sách sinh viên theo năm sinh:");
        sapXepTheoNamSinh();
        for (Student sv : danhSachSinhVien) {
            System.out.println("Tên: " + sv.getStudentName() + ", Năm sinh: " + sv.getYear() + ", Điểm: " + sv.getDiemThi());
        }
    }
}