package bai04.ex2;

public class NhanVien {
    private final String tenNhanVien;
    private final double heSoLuong;
    private final double luongToiDa;
    private final double luongCB;
    private boolean gioiHanLuong = true;


    public NhanVien(String tenNhanVien, double luongCB, double heSoLuong, double luongToiDa) {
        this.tenNhanVien = tenNhanVien;
        this.heSoLuong = heSoLuong;
        this.luongCB = luongCB;
        this.luongToiDa = luongToiDa;
        if (this.heSoLuong * this.luongCB > this.luongToiDa) {
            this.gioiHanLuong = false;
        }

    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public double getLuongToiDa() {
        return luongToiDa;
    }

    public double getLuongCB() {
        return luongCB;
    }
    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public boolean isGioiHanLuong() {
        return gioiHanLuong;
    }
}