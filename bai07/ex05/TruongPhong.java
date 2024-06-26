package bai07.ex05;

public class TruongPhong extends NhanVien {

    private double heSoLuong;
    private final double phuCap;
    private final double soNamDuongChuc;

    public TruongPhong(String tenNhanVien, double heSoLuong, double phuCap, double soNamDuongChuc) {
        super(tenNhanVien, heSoLuong);
        this.phuCap = phuCap;
        this.soNamDuongChuc = soNamDuongChuc;
    }

    @Override
    public boolean tangLuong(double luongMoi) {
        double luongThucTe = tinhLuong();
        if (luongThucTe + luongMoi <= LUONG_TOI_DA) {
            heSoLuong += luongMoi / LUONG_CO_BAN;
            return true;
        }
        return false;
    }

    @Override
    public double tinhLuong() {
        return phuCap + LUONG_CO_BAN * heSoLuong;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Phụ cấp: " + phuCap);
        System.out.println("Số năm đương chức: " + soNamDuongChuc);
    }
}