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
public class ChuyenXeNgoaiThanh extends ChuyenXe {
    // attributes
    public String noiDen;
    public int soNgay;
  
    // constructor
    public ChuyenXeNgoaiThanh(int maChuyen,String taiXe, String soXe, double doanhThu, String noiDen, int soNgay)
    {
        super(maChuyen, taiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgay= soNgay;
    }

    // methods
    // in thong tin chuyen xe
    public void InThongTinChuyenXe(){
        super.InThongTinChuyenXe();
        System.out.println("Noi den: "+this.noiDen);
        System.out.println("So ngay: "+this.soNgay);
    }
}
