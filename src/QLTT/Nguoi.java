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
public class Nguoi {
    protected String hoTen;
    protected int namSinh;
    protected String gioiTinh;
    Scanner sc;

    public Nguoi() {
        this.sc = new Scanner(System.in);
    }

    public Nguoi(String hoTen, int namSinh, String gioiTinh) {
        this.sc = new Scanner(System.in);
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
//        this.sc = sc;

    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    
    public void nhap() {
        System.out.print("Nhập họ tên: ");
        this.hoTen = this.sc.nextLine();
        System.out.print("Nhập năm sinh: ");
        this.namSinh = this.sc.nextInt();
        System.out.print("Nhập giới tính: ");
        this.sc.nextLine();
        this.gioiTinh = this.sc.nextLine();
        
    }

    @Override
    public String toString() {
        String var10000 = this.getHoTen();
        return var10000 + " | " + this.getNamSinh() + " |" + this.getGioiTinh()+"\n";
    }
    
}