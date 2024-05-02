package bai07.ex06;

import java.util.Random;

interface QuanLy {

    double LOI_NHUAN_CONG_TY = new Random().nextDouble(100_000_000);
    double tinhHoaHong();

}

class CanBoQuanLy extends NhanVien implements QuanLy {


    public CanBoQuanLy(String tenNhanVien, double heSoLuong) {
        super(tenNhanVien, heSoLuong);
    }

    @Override
    public double tinhLuong() {
        return LUONG_CO_BAN * heSoLuong + tinhHoaHong();
    }

    @Override
    public double tinhHoaHong() {
        return LOI_NHUAN_CONG_TY * 0.02;
    }

    @Override
    public boolean tangLuong(double luongMoi) {
        double luongThucTe = tinhLuong() + tinhHoaHong();
        if (luongThucTe + luongMoi <= LUONG_TOI_DA) {
            heSoLuong += luongMoi / LUONG_CO_BAN;
            return true;
        }
        return false;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Lợi nhuận công ty: " + LOI_NHUAN_CONG_TY);
        System.out.println("Hoa hồng: " + tinhHoaHong());
        System.out.println("Lương thực tế: " + tinhLuong());
    }
}

