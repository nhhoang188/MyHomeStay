package model;

import java.util.Date;

public class Booking {
   private int idPhong, trangThai, soNguoi, soPhong, iduser, idhomestay;
   private String tenNguoiDat, tenHomeStay;
   private double thanhToan;
   private String ngayDen, ngayDi;

    public Booking(int soNguoi, int soPhong, int iduser, int idhomestay, String ngayDen, String ngayDi) {
        this.soNguoi = soNguoi;
        this.soPhong = soPhong;
        this.iduser = iduser;
        this.idhomestay = idhomestay;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public int getIdhomestay() {
        return idhomestay;
    }

    public void setIdhomestay(int idhomestay) {
        this.idhomestay = idhomestay;
    }

    public Booking() {
    }

    public Booking(int idPhong, int trangThai, int soNguoi, int soPhong, int iduser, int idhomestay, double thanhToan, String ngayDen, String ngayDi) {
        this.idPhong = idPhong;
        this.trangThai = trangThai;
        this.soNguoi = soNguoi;
        this.soPhong = soPhong;
        this.iduser = iduser;
        this.idhomestay = idhomestay;
        this.thanhToan = thanhToan;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
    }

    public Booking( int trangThai, int soNguoi, int soPhong, String tenNguoiDat, String tenHomeStay, String ngayDen, String ngayDi, double thanhToan) {
        this.idPhong = idPhong;
        this.trangThai = trangThai;
        this.soNguoi = soNguoi;
        this.soPhong = soPhong;
        this.tenNguoiDat = tenNguoiDat;
        this.tenHomeStay = tenHomeStay;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
        this.thanhToan = thanhToan;
    }

    public int getIdPhong() {
        return idPhong;
    }

    public void setIdPhong(int idPhong) {
        this.idPhong = idPhong;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public int getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(int soPhong) {
        this.soPhong = soPhong;
    }

    public String getTenNguoiDat() {
        return tenNguoiDat;
    }

    public void setTenNguoiDat(String tenNguoiDat) {
        this.tenNguoiDat = tenNguoiDat;
    }

    public String getTenHomeStay() {
        return tenHomeStay;
    }

    public void setTenHomeStay(String tenHomeStay) {
        this.tenHomeStay = tenHomeStay;
    }

    public String getNgayDen() {
        return ngayDen;
    }

    public void setNgayDen(String ngayDen) {
        this.ngayDen = ngayDen;
    }

    public String getNgayDi() {
        return ngayDi;
    }

    public void setNgayDi(String ngayDi) {
        this.ngayDi = ngayDi;
    }

    public double getThanhToan() {
        return thanhToan;
    }

    public void setThanhToan(double thanhToan) {
        this.thanhToan = thanhToan;
    }
}
