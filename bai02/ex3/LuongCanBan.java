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
public class LuongCanBan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NhanVien nhanvien = new NhanVien();
        System.out.print("Nhập tên nhân viên: ");
        String name = scanner.nextLine();
        nhanvien.getName(name);
        System.out.print("Nhập lương cơ bản: ");
        double luongcb = scanner.nextDouble();
        nhanvien.setLuongcb(luongcb);
        System.out.print("Nhập hệ số lương: ");
        double hesoluong = scanner.nextDouble();
        nhanvien.setHesoluong(hesoluong);
        System.out.print("Nhập lương tối đa: ");
        double luongtoida = scanner.nextDouble();
        nhanvien.setLuongtoida(luongtoida);
        nhanvien.setLuong();
        nhanvien.inTTin();
        scanner.close();
    }
    public static class NhanVien {
        private String name;

        private double luong;
        private double hesoluong;
        private double luongtoida;
        private double luongcb;

        public NhanVien() {
            this.name = "";
            this.luong = 0;
            this.hesoluong = 0;
            this.luongtoida = 0;
            this.luongcb = 0;
        }

        public void inTTin() {
            System.out.println("Tên nhân viên: " + name);
            System.out.println("Lương cơ bản: " + luongcb);
            System.out.println("Hệ số lương: " + hesoluong);
            System.out.println("Lương tối đa: " + luongtoida);
            System.out.println("Luong: " + luong);
            //System.out.println(tangLuong(luong));
        }
        public boolean tangLuong(double luong) {
            if (luong > luongtoida) {
                System.out.println("Lương tăng lên sẽ vượt quá lương tối đa");
                return false;
            }
                return true;
        }
       public void getName(String name) {
            this.name = name;
        }

        public void setLuongcb(double luongcb) {
            this.luongcb = luongcb;
        }

        public void setHesoluong(double hesoluong) {
            this.hesoluong = hesoluong;
        }

        public void setLuongtoida(double luongtoida) {
            this.luongtoida = luongtoida;
        }
        public void setLuong() {
            this.luong = luongcb * hesoluong;
        }

    }
}
