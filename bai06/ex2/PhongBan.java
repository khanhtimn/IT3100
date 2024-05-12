/**
 * • Viết mã nguồn cho lớp PhongBan với các thuộc tính và phương thức như biểu đồ trên cùng phương thức khởi tạo với số lượng tham số cần thiết, biết rằng:
 * Việc thêm/xóa nhân viên được thực hiện theo cơ chế của stack
 * • tongLuong() trả về tổng lương của các nhân viên trong phòng.
 * •inTTin() hiển thị thông tin của phòng và thông tin của các nhân viên trong phòng.
 * PhongBan
 * -tenPhongBan: String
 * -soNhanVien: byte
 * +SO NV MAX: byte = 100
 * +themNV(NhanVien):boolean
 * +xoaNV():NhanVien
 * +tongLuong () : double
 * +inTTin ()

 */
package bai06.ex2;


//import java.util.Stack;
//import java.util.List;
//import java.util.ArrayList;

public class PhongBan {
    public String tenPhongBan;
    public byte soNhanVien;
    public static final byte SO_NV_MAX = 100;
    public NhanVien[] nhanViens = new NhanVien[SO_NV_MAX];

    public PhongBan(String tenPhongBan, byte soNhanVien){
        this.tenPhongBan = tenPhongBan;
        this.soNhanVien = soNhanVien;

    }
    public PhongBan(){
        this("", (byte)0);
    }


    // Việc thêm/xóa nhân viên được thực hiện theo cơ chế của stack
    public boolean themNV(NhanVien nhanVien){
        if(soNhanVien < SO_NV_MAX){
            nhanViens[soNhanVien] = nhanVien;
            soNhanVien++;
            return true;
        }
        return false;
    }
    public NhanVien xoaNV(){
        if(soNhanVien > 0){
            soNhanVien--;
            return nhanViens[soNhanVien];
        }
        return null;
    }

    public double tongLuong(){
        double tongLuong = 0;
        for(int i = 0; i < soNhanVien; i++){
            tongLuong += nhanViens[i].tinhLuong();
        }
    }
    public void inTTin(){
        System.out.println("TenPhongBan: " + tenPhongBan);
        System.out.println("SoNhanVien: " + soNhanVien);
        for(int i = 0; i < soNhanVien; i++){
            nhanViens[i].inTTin();
        }
    }


}
