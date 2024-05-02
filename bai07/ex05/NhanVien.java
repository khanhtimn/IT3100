package bai07.ex05;

public class NhanVien implements INhanVien {

    private final String tenNhanVien;
    private double heSoLuong;

    public NhanVien(String tenNhanVien, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.heSoLuong = heSoLuong;
    }

    @Override
    public boolean tangLuong(double luongMoi) {
        double luongThucTe = tinhLuong();
        if (luongThucTe + luongMoi <= LUONG_MAX) {
            heSoLuong += luongMoi / LUONG_CO_BAN;
            return true;
        }
        return false;
    }

    @Override
    public double tinhLuong() {
        return heSoLuong * LUONG_CO_BAN;
    }

    @Override
    public void inThongTin() {
        System.out.println("Tên nhân viên: " + tenNhanVien);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Lương thực tế: " + tinhLuong());
    }
}
