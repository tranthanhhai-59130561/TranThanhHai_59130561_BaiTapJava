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
public abstract class ChuyenXe {
    public int maChuyen;
    public String taiXe;
    public String soXe;
    public double doanhThu;
    
    public ChuyenXe(int maChuyen, String taiXe, String soXe, double doanhThu)
    {
        this.maChuyen= maChuyen;
        this.taiXe = taiXe;
        this.soXe=soXe;
        this.doanhThu=doanhThu;
    }
    
    public void InThongTinChuyenXe()
    {
        System.out.println("Ma chuyen xe: "+this.maChuyen);
        System.out.println("Tai xe: "+this.taiXe);
        System.out.println("So xe: "+this.soXe);
        System.out.println("Doanh thu: "+this.doanhThu);
    }
}
