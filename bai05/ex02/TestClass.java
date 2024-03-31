package bai05.ex02;

public class TestClass {
    public static void main(String[] args) {
        Class lopHoc1 = new Class(10);
        Class lopHoc2 = new Class();

        System.out.println("***************");
        System.out.println("Lớp học 1 (sinh viên ngẫu nhiên):");
        lopHoc1.inDanhSachSinhVien();
        System.out.println("***************");
        System.out.println("\nLớp học 2 (nhập từ bàn phím):");
        lopHoc2.inDanhSachSinhVien();
        System.out.println("***************");
        System.out.println("Chương trình kết thúc");
    }
}
