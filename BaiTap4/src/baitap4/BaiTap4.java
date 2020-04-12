/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

/**
 *
 * @author Admin
 */
public class BaiTap4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         QuanLyChuyenXe qlcx = new QuanLyChuyenXe();

        // create chuyen xe noi thanh
        ChuyenXe xeNoiThanh1 = new ChuyenXeNoiThanh(1, "Nguyen Van A", "79A-1234", 20000000, "Nha Trang - Ninh Hoa", 34);
        ChuyenXe xeNoiThanh2 = new ChuyenXeNoiThanh(2, "Nguyen Van B", "79A-1235", 21000000, "Nha Trang - Cam Ranh", 40);
        ChuyenXe xeNoiThanh3 = new ChuyenXeNoiThanh(3, "Nguyen Van C", "79A-1236", 22000000, "Nha Trang - Dien Khanh", 28);

        // them chuyen xe vao qlChuyenXe
        qlcx.themChuyenXe(xeNoiThanh1);
        qlcx.themChuyenXe(xeNoiThanh2);
        qlcx.themChuyenXe(xeNoiThanh3);

        // create chuyen xe ngoai thanh
        ChuyenXe xeNgoaiThanh1 = new ChuyenXeNgoaiThanh(4, "Tran Thanh Hai", "79A-100.00", 30000000, "Nha Trang - Da Lat", 1);
        ChuyenXe xeNgoaiThanh2 = new ChuyenXeNgoaiThanh(5, "Nguyen Quoc Huy", "51A-888.88", 31000000, "Sai Gon - Binh Duong", 1);
        ChuyenXe xeNgoaiThanh3 = new ChuyenXeNgoaiThanh(6, "Le Van Bao", "47A-123.45", 32000000, "Daklak - Long An", 1);

        // them chuyen xe vao qlChuyenXe
        qlcx.themChuyenXe(xeNgoaiThanh1);
        qlcx.themChuyenXe(xeNgoaiThanh2);
        qlcx.themChuyenXe(xeNgoaiThanh3);

        // in thong tin cac chuyen xe
        qlcx.inThongTin();

        // tong doanh thu xe noi thanh
        System.out.printf("\nTong doanh thu noi thanh: " , qlcx.tongDoanhThuNoiThanh());

        // tong doanh thu xe ngoai thanh
        System.out.printf("Tong oanh thu ngoai thanh: ", qlcx.tongDoanhThuNgoaiThanh());

        // tong doanh thu
        System.out.printf("Tong doanh thu: ", qlcx.tongDoanhThu());
    
    }
    
}
