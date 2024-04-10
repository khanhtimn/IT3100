package bai05.ex04;

/**
 * Cài đặt phương thức, đầu vào là số lượng bất kỳ các đối tượng lớp Student, đầu ra là tổng điểm thi OOP của các đối tượng này.
 * Tính điểm trung bình của toàn bộ đối tượng Student.
 **/
public class TestClass {
    public static void main(String[] args) {

        System.out.println("Lớp học 1 (sinh viên ngẫu nhiên):\n");
        Class lopHoc1 = new Class(30);
        lopHoc1.inDanhSachSinhVien();
        System.out.println("***************");
        System.out.println("Tổng điểm thi: " + lopHoc1.tinhDiemTong());
        System.out.println("Điểm trung bình: " + lopHoc1.tinhDiemTrungBinh());
        System.out.println("***************");
        System.out.println("Chương trình kết thúc");
    }
}
