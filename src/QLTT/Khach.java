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

    public class Khach extends Nguoi 
{
    String maKhach;
    int soCMT;

    public Khach()
    {
//    this.maKhach = " ";
//    this.soCMT = 0;
    
    }

    public Khach(String maKhach, int soCMT, String hoTen, int namSinh, String gioiTinh) {
        super(hoTen, namSinh, gioiTinh);
        this.maKhach = maKhach;
        this.soCMT = soCMT;
    }

    public String getMaKhach() {
        return maKhach;
    }

    public int getSoCMT() {
        return soCMT;
    }

    public void setMaKhach(String maKhach) {
        this.maKhach = maKhach;
    }

    public void setSoCMT(int soCMT) {
        this.soCMT = soCMT;
    }
@Override
    public void nhap()
    {
        
        System.out.print("Nhập mã khách: ");
        maKhach = sc.nextLine();
        super.nhap();
        System.out.print("Nhập số chứng minh thư: ");
        soCMT = sc.nextInt();
    }

    @Override
    public String toString()
    {
        return this.getMaKhach() + " |" + super.toString() + " | " + this.getSoCMT()+"\n";
    }

    
}
