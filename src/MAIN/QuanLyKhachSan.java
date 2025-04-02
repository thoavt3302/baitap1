// ĐẶNG MẠNH TUAN -71DCHT22-71DCHT22135
//  NGUYEN TRUNG VAN - 71DCHT22 - 71DCHT22140
// VU THI THOA - 71DCHT22 - 71DCHT22120
//
//

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAIN;

import java.util.Scanner;

/**
 *
 * @author thoa
 */
import QLKS.QuanLyKhach;
import QLKS.QuanLyThuePhong;
import QLKS.QuanLyPhong;
import QLKS.QuanLyLeTan;
import QLTT.LeTan;
import QLTT.Nguoi;
import QLTT.ThuePhong;

public class QuanLyKhachSan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//  
        QuanLyPhong quanLyPhong = new QuanLyPhong();
        QuanLyKhach quanLyKhach = new QuanLyKhach();
        QuanLyLeTan quanLyLeTan = new QuanLyLeTan();
        QuanLyThuePhong quanLyThuePhong = new QuanLyThuePhong();
        int x;
        do {
            System.out.println("----------Quản lý Khách Sạn---------");
            System.out.println("1. Quản lý Phòng");
            System.out.println("2. Quản lý Khách");
            System.out.println("3. Quản lý Lễ Tân");
            System.out.println("4. Quản lý Thuê Phòng");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng : ");
            x = sc.nextInt();
            switch (x) {
                case 1 ->
                    quanLyPhong.chonchucnang();
                case 2 ->
                    quanLyKhach.chonchucnang();
                case 3 ->
                    quanLyLeTan.chonchucnang();
                case 4 ->
                    quanLyThuePhong.chonchucnang();
                case 0 ->
                    System.out.println("Kết thúc!");
                default ->
                    System.out.println("Vui lòng chọn chức năng: ");
            }
        } while (x != 0);
    }
//            Nguoi ng;
//        ng = new Nguoi();
//        ng.nhap();
//        ng = new LeTan();
//        ng.nhap();
//        ng= new Phong();
//        ng.nhap();
//        ng = new ThuePhong();
//        ng.nhap();
//        ng = new Khach();
//        ng.nhap();

}
