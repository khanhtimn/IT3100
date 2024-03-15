/** Bài 3. Viết mã nguồn cho lớp Nhan Vien như trong hình bên biết:
 * Cho phép nhập vào tên nhân viên, lương cơ bản và hệ số lương, lương tối đa.
 * Lương = Lương cơ bản * Hệ số lương
 * Phương thức inTTin() hiển thị thông tin của đối tượng Nhan Vien tương ứng.
 * Phương thức tangLuong(double) tăng hệ số lương hiện tại lên một lượng bằng giá trị tham số double truyền vào.
 Nếu điều này làm cho lương của nhân viên > lương tối đa cho phép thì không cho phép thay đối, in ra thông báo và
 trả vê false, ngược lại trả về true.
 * Viết các phương thức get và set cho các thuộc tính của lớp Nhan Vien
 **/
package bai02.ex3;

import java.util.Scanner;

public class luoncgb {
        public static void main(String[] args) {
            NhanVien nv = new NhanVien();
            nv.nhapTTin();
            nv.tangLuong(2.0);
            nv.inTTin();
        }
        public static class NhanVien {
            private String ten;
            private double luongCoBan;
            private double heSoLuong;
            private double luong;
            private double luongToiDa = 20000000;
            public void nhapTTin() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhập tên nhân viên: ");
                ten = sc.nextLine();
                System.out.print("Nhập lương cơ bản: ");
                luongCoBan = sc.nextDouble();
                System.out.print("Nhập hệ số lương: ");
                heSoLuong = sc.nextDouble();
                System .out.print("Nhập lương tối đa: ");
                luongToiDa = sc.nextDouble();
                luong = luongCoBan * heSoLuong;
            }
            public void inTTin() {
                System.out.println("Tên nhân viên: " + ten);
                System.out.println("Lương cơ bản: " + luongCoBan);
                System.out.println("Hệ số lương: " + heSoLuong);
                System.out.println("Lương: " + luong);
                System.out.println("Lương tối đa: " + luongToiDa);
            }
            public void tangLuong(double tang) {
                if (luong + luongCoBan * tang > luongToiDa) {
                    System.out.println("Lương tăng quá mức cho phép");
                    return;
                }
                heSoLuong += tang;
                luong = luongCoBan * heSoLuong;
            }
        }
    }

