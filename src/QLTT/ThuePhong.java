/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTT;

import java.util.Scanner;

/**
 *
 * @author thoa
 */
public class ThuePhong {

    protected String loaiPhong;
    protected String tenKhachHang;
    protected String soPhong;
    protected String leTan;
    protected String ngayThue;
    protected String ngayDi;
    protected String giaTien;

    public ThuePhong() {
    }

    public ThuePhong(String loaiPhong, String tenKhachHang, String soPhong, String leTan, String ngayThue, String ngayDi, String giaTien) {
        this.loaiPhong = loaiPhong;
        this.tenKhachHang = tenKhachHang;
        this.soPhong = soPhong;
        this.leTan = leTan;
        this.ngayThue = ngayThue;
        this.ngayDi = ngayDi;
        this.giaTien = giaTien;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public void setSoPhong(String soPhong) {
        this.soPhong = soPhong;
    }

    public void setLeTan(String leTan) {
        this.leTan = leTan;
    }

    public void setGiaTien(String giaTien) {
        this.giaTien = giaTien;
    }

    public void setNgayThue(String ngayThue) {
        this.ngayThue = ngayThue;
    }

    public void setNgayDi(String ngayDi) {
        this.ngayDi = ngayDi;
    }

    public String getLoaiPhong() {
        return this.loaiPhong;
    }

    public String getTenKhachHang() {
        return this.tenKhachHang;
    }

    public String getSoPhong() {
        return this.soPhong;
    }

    public String getLeTan() {
        return this.leTan;
    }

    public String getGiaTien() {
        return this.giaTien;
    }

    public String getNgayThue() {
        return this.ngayThue;
    }

    public String getNgayDi() {
        return this.ngayDi;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập loại phòng cần thuê: ");
        this.loaiPhong = sc.nextLine();
        System.out.print("Nhập tên khách hàng: ");
        this.tenKhachHang = sc.nextLine();
        System.out.print("Nhập nhập số phòng: ");
        this.soPhong = sc.nextLine();
        System.out.print("Nhập tên lễ tân: ");
        this.leTan = sc.nextLine();
        System.out.print("Nhập giá phòng: ");
        this.giaTien = sc.nextLine();
        System.out.print("Nhập ngày thuê: ");
        this.ngayThue = sc.nextLine();
        System.out.print("Nhập ngày trả phòng dự kiến: ");
        this.ngayDi = sc.nextLine();
    }

    @Override
    public String toString() {
        String var10000 = this.getLoaiPhong();
        return var10000 + " \n " + this.getTenKhachHang() + " \n " + this.getSoPhong() + " \n " + this.getGiaTien() + " \n " + this.getNgayThue() + " \n " + this.getNgayDi() + " \n" + this.getLeTan()+"\n";
    }
//    public static void main(String[] args) {
//            ThuePhong tp = new ThuePhong();
//            tp.nhap();
//    }

}
