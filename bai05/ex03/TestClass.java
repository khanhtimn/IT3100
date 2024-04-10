package bai05.ex03;

public class TestClass {
    public static void main(String[] args) {
        System.out.println("Lớp học 1 (sinh viên ngẫu nhiên)");
        Class lopHoc1 = new Class(30);
        System.out.println("Số lượng sinh viên đã tạo: " + lopHoc1.getSoLuongSinhVien());
        System.out.println("***************");
        System.out.println("\nLớp học 2 (nhập từ bàn phím):");
        Class lopHoc2 = new Class();
        System.out.println("Số lượng sinh viên đã tạo: " + lopHoc2.getSoLuongSinhVien());
        System.out.println("***************");
        lopHoc1.inDanhSachSinhVien();
        System.out.println("***************");
        lopHoc2.inDanhSachSinhVien();
        System.out.println("***************");
        System.out.println("Chương trình kết thúc");
    }
}
