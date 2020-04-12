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
public class BaiTap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVienPoly poly = new SinhVienIT("Tran Thanh Hai","CNTT",7,7,9);
        SinhVienIT it = new SinhVienIT("Nguyen Quang Minh", "CNTT", 9, 9, 4);
        SinhVienBiz biz = new SinhVienBiz("Pham Minh Quan", "Marketing", 10, 9);
        
        // Xuat  điểm, học lực của 3 hoc sinh ra màn hình.
        poly.xuat();
        System.out.println("Diem:" + poly.getDiem());
        System.out.println("Hoc luc:" + poly.getHocLuc());
        it.xuat();
        System.out.println("Diem:" + it.getDiem());
        System.out.println("Hoc luc:" + it.getHocLuc());
        biz.xuat();
        System.out.println("Diem:" + biz.getDiem());
        System.out.println("Hoc luc:" + biz.getHocLuc());
           
    }
    
}
