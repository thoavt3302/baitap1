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
public class LeTan extends Nguoi  {
    private String maLeTan;

    public LeTan() {
    }

    public LeTan(String maLeTan, String hoTen, int namSinh, String gioiTinh) {
        super(hoTen, namSinh, gioiTinh);
        this.maLeTan = maLeTan;
    }

   
    

    public String getMaLeTan() {
        return this.maLeTan;
    }

    public void setMaLeTan(String maLeTan) {
        this.maLeTan = maLeTan;
    }
    @Override
    public void nhap() {
        System.out.print("Nhập mã lễ tân: ");
        this.maLeTan = this.sc.nextLine();
        super.nhap();
    }

    @Override
    public String toString() {
        String var10000 = this.getMaLeTan();
        return var10000 + " | " + super.toString();
    }

   
}
