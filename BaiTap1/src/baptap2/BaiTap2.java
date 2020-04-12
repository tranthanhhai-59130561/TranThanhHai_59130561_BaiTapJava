/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baptap2;

import baitap1.NhanVien;
/**
 *
 * @author Admin
 */

public class BaiTap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     IQuanLy qlnv = new QuanLyNhanVien();
         
    NhanVien nv1 = new NhanVien();
    nv1.setTen("Tran Linh Hoa");
    nv1.setTuoi("22");
    nv1.setDiachi("Da Lat - Lam Dong");
    nv1.setLuong(100000);
    nv1.setTongsogiolam(120);

    NhanVien nv2 = new NhanVien();
    nv2.setTen("Tran Thanh Hai");
    nv2.setTuoi("20");
    nv2.setDiachi("Nha Trang - Khanh Hoa");
    nv2.setLuong(100000);
    nv2.setTongsogiolam(120);
    
    NhanVien nv3 = new NhanVien();
    nv3.setTen("Nguyen Quoc Huy");
    nv3.setTuoi("23");
    nv3.setDiachi("Ninh Hoa - Khanh Hoa");
    nv3.setLuong(10000);
    nv3.setTongsogiolam(108);

    // create nhan vien
    NhanVien nv4 = new NhanVien();
    nv4.setTen("Le Van Luong");
    nv4.setTuoi("19");
    nv4.setDiachi("Tuy Hoa - Phu Yen");
    nv4.setLuong(180000);
    nv4.setTongsogiolam(110);

    // create nhan vien
    NhanVien nv5 = new NhanVien();
    nv5.setTen("Phan Huy Nam");
    nv5.setTuoi("27");
    nv5.setDiachi("Dien Khanh - Khanh Hoa");
    nv5.setLuong(15000);
    nv5.setTongsogiolam(120);


    // add nhan vien list vao qlNhanVien
    qlNhanVien.them(nv1);
    qlNhanVien.them(nv2);
    qlNhanVien.them(nv3);
    qlNhanVien.them(nv4);
    qlNhanVien.them(nv5);

    // in danh sach nhan vie
    qlnv.inDS();
    }
}



