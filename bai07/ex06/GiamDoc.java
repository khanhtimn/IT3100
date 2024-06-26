package bai07.ex06;

public class GiamDoc extends CanBoQuanLy implements QuanLy {

    private final double phuCap;

    public GiamDoc(String tenNhanVien, double heSoLuong, double phuCap) {
        super(tenNhanVien, heSoLuong);
        this.phuCap = phuCap;
    }

    @Override
    public double tinhLuong() {
        return LUONG_CO_BAN * heSoLuong + phuCap + tinhHoaHong();
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
        System.out.println("Phụ cấp: " + phuCap);
    }
}