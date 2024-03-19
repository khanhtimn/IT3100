package bai02.ex3;

import java.util.Scanner;

/**
 * Viết mã nguồn cho lớp Nhan Vien như trong hình bên biết:
 * Cho phép nhập vào tên nhân viên, lương cơ bản và hệ số lương, lương tối đa.
 * Lương = Lương cơ bản * Hệ số lương
 * Phương thức inTTin() hiển thị thông tin của đối tượng Nhan Vien tương ứng.
 * Phương thức tangLuong(double) tăng hệ số lương hiện tại lên một lượng bằng giá trị tham số double truyền vào.
 * Nếu điều này làm cho lương của nhân viên > lương tối đa cho phép thì không cho phép thay đối, in ra thông báo và
 * trả vê false, ngược lại trả về true.
 * get set cho các thuộc tính của lớp Nhan Vien
 * Viết các phương thức get và set cho các thuộc tính của lớp Nhan Vien
**/
public class LuongCoBan {
    private static final NhanVien nv = new NhanVien();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên nhân viên: ");
        nv.setTenNhanVien(scanner.nextLine());

        System.out.print("Nhập lương cơ bản: ");
        nv.setLuongCB(scanner.nextDouble());

        System.out.print("Nhập hệ số lương: ");
        nv.setHeSoLuong(scanner.nextDouble());

        System.out.print("Nhập lương tối đa: ");
        nv.setLuongToiDa(scanner.nextDouble());

        tinhLuong();
        inThongTin();

        System.out.println("Chương trình kết thúc");
        scanner.close();
    }

    private static void tinhLuong() {
        nv.setLuong(nv.getHeSoLuong() * nv.getLuongCB());
    }

    private static boolean tangLuong() {
        if (nv.getLuong() > nv.getLuongToiDa()) {
            System.out.println("Lương tăng lên sẽ vượt quá lương tối đa");
            return false;
        }
        return true;
    }

    private static void inThongTin() {
        System.out.println("Tên nhân viên: " + nv.getTenNhanVien());
        System.out.println("Lương cơ bản: " + nv.getLuongCB());
        System.out.println("Hệ số lương: " + nv.getHeSoLuong());
        System.out.println("Lương tối đa: " + nv.getLuongToiDa());
        System.out.println("Lương: " + nv.getLuong());
        //Log True/False
        System.out.println(tangLuong());
    }
}
