package bai04.ex2;

import java.util.Scanner;
public class LuongCoBan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên nhân viên: ");
        String tenNhanVien = scanner.nextLine();

        System.out.print("Nhập lương cơ bản: ");
        double luongCB = scanner.nextDouble();

        System.out.print("Nhập hệ số lương: ");
        double heSoLuong = scanner.nextDouble();

        System.out.print("Nhập lương tối đa: ");
        double luongToiDa = scanner.nextDouble();

        NhanVien nv = new NhanVien(tenNhanVien, luongCB, heSoLuong, luongToiDa);

        System.out.println("Thông tin của nhân viên là: ");
        inTTin(nv, nv.getTenNhanVien(), nv.getLuongCB(), nv.getHeSoLuong(), nv.getLuongToiDa());

        System.out.println("Chương trình kết thúc");
        scanner.close();
    }

    private static void inTTin(NhanVien nv, String tenNhanVien, double luongCB, double heSoLuong, double luongToiDa) {
        System.out.println("Tên nhân viên: " + tenNhanVien);
        System.out.println("Lương cơ bản: " + luongCB);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Lương tối đa: " + luongToiDa);
        if(!nv.isGioiHanLuong()) {
            System.out.println("Lương tăng lên sẽ vượt quá lương tối đa");
        } else {
            System.out.println("Lương: " + heSoLuong * luongCB);
        }
    }
}
