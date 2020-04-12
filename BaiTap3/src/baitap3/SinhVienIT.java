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
public class SinhVienIT extends SinhVienPoly {
    // thuoc tinh
    public double diemJava;
    public double diemCss;
    public double diemHtml;

    // ham SinhVienIT
    public SinhVienIT(String hoTen, String nganhHoc, double diemJava, double diemCss, double diemHtml)
    {
        super(hoTen, nganhHoc);
        this.diemJava=diemJava;
        this.diemCss=diemCss;
        this.diemHtml=diemHtml;
    }

    // defined abstract method
    @Override
    public double getDiem() {
      return (2 * this.diemJava + this.diemHtml + this.diemCss) / 4;
    };
}
