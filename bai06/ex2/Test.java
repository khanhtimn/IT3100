package bai06.ex2;



public class Test {
    public static void main(String[] args) {

        PhongBan phongBan = new PhongBan("Phong A", (byte) 3);

        for (int i = 0; i < phongBan.soNhanVien; i++){
            NhanVien nhanVien = new NhanVien(NameGenerator.NameGenerator.generateRandomName(), 2.5);
            phongBan.themNV(nhanVien);
        }
        System.out.println("Thong tin phong ban:");
        phongBan.inTTin();

        for (int i = 0; i < phongBan.soNhanVien; i++){
            System.out.println("Thong tin nhan vien thu " + (i+1) + ":");
            phongBan.nhanViens[i].inTTin();
        }



       

    }

}
