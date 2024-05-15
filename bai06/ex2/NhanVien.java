
package bai06.ex2;
/** NhanVien
 * -tenNhanVien: String
 * -heSoLuong: double
 * +LUONG CO BAN:double=750.000
        * +LUONG MAX:double=20.000.000
        * +tangLuong (double) : boolean
 * +tinhLuong () : double
 * +inTTin ()
 **/

public class NhanVien {
    public String tenNhanVien;
    public double heSoLuong;
    public static final double LUONG_CO_BAN = 750000;
    public static final double LUONG_MAX = 20000000;
    public NhanVien(String tenNhanVien, double heSoLuong){
        this.tenNhanVien = tenNhanVien;
        this.heSoLuong = heSoLuong;
    }
    public double tinhLuong(){
        double luong = heSoLuong * LUONG_CO_BAN;
        if(luong > LUONG_MAX){
            return LUONG_MAX;
        }
        return luong;
    }

    public boolean tangLuong(double heSoTang){
        if(heSoLuong <= LUONG_MAX){
            return true;
        }
            return false;
    }


    public void inTTin() {
        System.out.println("TenNhanVien: " + tenNhanVien);
        System.out.println("HeSoLuong: " + heSoLuong);
        System.out.println("Luong: " + tinhLuong());

    }
}
