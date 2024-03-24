package bai04.ex2;
import java.util.Scanner;

public class TestNhanVien {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng nhân viên: ");
        int numNhanVien = scanner.nextInt();
        scanner.nextLine();

        NhanVien[] nv = new NhanVien[numNhanVien];

        for (int i = 0; i < nv.length; i++) {
            System.out.print("Nhập tên nhân viên thứ " + (i + 1) + ": ");
            String tenNhanVien = scanner.nextLine();
            System.out.print("Nhập lương cơ bản nhân viên thứ " + (i + 1) + ": ");
            double luongCB = scanner.nextDouble();
            System.out.print("Nhập hệ số lương nhân viên thứ " + (i + 1) + ": ");
            double heSoLuong = scanner.nextDouble();
            System.out.print("Nhập lương tối đa nhân viên thứ " + (i + 1) + ": ");
            double luongToiDa = scanner.nextDouble();
            scanner.nextLine();
            nv[i] = new NhanVien(tenNhanVien, luongCB, heSoLuong, luongToiDa);
        }

        System.out.println("**************");
        System.out.println("Thông tin của các nhân viên là: ");
        for (NhanVien nhanVien : nv) {
            inTTin(nhanVien, nhanVien.getTenNhanVien(), nhanVien.getLuongCB(), nhanVien.getHeSoLuong(), nhanVien.getLuongToiDa());
            System.out.println("**************");
        }

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
