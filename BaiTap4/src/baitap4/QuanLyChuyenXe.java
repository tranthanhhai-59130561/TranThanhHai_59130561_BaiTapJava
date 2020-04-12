/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public  class QuanLyChuyenXe {
     public ArrayList<ChuyenXe> dsChuyenXe = new ArrayList<>();

    // methods
    // them chuyen xe
    public void themChuyenXe(ChuyenXe cx) {
      dsChuyenXe.add(cx);
    }

    // Xuat danh sach chuyen xe
    public ArrayList<ChuyenXe> xuatDsChuyenXe() {
      return dsChuyenXe;
    }

    // Xuat thong tin chuyen xe
    public void inThongTin() {
      dsChuyenXe.forEach(cx -> cx.InThongTinChuyenXe());
    }

    // tinh tong doanh thu xe noi thanh
    public double tongDoanhThuNoiThanh() {
      double doanhThu = 0;
      for (ChuyenXe cx : dsChuyenXe) {
        if (cx instanceof ChuyenXeNoiThanh) {
          doanhThu += cx.doanhThu;
        }
      }
      return doanhThu;
    }

    // tinh tong doanh thu xe ngoai thanh
    public double tongDoanhThuNgoaiThanh() {
      double doanhThu = 0;
      for (ChuyenXe cx : dsChuyenXe) {
        if (cx instanceof ChuyenXeNgoaiThanh) {
          doanhThu += cx.doanhThu;
        }
      }
      return doanhThu;
    }

    // tinh tong doanh thu
    public double tongDoanhThu() {
      double doanhThu = 0;
      for (ChuyenXe cx : dsChuyenXe) {
        doanhThu += cx.doanhThu;
      }
      return doanhThu;
    }
}
