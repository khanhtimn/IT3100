package bai07.ex06;

public class NhanVien {

    public static final double LUONG_CO_BAN = 750.000;
    public static final double LUONG_TOI_DA = 20_000_000.0;

    private final String tenNhanVien;
    public double heSoLuong;

    public NhanVien(String tenNhanVien, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.heSoLuong = heSoLuong;
    }

    public boolean tangLuong(double luongMoi) {
        double luongThucTe = tinhLuong();
        if (luongThucTe + luongMoi <= LUONG_TOI_DA) {
            heSoLuong += luongMoi / LUONG_CO_BAN;
            return true;
        }
        return false;
    }

    public double tinhLuong() {
        return heSoLuong * LUONG_CO_BAN;
    }

    public void inThongTin() {
        System.out.println("Tên: " + tenNhanVien);
    }
}
