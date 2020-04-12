/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
// nhap cac thuoc tinh nhan vien
public class NhanVien {
    private String ten;
    private String tuoi;
    private String diachi;
    private double luong;
    private int tongsogiolam;
    NhanVien(){
        ten = "Tran Thanh Hai";
        tuoi = "21";
        diachi = "Nha Trang";
        luong = 1000;
        tongsogiolam = 200;
    }
    
    public NhanVien(String ten, String tuoi, String diachi, double luong, int tongsogiolam){
        this.ten= ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.luong = luong;
        this.tongsogiolam = tongsogiolam;
    }
    
  // get/set cac tham so ten, tuoi, dia chi, luong, so gio lam viec.  
    String getTen(){
        return ten;
    }
    void setTen(String ten)
    {
        this.ten = ten;
    }
    
    String getTuoi()
    {
        return tuoi;
    }
    void setTuoi(String tuoi)
    {
        this.tuoi = tuoi;
    }
        
    String getDiachi()
    {
        return diachi;
    }
    void setDiachi()
    {
        this.diachi = diachi;
    }
    
    double getLuong()
    {
        return luong;
    }
    void setLuong(double luong)
    {
        this.luong = luong;
    }
    
    int getTongsogiolam()
    {
        return tongsogiolam;
    }
    void setTongsogiolam()
    {
        this.tongsogiolam=tongsogiolam;
    }
    
    void InputThongtin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten nhan vien: ");
        ten = sc.nextLine();
        System.out.print("Tuoi nhan vien: ");
        tuoi = sc.nextLine();
        System.out.print("Dia chi nhan vien: ");
        diachi = sc.nextLine();
        System.out.print("Luong nhan vien: ");
        luong = sc.nextDouble();
        System.out.print("So gio lam viec cua nhan vien: ");
        tongsogiolam = sc.nextInt();
    }
    
    void PrintThongTin()
    {
        System.out.println("Thong tin chi tiet nhan vien: ");
        System.out.println("Ten nhan vien: "+ten);
        System.out.println("Tuoi nhan vien: "+tuoi);
        System.out.println("Dia chi nhan vien: "+diachi);
        System.out.println("Luong nhan vien: "+luong);
        System.out.println("So gio lam viec cua nhan vien: "+tongsogiolam);
        System.out.println("Thuong: "+tinhThuong());
        System.out.println("Tong tien luong: "+(luong+tinhThuong()));
    }
    
    double tinhThuong()
    {
        double thuong;
        if(tongsogiolam>200)
        thuong = luong*0.2;
        else if(tongsogiolam>=100 && tongsogiolam<200)
            thuong = luong*0.1;
        else 
        thuong =0;
        return thuong;
    }
}


