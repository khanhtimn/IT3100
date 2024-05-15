package bai06.ex2;



public class Test {
    public static void main(String[] args) {

        PhongBan phongBan = new PhongBan("Phong A", (byte) 3);
        for (int i = 0; i < phongBan.soNhanVien; i++){
            NhanVien nhanVien = new NhanVien(NameGen.NameGenerator.generateRandomName(), 2.5);
            phongBan.themNV(nhanVien);
        }
        for (int i = 0; i < phongBan.soNhanVien; i++){
            System.out.println("Thong tin nhan vien thu " + (i+1) + ":");
            phongBan.nhanViens[i].inTTin();
        }
        System.out.println("Thong tin phong ban:");
        phongBan.inTTin();

//        NhanVien nhanVien = new NhanVien (NameGen.NameGenerator.generateRandomName(), 2.5);
//        System.out.println("Thong tin nhan vien:");
//        nhanVien.inTTin();


       

    }

}
