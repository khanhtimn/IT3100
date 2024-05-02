package bai07.ex05;

interface INhanVien {
    double LUONG_CO_BAN = 750.000;
    double LUONG_MAX = 20_000_000.0;

    boolean tangLuong(double luongMoi);
    double tinhLuong();
    void inThongTin();
}