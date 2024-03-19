package bai02.ex3;

public class NhanVien {
    private String tenNhanVien;
    private double luong;
    private double heSoLuong;
    private double luongToiDa;
    private double luongCB;


    public NhanVien() {
        this.tenNhanVien = "";
        this.heSoLuong = 0;
        this.luongToiDa = 0;
        this.luongCB = 0;
        this.luong = 0;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void setLuongToiDa(double luongToiDa) {
        this.luongToiDa = luongToiDa;
    }
    public void setLuong(double luong) {
        this.luong = luong;
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
    public double getLuong() {
        return luong;
    }
}