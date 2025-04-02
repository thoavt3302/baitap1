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
public class Phong  {
    private String loaiPhong;
    private String soPhong;
    private String giaTien;
    private int soluong;

    Scanner sc;

    public Phong() {
        this.sc = new Scanner(System.in);
    }

    public Phong(String loaiPhong, String soPhong, String giaTien, int soluong) {
        this.sc = new Scanner(System.in);
        this.loaiPhong = loaiPhong;
        this.soPhong = soPhong;
        this.giaTien = giaTien;
        this.soluong = soluong;

    }

    public void nhap() {
        System.out.print("Nhập loại phòng : ");
        this.loaiPhong = this.sc.nextLine();
        System.out.print("Nhập số phòng: ");
        this.soPhong = this.sc.nextLine();
        System.out.print("Nhập giá tiền : ");
        this.giaTien = this.sc.nextLine();

        do {
            System.out.print("Nhập số lượng phòng : ");
            this.soluong = this.sc.nextInt();
        } while(this.soluong <= 0);

    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public void setSoPhong(String soPhong) {
        this.soPhong = soPhong;
    }

    public void setGiaTien(String giaTien) {
        this.giaTien = giaTien;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getLoaiPhong() {
        return this.loaiPhong;
    }

    public String getSoPhong() {
        return this.soPhong;
    }

    public String getGiaTien() {
        return this.giaTien;
    }

    public int getSoluong() {
        return this.soluong;
    }

    @Override
    public String toString() {
        String var10000 = this.getLoaiPhong();
        return var10000 +"loai phong"+this.loaiPhong+"\n"+ " so phong: " + this.getSoPhong() +"\n" +" gia tien:  " + this.getGiaTien() + "\n"+" so lương: " + this.getSoluong() + "\n";
    }

}
