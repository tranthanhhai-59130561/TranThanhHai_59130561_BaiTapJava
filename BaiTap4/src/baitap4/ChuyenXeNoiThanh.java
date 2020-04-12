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
public class ChuyenXeNoiThanh extends ChuyenXe {
    public String soTuyen;
    public double soKm;
    
    public ChuyenXeNoiThanh(int maChuyen, String taiXe, String soXe, double doanhThu, String soTuyen, double soKm)
    {
        super(maChuyen,taiXe,soXe,doanhThu);
        this.soTuyen=soTuyen;
        this.soKm=soKm;
    }
    
    public void InThongTinChuyenXe()
    {
        super.InThongTinChuyenXe();
        System.out.println("So tuyen: "+this.soTuyen);
        System.out.println("So km: "+this.soKm);
    }
}
