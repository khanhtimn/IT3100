package bai07.ex05;

import java.util.Random;

public class Test {
    public static void main(String[] args) {

        // Tạo đối tượng nhân viên
        NhanVien nhanVien = new NhanVien(NameGenerator.generateRandomName(), 2.5);
        System.out.println("Thông tin nhân viên:");
        nhanVien.inThongTin();

        // Tăng lương cho nhân viên
        double luongMoi = new Random().nextInt(10000) * 1000;
        System.out.println("Lương mới: " + luongMoi);
        if (nhanVien.tangLuong(luongMoi)) {
            System.out.println("Tăng lương thành công!");
        } else {
            System.out.println("Tăng lương thất bại (vượt quá lương tối đa).");
        }
        System.out.println("Thông tin nhân viên sau khi tăng lương:");
        nhanVien.inThongTin();

        System.out.println("\n-----------------------\n");

        // Tạo đối tượng trưởng phòng
        TruongPhong truongPhong = new TruongPhong(NameGenerator.generateRandomName(), 3.0, 1_000_000, 5);
        System.out.println("Thông tin trưởng phòng:");
        truongPhong.inThongTin();

        // Tăng lương cho trưởng phòng
        luongMoi = new Random().nextInt(100000) * 1000;
        System.out.println("Lương mới: " + luongMoi);
        if (truongPhong.tangLuong(luongMoi)) {
            System.out.println("Tăng lương thành công!");
        } else {
            System.out.println("Tăng lương thất bại (vượt quá lương tối đa).");
        }
        System.out.println("Thông tin trưởng phòng sau khi tăng lương:");
        truongPhong.inThongTin();
    }
}
