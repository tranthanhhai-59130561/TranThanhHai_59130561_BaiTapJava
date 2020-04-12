/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author Admin
 */
public abstract class SinhVienPoly {
    public String hoTen;
    public String nganhHoc;
    
    public SinhVienPoly(String hoTen, String nganhHoc)
    {
        this.hoTen= hoTen;
        this.nganhHoc= nganhHoc;
    }
    
    public abstract double getDiem();
    
    public String getHocLuc()
    {
        if(this.getDiem()<5)
        {
            return "Yeu"; 
        }
            
        if(this.getDiem()<6.5)
        {
            return "Trung Binh";
        }
        if(this.getDiem()<7.5)
        {
            return "Kha";
        }
            
        if(this.getDiem()<9)
        {
            return "Gioi";
        }        
        else 
            return "Xuat sac";
    }
    public void xuat() {
       System.out.println("Ho ten: " + this.hoTen + ", nganh hoc: " + this.nganhHoc);
     }
}
