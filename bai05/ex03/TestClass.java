package bai05.ex03;

/**
 * Từ bài 5.2, sử dụng thành viên lớp để cài đặt đếm số đối tượng của lớp SinhVien được tạo ra tại bất kỳ thời điểm nào, ở bất kỳ đâu.
 * Cài đặt minh họa cách thức sử dụng.
 * */
public class TestClass {
    public static void main(String[] args) {
        System.out.println("Lớp học 1 (sinh viên ngẫu nhiên)");
        Class lopHoc1 = new Class(30);
        //Minh họa cách sử dụng
        System.out.println("Số lượng sinh viên đã tạo: " + lopHoc1.getSoLuongSinhVien());
        System.out.println("***************");
        System.out.println("\nLớp học 2 (nhập từ bàn phím):");
        Class lopHoc2 = new Class();
        //Minh họa cách sử dụng
        System.out.println("Số lượng sinh viên đã tạo: " + lopHoc2.getSoLuongSinhVien());
        System.out.println("***************");
        lopHoc1.inDanhSachSinhVien();
        System.out.println("***************");
        lopHoc2.inDanhSachSinhVien();
        System.out.println("***************");
        System.out.println("Chương trình kết thúc");
    }
}
