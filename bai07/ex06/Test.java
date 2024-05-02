package bai07.ex06;

import java.util.Random;

public class Test {
    public static void main(String[] args) {


        // Tạo đối tượng cán bộ quản lý
        CanBoQuanLy canBoQuanLy = new CanBoQuanLy(NameGenerator.generateRandomName(), 2.5);
        System.out.println("Thông tin cán bộ quản lý:");
        canBoQuanLy.inThongTin();

        // Tăng lương cho cán bộ quản lý
        double luongMoi = new Random().nextDouble(100_000_000);
        System.out.println("Lương mới: " + luongMoi);
        if (canBoQuanLy.tangLuong(luongMoi)) {
            System.out.println("Tăng lương thành công!");
        } else {
            System.out.println("Tăng lương thất bại (vượt quá lương tối đa).");
        }
        System.out.println("Thông tin cán bộ quản lý sau khi tăng lương:");
        canBoQuanLy.inThongTin();

        System.out.println("\n-----------------------\n");

        // Tạo đối tượng giám đốc
        GiamDoc giamDoc = new GiamDoc(NameGenerator.generateRandomName(), 3.0, 1_000_000);
        System.out.println("Thông tin giám đốc:");
        giamDoc.inThongTin();

        // Tăng lương cho giám đốc
        luongMoi = new Random().nextDouble(100_000_000);
        System.out.println("Lương mới: " + luongMoi);
        if (giamDoc.tangLuong(luongMoi)) {
            System.out.println("Tăng lương thành công!");
        } else {
            System.out.println("Tăng lương thất bại (vượt quá lương tối đa).");
        }
        System.out.println("Thông tin giám đốc sau khi tăng lương:");
        giamDoc.inThongTin();
    }
}
